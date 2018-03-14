package ch.bbw;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hello Summator!");
		
		Summator summator = new Summator(20);
		System.out.println("Value = " + summator.getValue());
		
		summator.add(20);
		System.out.println("Value = " + summator.getValue());
		summator.sub(20);
		System.out.println("Value = " + summator.getValue());
	}
}
