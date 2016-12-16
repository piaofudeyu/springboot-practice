/**
 * Project Name:ws
 * Package Name:cn.stackbox.demo.handler
 * Date: 2016-12-15 21:05
 */
package cn.stackbox.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * ClassName: CustomTextWebSocketHandler <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-15 21:05
 *
 * @author SRK.Lyu
 */
@Component
public class CustomTextWebSocketHandler extends TextWebSocketHandler {


    private static Logger LOG = LoggerFactory.getLogger(CustomTextWebSocketHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        LOG.info("socket connected");
        session.sendMessage(new TextMessage("SIMPLE TEXT"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);


    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        super.handlePongMessage(session, message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        super.handleTransportError(session, exception);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        LOG.info("socket closed");
    }


}
