package com.cognixia.javaprep.weekone;

import com.cognixia.javaprep.weekone.OuterClass.FirstLevel;

public class OuterClass {
	
	public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterClass.this.x = " + OuterClass.this.x);
        }       
    }

}
//OuterClass st = new OuterClass();
//OuterClass.FirstLevel fl = st.new FirstLevel();
//fl.methodInFirstLevel(23);