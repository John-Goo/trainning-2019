package org.trainning.dp.conduct.iterator;

public class Test {

	public static void main(String[] args) {
		AbstractAggregate<String> agg = new ConcreteAggresgate<String>();
		agg.add("John");
		agg.add("Jack");
		agg.add("Tom");
		agg.add("Sunny");
		
	  AbstractIterator<String> it = agg.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
	  String first = it.first();
	  String last = it.last();
	  
	  System.out.println("First:"+first);
	  System.out.println("Last:"+last);
	  
		
	}

}
