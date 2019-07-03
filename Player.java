
public class Player implements Comparable{
	String name;
	float time;
	public Player(String s, float t) {
		name = s;
		time =t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	@Override
	public int compareTo(Object arg0) {
		Player temp = (Player)arg0;
		if(this.time<temp.getTime()) {
			return -1;
		} else if(this.time > temp.getTime()) {
			return 1;
		} else {
			return 0;

		}
	}
	
	
}
