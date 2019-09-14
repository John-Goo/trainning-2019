package org.trainning.dp.create.prototype;

public class Prototype implements Cloneable {
	
	// 名称
	private String name;
	@Override
	protected Object clone()  {
		try {
			return super.clone();
		}catch (CloneNotSupportedException cne) {
			cne.printStackTrace();
		}
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
