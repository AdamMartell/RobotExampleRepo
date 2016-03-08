
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazorRobot jim = new LazorRobot(10, "blue", "Jim", 150);
		LazorRobot john = new LazorRobot(10, "blue", "John", 150);
		System.out.println(jim.powerLevel);
		jim.ShootLazors();
		System.out.println(jim.powerLevel);
	}

}
