
public class PigClass {
	private String name;
	private boolean isSheepHerder;
	
	public PigClass(String name, boolean canHerdSheep) {
		this.name = name;
		isSheepHerder = canHerdSheep;
	}
	
	public boolean willBecomeBacon() {
		if(this.isSheepHerder){
			System.out.println("Eggs for breakfast");
			return false;
		}else {
			System.out.println("Bacon for breakfast");
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		PigClass Babe = new PigClass("Babe", true);
		System.out.println(Babe.willBecomeBacon());
		
		PigClass Rasher = new PigClass("Rasher", false);
		System.out.println(Rasher.willBecomeBacon());
	}
}

