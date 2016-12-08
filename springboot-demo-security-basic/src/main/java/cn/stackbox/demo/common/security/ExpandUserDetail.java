/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.common.security
 * Date: 2016-12-08 23:26
 */
package cn.stackbox.demo.common.security;

import cn.stackbox.demo.entity.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * ClassName: ExpanduserDetail <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:26
 *
 * @author SRK.Lyu
 */
public class ExpandUserDetail extends Account implements UserDetails {


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
