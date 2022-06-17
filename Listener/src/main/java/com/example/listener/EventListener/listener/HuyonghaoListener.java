package com.example.listener.EventListener.listener;

import com.example.listener.EventListener.domain.Huyonghao;
import com.example.listener.EventListener.event.HuyonghaoEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * <pre>
 * 功能描述：方法一：继承接口
 * </pre>
 *
 * @author: 李明杰
 * @date: 2022/6/13 10:57
 */
// 事件监听者
//@Component
@Slf4j
public class HuyonghaoListener implements ApplicationListener<HuyonghaoEvent> {

    @Override
    public void onApplicationEvent(HuyonghaoEvent event) {
        log.error("监听到我这个成功了");
        Huyonghao huyonghao = (Huyonghao) event.getSource();
        log.error("我是谁：" + huyonghao.getName() + ", 我多大了" + huyonghao.getAge());
    }
}
