/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.config
 * Date: 2016-12-08 23:14
 */
package cn.stackbox.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * ClassName: SecurityConfig <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:14
 *
 * @author SRK.Lyu
 */
@Configuration
@EnableWebSecurity
@Order(-1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
