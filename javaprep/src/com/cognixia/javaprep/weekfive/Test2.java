package com.cognixia.javaprep.weekfive;

import com.cognixia.javaprep.weekfive.IkmTest.Helper;

class IkmTest{
	static class Helper{
		public int data = 5;
		public void bump(int inc) {
			inc++;
			data = data + inc;
		}
	}

	public static void main(String[] args) {
		Helper h = new Helper();
		int data = 2;
		h.bump(data);
		System.out.println(h.data + "" + data);
	}

}
