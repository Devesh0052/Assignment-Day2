package com.tv_interface.app;

public class TvMain {

	public static void main(String[] args) {
		
		BplTv b= new BplTv();
		System.out.println(b.color());
		
		SonyTv s = new SonyTv();
		System.out.println(s.height());
		
		PanasonicTv p = new PanasonicTv();
		System.out.println(p.width());

	}

}
