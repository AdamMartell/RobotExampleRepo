
public class LazorRobot extends Robot{
	int lazorLevel;
	String lazorColor;
	public LazorRobot(int LazorLevel, String LazorColor, String Name, int MaxCapacity){
		super(Name, MaxCapacity);
		lazorLevel = LazorLevel;
		lazorColor = LazorColor;
	}
	public void ShootLazors(){
		String sound = "bzzzzzzzzzz";
		System.out.println(sound);
		powerLevel -= 20;
	}
}
