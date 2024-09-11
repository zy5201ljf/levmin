package com.levmin.springframework.common;

public class Widget {
    public synchronized void doSomething(){
        System.out.println("方法1执行！！！");
        doOther();
    }
    public synchronized void doOther(){
        System.out.println("方法2执行！！！");
    }

    public static void main(String[] args) {
        Widget widget = new Widget();
        widget.doSomething();
    }
}
