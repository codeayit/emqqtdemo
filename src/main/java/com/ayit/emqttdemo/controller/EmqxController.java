package com.ayit.emqttdemo.controller;



import com.ayit.emqttdemo.emqx.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmqxController {


    @Autowired
    MqttGateway mqttGateway;

    @RequestMapping("/say")
    public String say(@RequestParam(name = "topic",required = false,defaultValue = "topic_out") String topic,@RequestParam(name = "msg",required = false,defaultValue = "from server mqtt") String msg){


        mqttGateway.sendToMqtt(topic,1,msg);
        return "emqx demo";
    }

    @RequestMapping(value = "/emqwebhook")
    public void  emqwebhook(@RequestBody String ps){
        mqttGateway.sendToMqtt("topic_out",1,ps);
        System.out.println(ps);
    }
}
