package org.trainning.dp.conduct.state;

public  class Context {
	
	State state;
	

	
	public State getState() {
		return state;
	}
	
	public void setStata(State state) {
		this.state = state;
		state.handler();
	}
	

}
