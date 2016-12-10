/**
 * Project Name:cache
 * Package Name:cn.stackbox.demo.service
 * Date: 2016-12-10 11:51
 */
package cn.stackbox.demo.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

/**
 * ClassName: BizService <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-10 11:51
 *
 * @author SRK.Lyu
 */
public interface BizService {

    @Cacheable(value = "20SecsInfoCache", key = "'biz-cache1'")
    public String fetchCurrentTime();

    @Cacheable(value = "20SecsInfoCache", key = "'biz-cache1'", cacheManager = "appRedisCacheManager")
    public String fetchCurrentTimeWithRedisCache();

    @Cacheable(value = "10SecsInfoCache", keyGenerator = "boxKeyGenerator")
    public String fetchCurrentTimeWithKeyGenerator();

    @CacheEvict(value = "20SecsInfoCache", key = "'biz-cache1'")
    public String refreshCache();

    @Caching(evict = {
            @CacheEvict(value = "20SecsInfoCache", allEntries = true, cacheManager = "appRedisCacheManager"),
            @CacheEvict(value = "10SecsInfoCache", allEntries = true, cacheManager = "appRedisCacheManager"),
            @CacheEvict(value = "20SecsInfoCache", allEntries = true, cacheManager = "appEhCacheCacheManager"),
            @CacheEvict(value = "10SecsInfoCache", allEntries = true, cacheManager = "appEhCacheCacheManager")
    })
    public String refreshAll();

}
