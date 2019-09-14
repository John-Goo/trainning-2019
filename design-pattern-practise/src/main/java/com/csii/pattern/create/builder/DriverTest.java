package com.csii.pattern.create.builder;

import net.sf.json.JSONObject;

public class DriverTest {

	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person man = pd.constructPerson(new ManBuilder());
		JSONObject data = JSONObject.fromObject(man);
		System.out.println(data.toString());
		System.out.println("---------------------------");
		WomanPerson woman = (WomanPerson) pd.constructPerson(new WomanBuilder());
		JSONObject data1 = JSONObject.fromObject(woman);
		System.out.println(data1.toString());
		
	}

}
