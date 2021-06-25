package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class Runner_tea_maker {
 public static void main(String[] args) {
	
	TeaBag a = new TeaBag("mint");
	System.out.println(a.getFlavor());
	Kettle b = new Kettle();
	Water d = b.new Water();
	
	
	
	
	b.getWater();
	b.boil();
	
	Cup c = new Cup();
	c.makeTea(a, d);
	
}
}
