package com.lab2;

public class DomeCCTV extends CCTV{
private int View;
	
	
	public DomeCCTV(int storage, String type) {
		super(storage, type);
	}
	
		public int setView(int View){
			return this.View = View;
		}
	
		public int getView() {
			return this.View;
		}
		
}
