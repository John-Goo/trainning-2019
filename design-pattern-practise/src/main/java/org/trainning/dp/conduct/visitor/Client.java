package org.trainning.dp.conduct.visitor;

public class Client {

	public static void main(String[] args) {
		 	ObjectStruct os = new ObjectStruct();
	        os.attach(new ConcreteElementA("核能"));
	        os.attach(new ConcreteElementA("光能"));
	        os.attach(new ConcreteElementB("暗物质"));
	        os.attach(new ConcreteElementB("黑洞"));
	        Visitor va = new VisitorA("张三");
	        Visitor vb = new VisitorB("李四");
	        os.accpet(va);
	        os.accpet(vb);
	}

}
