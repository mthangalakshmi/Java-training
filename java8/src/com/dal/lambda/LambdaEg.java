package com.dal.lambda;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class LambdaEg {
	public static void main(String[] args) {
		//syntax1 wthot thread
		//Task t = new Task();
		//t.connect();
		
		//syntax2 with thread
		//Runnable r = new TaskThread();
		//Thread thread = new Thread(r);
		//thread.start();
		
		//syntax3 ananymous class
//		Runnable r = new Runnable() {
//			public void run() {
//				Task task =  new Task();
//				task.connect();
//			}
//		};
//		Thread t1 = new Thread(r);
//		t1.start();	

		
//	Runnable r =() ->{
//		Task task =  new Task();
//		task.connect();
//	};
//	Thread t1 = new Thread(r);
//	t1.start();
		
		
//		
//		Thread th1 = new Thread(() ->{
//			Task task = new Task();
//			task.connect();		
//		});
//		th1.start();
		
//		new Thread(() ->{ 
//			new Task().connect(); 
//		}).start();
		
		//new Thread(new Task()::connect).start();
		User u1 =new User(11,"Gold","gold@gmail.com");
		User u2 =new User(21,"Lakshmi","laks@gmail.com");
		User u3 =new User(31,"thangam","thanm@gmail.com");
		
		List<User> li = new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		System.out.println("user list :" + li);
		
//		Iterator<User> i = li.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		//li.forEach(lis->System.out.println(lis));
		li.forEach(System.out::println);
}
}
