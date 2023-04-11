package com.dal.lambda;

public class TaskThread implements Runnable {
	public void run() {
		Task t = new Task();
		t.connect();
	}

}
