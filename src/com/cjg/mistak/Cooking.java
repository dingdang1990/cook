package com.cjg.mistak;

public class Cooking {
	//测试git@201504

	public static void main(String argv[]){
		Thread mother = new Thread(new Mother());
		mother.start();
	}
}
