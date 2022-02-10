package main;

import temp.Store;
import temp.TradingCenter;

public class Main {
	public static void main(String args[]) {
		TradingCenter tc = new TradingCenter();
		// 1) FloorID 2) StoreID 3) Type 4) Name
		tc.addStore("0","1", "baby", "zara");
		tc.addStore("0","2","Second Hand","men");
		tc.addStore("0","3","ThirdStore", "arm-clock");
		tc.addStore("0","4","FourthStore","T-Shirt");
		tc.addStore("0","5","FifthStore","Underwear");
		tc.addStore("0","6","SixthStore","diaper");
		tc.addStore("0","7","SeventhStore","socks");
		tc.addStore("0","8","EightStore","strollers");
		tc.addStore("0","9","NineStore","strollers");
		tc.addStore("Hey YOU","bottle");
		
		tc.addStore("1","1", "WOMEN", "zara");
		tc.addStore("1","2","Second Hand","men");
		tc.addStore("1","3","ThirdStore", "arm-clock");
		tc.addStore("1","4","FourthStore","T-Shirt");
		tc.addStore("1","5","FifthStore","Underwear");
		tc.addStore("1","6","SixthStore","diaper");
		tc.addStore("1","7","SeventhStore","socks");
		tc.addStore("1","8","EightStore","strollers");
		tc.addStore("1","9","NinethStore","bottle");
		
		tc.addStore("gucci", "men");
		
		tc.addStore("2","1", "MEN", "zara");
		tc.addStore("2","2","Second Hand","men");
		tc.addStore("2","3","ThirdStore", "arm-clock");
		tc.addStore("2","4","FourthStore","T-Shirt");
		tc.addStore("2","5","FifthStore","Underwear");
		tc.addStore("2","6","SixthStore","diaper");
		tc.addStore("2","7","SeventhStore","socks");
		tc.addStore("2","8","EightStore","strollers");
		tc.addStore("2","9","NinethStore","bottle");
		
		
		Store store = tc.searchStoreByID("SixthStore");
		if(store != null) {
			store.print();
		}
		else {
			System.out.println("Hello Dude, here smth which i did with help of my professors but imma still can't understand what's going on here in this code! What's a point macking this and every where null");
		}
		tc.print();
		tc.searchStoreByID("1");
	}

}
