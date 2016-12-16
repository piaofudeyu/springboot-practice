/**
 * Project Name:ws
 * Package Name:cn.stackbox.demo.config
 * Date: 2016-12-15 20:49
 */
package cn.stackbox.demo.config;

import cn.stackbox.demo.handler.CustomTextWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * ClassName: WebSocketServerConfiguration <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-15 20:49
 *
 * @author SRK.Lyu
 */

@Configuration
@EnableWebSocket
public class WebSocketServerConfiguration implements WebSocketConfigurer {

    @Autowired
    private CustomTextWebSocketHandler customTextWebSocketHandler;


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(customTextWebSocketHandler, "/ws");
    }

}
