/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.repository
 * Date: 2016-12-08 23:24
 */
package cn.stackbox.demo.repository;

import cn.stackbox.demo.entity.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * ClassName: AccountRepository <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:24
 *
 * @author SRK.Lyu
 */
public interface AccountRepository extends CrudRepository <Account, Long> {

    public Account findByEmailOrTelephoneOrUsername(String queryString);

}
