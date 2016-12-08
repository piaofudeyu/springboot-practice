/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.util
 * Date: 2016-12-08 23:16
 */
package cn.stackbox.demo.util;

import cn.stackbox.demo.common.consts.Const;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * ClassName: EncodeUtil <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:16
 *
 * @author SRK.Lyu
 */
public class EncodeUtil {

    /**
     * Standard password encoder
     */
    public static final StandardPasswordEncoder pwdEncoder = new StandardPasswordEncoder(Const.cryptSecret);

}
