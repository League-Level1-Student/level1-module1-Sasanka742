
public class Duck {
	private String favoriteFood;
	private int numberOfFriends;
	
	public Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	 public void quack(){
   		System.out.println("Quack!Quack!Quack!");
   	}
   	 public void waddle(){
   		System.out.println("Wadle");
   	}
   	 public void setFavoriteFood(String food) {
   		favoriteFood = food;
   	 }
   	 
   	 public void setNumberOfFriends(int number) {
   		numberOfFriends = number;
   	 }
   	 public static void main(String[] args) {
		Duck daffy = new Duck("Popcorn", 10);
		daffy.quack();
	}
}
