package com.ayit.emqttdemo.test;


import com.ayit.emqttdemo.EmqttdemoApplicatio2;
import com.ayit.emqttdemo.emqx.MqttProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmqttdemoApplicatio2.class)//这里的Application是springboot的启动类名
@WebAppConfiguration
public class BaseTest {

    @Autowired
    MqttProperties mqttProperties;


    @Test
    public void testSend() throws Exception {
        System.out.println("test" + (mqttProperties == null));
    }
}
