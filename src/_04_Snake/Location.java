package _04_Snake;

public class Location {
	Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	private int x;
	private int y;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public boolean equals(int x, int y) {
		if(getX() == x && getY() == y) {
			return true;
		}
		else {
			return false;

		}
	}
}
