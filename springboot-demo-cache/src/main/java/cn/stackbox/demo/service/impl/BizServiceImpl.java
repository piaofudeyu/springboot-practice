/**
 * Project Name:cache
 * Package Name:cn.stackbox.demo.service.impl
 * Date: 2016-12-10 11:51
 */
package cn.stackbox.demo.service.impl;

import cn.stackbox.demo.service.BizService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ClassName: BizServiceImpl <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-10 11:51
 *
 * @author SRK.Lyu
 */
@Service
public class BizServiceImpl implements BizService {

    @Override
    public String fetchCurrentTime() {
        return (new Date()).toString();
    }

    @Override
    public String fetchCurrentTimeWithRedisCache() {
        return (new Date()).toString();
    }

    @Override
    public String refreshCache() {
        return "removed";
    }

    @Override
    public String fetchCurrentTimeWithKeyGenerator() {
        return "KeyGenerator:" + (new Date()).toString();
    }

    @Override
    public String refreshAll() {
        return "refresh all";
    }
}
