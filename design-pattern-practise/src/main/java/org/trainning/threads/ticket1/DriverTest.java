package org.trainning.threads.ticket1;

public class DriverTest {
	
	/**
	 * 开启三个独立的线程和三个内存块
	 */
	public static void bookTicketA() {
		new Thread(new BookTicket()).start();
		new Thread(new BookTicket()).start();
		new Thread(new BookTicket()).start();
	}
	
	
	/**
	 * 开启三个对象共享1个内存对象
	 */
	public static void bookTicketB() {
		BookTicket ticket =new BookTicket();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
		
	}
	

	public static void main(String[] args) {
		bookTicketB();
	}

}
