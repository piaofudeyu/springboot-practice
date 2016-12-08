/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.common.security
 * Date: 2016-12-08 23:23
 */
package cn.stackbox.demo.common.security;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ClassName: ExpandUserDetailService <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:23
 *
 * @author SRK.Lyu
 */
@Service
@Primary
public class ExpandUserDetailService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
