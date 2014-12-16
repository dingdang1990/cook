package com.cjg.mistak;

public class Son implements Runnable {

	@Override
	public void run() {
		// 输出信息，儿子开始打酱油
		System.out.println("儿子出门打酱油～～");
		System.out.println("打酱油要5分钟～～");
		//
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "分钟");
			}
		} catch (InterruptedException ie) {
			System.out.println("儿子把酱油瓶子打破了！！！");
		}

		// 输出相应信息，儿子打酱油回来
		System.out.println("\n儿子打酱油归来～～");
	}

}
