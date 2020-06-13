package com.niubi.webchat.controller;

import com.niubi.webchat.constant.Constant;
import com.niubi.webchat.model.WiselyMessage;
import com.niubi.webchat.model.WiselyResponse;
import com.niubi.webchat.service.WebSocketService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName WsController
 * @Author laixiaoxing
 * @Date 2020/6/13 上午11:52
 * @Description TODO
 * @Version 1.0
 */
@Controller
public class WsController {
    @Resource
    WebSocketService webSocketService;

    HashMap<String, String> user = new HashMap<>();

    @MessageMapping(Constant.FORETOSERVERPATH)//@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @SendTo(Constant.PRODUCERPATH)//如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    public WiselyResponse say(WiselyMessage message) throws Exception {
        if (user.get(message.getName()) == null) {
            user.put(message.getName(), "");
            return new WiselyResponse("欢迎👏, " + message.getName() + "加入聊天室!  来自" + message.getName() + "的发言:" + message.getMassage());
        } else {
            return new WiselyResponse("来自" + message.getName() + "的发言:" + message.getMassage());
        }
        //        List<String> users =new ArrayList<>();
        //        users.add(message.getName());//此处写死只是为了方便测试,此值需要对应页面中订阅个人消息的userId
        //        webSocketService.send2Users(users, new WiselyResponse("Welcome,"+message.getName()+" hello"));
        //
    }
}
