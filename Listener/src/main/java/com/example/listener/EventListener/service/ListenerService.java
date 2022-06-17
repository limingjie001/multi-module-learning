package com.example.listener.EventListener.service;

import com.example.listener.EventListener.domain.Huyonghao;
import com.example.listener.EventListener.event.HuyonghaoEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * 功能描述：方法二：使用注解
 * </pre>
 *
 * @author: 李明杰
 * @date: 2022/6/13 10:38
 */
@Service
@Slf4j
public class ListenerService {

    // 一些其他的方法...

    @EventListener(classes = {HuyonghaoEvent.class}, condition = "")
    @Async //异步监听
    @Order(0)//使用order指定（监听的优先级）顺序，越小优先级越高
    public void listen(HuyonghaoEvent event) {
//        如果要监听多个事件类型的发布，方法参数不能有多个，否则会发生转换异常，
//        可以将使用多个事件的父类作为唯一的方法参数来接收处理事件，
//        但除非必要否则并不推荐监听多个事件的发布。
        log.error("监听到我这个成功了");
        Huyonghao huyonghao = (Huyonghao) event.getSource();
        log.error("我是谁：" + huyonghao.getName() + ", 我多大了" + huyonghao.getAge());

    }
}

