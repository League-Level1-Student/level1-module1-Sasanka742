package extra;

public class Platypus {
	private String name;

	Platypus(String aName) {
		name = aName;
	}
	
  	void sayHi(){
        	System.out.println("The platypus " + name + " is smarter than your average platypus.");
  	}
  	
  	
}


public class runner {
	
	public static void main(String[] args) {
		 Platypus plat = new Platypus("Patty");
		 plat.sayHi();
	}
	
}