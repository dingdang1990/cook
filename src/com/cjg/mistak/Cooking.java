package com.cjg.mistak;

public class Cooking {

	public static void main(String argv[]){
		Thread mother = new Thread(new Mother());
		mother.start();
	}
}
