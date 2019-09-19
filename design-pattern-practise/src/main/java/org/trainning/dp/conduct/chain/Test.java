package org.trainning.dp.conduct.chain;

public class Test {

	/**
	 * chain of responsibility
	 * @param args
	 */
	public static void main(String[] args) {
		
	    RequestHandler hr = new  HRRequestHandler();
	    RequestHandler boss = new BossRequestHanlder(hr);
	    RequestHandler pm = new PMRequestHandler(boss);
	    
	   // 离职申请过程
	    pm.execute(new DismissionRequest());
	    
	   
		
	}

}
