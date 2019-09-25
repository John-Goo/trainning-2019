package org.trainning.dp.conduct.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {
	
	private String context;
	
	private List<AbstractExpression> expressList = new ArrayList<AbstractExpression>();

	public void add(AbstractExpression express) {
		expressList.add(express);
	}
	
	public List<AbstractExpression> getExpressList(){
		return expressList;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	

}
