package com.lab2;

public class main {

	public static void main(String[] args) {
		DomeCCTV d1 = new DomeCCTV(500, "Dome");
		d1.setrecord(60);
		d1.setView(360);
		
		CCTV c1 = new CCTV(256, "Regular");
		c1.setrecord(90);
	
		System.out.println("Dome CCTV:");
		System.out.println(d1.getstorage(0) + " GB");
		System.out.println(d1.gettype("") + " Type CCTV");
		System.out.println("This CCTV can record up to " + d1.getrecord() + " Days...");
		System.out.println("This CCTV has a view angle of " + d1.getView() + " Degrees...");

		System.out.println();
		
		System.out.println("Regular CCTV:");
		System.out.println(c1.getstorage(0) + " GB");
		System.out.println(c1.gettype("") + " Type CCTV");
		System.out.println("This CCTV can record up to " + c1.getrecord() + " Days...");
}




	}

