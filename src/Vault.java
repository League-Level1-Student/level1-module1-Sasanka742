import java.util.Random;

public class Vault {
 private int secretCode;
 
	public Vault() {
		 secretCode = new Random().nextInt(1000001);	
	}
	
	public boolean tryCode(int code) {
		if(code==secretCode) {
			return true;
		}else {
			return false;
		}
	}
	
}


