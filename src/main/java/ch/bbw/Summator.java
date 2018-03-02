package ch.bbw;

public class Summator {

	private int value;

	public Summator(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void add(int value) {
		this.value += value;
	}
	public void sub(int value) {
		this.value -= value;
	}
	
	
}
