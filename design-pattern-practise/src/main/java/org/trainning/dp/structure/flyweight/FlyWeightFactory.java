package org.trainning.dp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	
	private static Map<String,FlyWeight> flyweights = new HashMap<String,FlyWeight>();
	
	public static FlyWeight getFlyWeight(String key) {
		FlyWeight fw = flyweights.get(key);
		if(fw == null) {
				if(fw == null) {
					fw = new ConreteFlyWeight();
					flyweights.put(key, fw);
				}
		}
		return fw;
	}
	
	
	public static int factorySize() {
		return flyweights.size();
	}

}
