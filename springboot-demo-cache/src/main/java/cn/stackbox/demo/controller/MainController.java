/**
 * Project Name:cache
 * Package Name:cn.stackbox.demo.controller
 * Date: 2016-12-10 11:54
 */
package cn.stackbox.demo.controller;

import cn.stackbox.demo.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MainController <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-10 11:54
 *
 * @author SRK.Lyu
 */
@RestController
@RequestMapping("/cache")
public class MainController {

    @Autowired
    private BizService bizService;

    @GetMapping("/cache1")
    public String cache1() {
        return bizService.fetchCurrentTimeWithKeyGenerator();
    }

    @GetMapping("/cache2")
    public String cache2() {
        return bizService.fetchCurrentTime();
    }

    @GetMapping("/cache3")
    public String cache3() {
        return bizService.fetchCurrentTimeWithRedisCache();
    }


    @GetMapping("/refresh")
    public String refresh() {
        return bizService.refreshCache();
    }

    @GetMapping("/refreshall")
    public String refreshAll() {
        return bizService.refreshAll();
    }
}
