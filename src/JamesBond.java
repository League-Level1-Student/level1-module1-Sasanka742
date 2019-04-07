import java.util.Random;

public class JamesBond {
	
	public JamesBond() {
		
	}
	
	public int findCode(Vault v){
		
		for(int i=0;i<1000000;i++) {
			if(v.tryCode(i)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Vault a = new Vault();
		JamesBond j = new JamesBond();
		System.out.println(j.findCode(a));
		
	}
}
