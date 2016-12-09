/**
 * Project Name:session
 * Package Name:cn.stackbox.demo.controller
 * Date: 2016-12-09 22:51
 */
package cn.stackbox.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * ClassName: MainController <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-09 22:51
 *
 * @author SRK.Lyu
 */
@RestController
public class MainController {


    @GetMapping("/")
    public String uuid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");

        if (uid == null) {
            uid = UUID.randomUUID();
        }

        session.setAttribute("uid", uid);

        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            return "HostName: " + hostname + "<br/>UUID: " + uid.toString();

        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "error when get hostname";
        }
    }
}
