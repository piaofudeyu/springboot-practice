/**
 * Project Name:cache
 * Package Name:cn.stackbox.demo.config
 * Date: 2016-12-10 11:44
 */
package cn.stackbox.demo.config;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * ClassName: CacheConfig <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-10 11:44
 *
 * @author SRK.Lyu
 */
@Configuration
@EnableCaching
public class EhCacheConfig {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /*
     * 基于EhCache的cachemanager, 默认缓存机制
     */
    @Bean(name = "appEhCacheCacheManager")
    @Primary
    public CacheManager ehCacheCacheManager(EhCacheManagerFactoryBean bean){
        return new EhCacheCacheManager(bean.getObject ());
    }

    /**
     * 基于Redis的cachemanager, 可以在使用的时候手动配置来使用基于Redis的Cache
     * @return
     */
    @Bean(name = "appRedisCacheManager")
    public CacheManager cacheManager() {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);

        // Number of seconds before expiration. Defaults to unlimited (0)
        cacheManager.setDefaultExpiration(300);

        Map<String, Long> expires = Maps.newHashMap();
        expires.put("20SecsInfoCache", 20l);
        expires.put("10SecsInfoCache", 10l);

        cacheManager.setExpires(expires);
        return cacheManager;
    }


    /*
     * 据shared与否的设置,Spring决定是通过CacheManager.create()还是new CacheManager()方式来创建一个ehcache基地.
     */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        cacheManagerFactoryBean.setConfigLocation (new ClassPathResource("conf/ehcache-app.xml"));
        cacheManagerFactoryBean.setShared(true);
        return cacheManagerFactoryBean;
    }

    /**
     * spring uses keygenerator to generate cache keys
     * @return
     */
    @Bean
    public KeyGenerator boxKeyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName()).append("-");
                sb.append(method.getName()).append("-");
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }
}
