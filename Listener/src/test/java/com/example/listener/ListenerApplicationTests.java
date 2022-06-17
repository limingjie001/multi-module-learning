package com.example.listener;

import com.example.listener.EventListener.domain.Huyonghao;
import com.example.listener.EventListener.event.HuyonghaoEvent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ListenerApplicationTests {

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.listener");
        Huyonghao huyonghao = new Huyonghao();
        huyonghao.setAge(26);
        huyonghao.setName("huyonghao");
        context.publishEvent(new HuyonghaoEvent(huyonghao));


    }

}
