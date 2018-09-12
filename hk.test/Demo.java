package com;
import java.util.Random;


public class Demo {

	static void demoproc() {
		
		try {
			
			throw new NullPointerException("demo");
			
		}catch(NullPointerException e) {
			
			System.out.println("demoproc() 函数内部错误");
			throw e;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
			
			demoproc();
			
		}catch(NullPointerException e) {
			
			System.out.println("demoproc() 函数外部错误" + e);
			
		}
		
		
		/*
		 * 
		 * 
		try {
			
			int a = 2;
			int b = 42 / a; 
			
			System.out.println("a=  " + a);
			
			try {  // 嵌套try模块
				
				if(a == 1) 
					a = a / (a-a);
				
				if (a == 2) {
					int c[] = {1};
					c[42] = 99;
				}
				
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("数组下标越界" + e);
				
			}
			
		}catch(ArithmeticException e) {
			
			System.out.println("除数是0" + e);
			
		}
		
	

		try {
			int a = args.length;
			System.out.println("a: " + a);
			  		
		    a = 42; 
		    
			int b = 42/a;
			
			int c[] = {1};
			c[1] = 99;
			
		}catch(ArithmeticException e) {
			
			System.out.println("除数是0" + e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("数组下标越界" + e);
			
		}
		
		System.out.println("继续执行程序.");
		

		int a = 0, b = 0, c = 0;
		
		Random r = new Random();
		
		System.out.println(r.nextInt() );
		
		for (int i = 0 ; i < 10; i++) {
			
			try {
				
				b = r.nextInt();
				c = r.nextInt();
				
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				
				a = 12345 / (b/c);
				System.out.println("这一行有时被显示");
				
			}catch(ArithmeticException e){
				
				 System.out.println("除数是0");
				 a = 0;
			}
			
			System.out.println("a: " + a);
			
		}
		

       int d, a;
       
       try { //监控一段代码的运行
    	   
    	   d = 0;
    	   a = 42 / d; 
    	   System.out.println("这一行无法被显示");
    	   
       }catch(ArithmeticException e) {
    	   
    	   System.out.println("除数是0");
    	   
       }
	    
       System.out.println("after catch stmt. ");
		System.out.println("Hello world");
        */
		
	}

}
	
	/*
	try {
		
	    // block of code to monitor for errors. 
		
	}catch(ExceptionType2 exOb) {
	
	    //  exception. 
		
    }finally {
    	
    	// block of code to be executed before try block ends. 
    	
    } 
    */


