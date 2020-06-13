package com.niubi.webchat.model;

/**
 * @ClassName WebSocketConfig
 * @Author laixiaoxing
 * @Date 2020/6/13 上午11:47
 * @Description TODO
 * @Version 1.0
 */
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
