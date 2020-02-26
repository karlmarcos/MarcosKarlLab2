package com.lab2;

public class CCTV {
	private int storage;
	private String type;
	private int record;
	
		public CCTV() {
			
		}
		
			public CCTV (int storage, String type) {
				this.storage = storage;
				this.type = type;
				
			}
			
			public void setstorage(int storage) {	
			}
			
			public void settype(String type) {
			}
			
			public int getstorage(int storage) {
				return this.storage;
			}
			
			public String gettype(String type) {
				return this.type;
			}
			
				public int setrecord(int record) {
					return this.record = record;
				}
			
				public int getrecord() {
					return this.record;
				}	

}

