package org.trainning.dp.conduct.chain;

import org.omg.CORBA.Request;

public class BossRequestHanlder implements RequestHandler {
	
	private RequestHandler requHandler;
	
	
	

	public BossRequestHanlder(RequestHandler requHandler) {
		super();
		this.requHandler = requHandler;
	}




	@Override
	public void execute(Request request) {
		System.out.println("-->我角色是BOSS，已经审批过，再转给HR");
		requHandler.execute(request);
		
	}

}
