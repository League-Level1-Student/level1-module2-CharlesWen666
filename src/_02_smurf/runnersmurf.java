package _02_smurf;

public class runnersmurf {
	
	public static void main(String[] args) {
	
		Smurf Handy = new Smurf("Steve");

		Handy.eat();
		System.out.println(Handy.getName());
		System.out.println(Handy.getHatColor());
		System.out.println(Handy.isGirlOrBoy());
		Smurf Papa = new Smurf("John");
	    Papa.eat();
	    System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		Smurf Smurfette = new Smurf("Lucy");
		Smurfette.eat();
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
