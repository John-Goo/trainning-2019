package org.trainning.threads.ticket1;

public class BookTicket implements Runnable {

	private Integer tickets = 100;

	@Override
	public void run() {
		
		while (tickets > 0) {
			// 相当于 this
			//synchronized (BookTicket.class) {
			//synchronized (this) {
			synchronized (tickets) {
				System.out.println("窗口"+Thread.currentThread().getId()+"准备出票.");
				tickets = tickets-1;
				System.out.println("窗口"+Thread.currentThread().getId()+"车票剩余："+tickets);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
