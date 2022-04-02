package companyLockers;

public class Locker {

	/*Enter your desired Directory path */
	public static final String path = "/Users/tejasunkara/Desktop/JAVA PROJECT"; 

	public static void main(String[] args) {
		LockerMenus menu = new LockerMenus();
		menu.introScreen();
		menu.mainMenu();
	}

}