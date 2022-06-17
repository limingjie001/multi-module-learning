package com.example.listener.EventListener.event;

import org.springframework.context.ApplicationEvent;

/**
 * <pre>
 * 功能描述：
 * </pre>
 *
 * @author: 李明杰
 * @date: 2022/6/13 10:58
 */
// 事件本身
public class HuyonghaoEvent extends ApplicationEvent {
    public HuyonghaoEvent(Object source) {
        super(source);
    }
}
