/**
 * Project Name:dba
 * Package Name:cn.stackbox.demo.controller
 * Date: 2016-12-10 18:36
 */
package cn.stackbox.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ApiController <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-10 18:36
 *
 * @author SRK.Lyu
 */
@RestController
public class ApiController {

    @GetMapping("/")
    public String main() {
        return "main";
    }
}
