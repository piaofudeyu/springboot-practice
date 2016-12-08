/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.controller
 * Date: 2016-12-08 23:54
 */
package cn.stackbox.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: MainController <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:54
 *
 * @author SRK.Lyu
 */
@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String main(){
        return "main";
    }
}
