package com.cjg.mistak;

public class Mother implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("妈妈准备做红烧鱼");
		System.out.println("酱油奇迹般没有了～～～～");
		System.out.println("儿子，出去打酱油，快！");
		// 新建一个儿子线程
		Thread son = new Thread(new Son());
		// 启动儿子线程
		son.start();
		// 重新开始做饭
		System.out.println("妈妈准再次开始做红烧鱼");
		System.out.println("红烧鱼出锅～～");

	}

}
