
public class demo17 {
	public static void main(String[] args) {
		Annimal a = new Annimal (10,20);
		System.out.println("年龄 = " + a.age + "\t体重= " + a.weight + "身高= " + a.height);
		
	}
}
class Annimal{
	int age;
	String furCrolor;
	String eyeColor;
	String name;
	float weight;
	float height;
	public Annimal(float height) {
		this.age = 1;
		this.height = height;
	}
	public Annimal(String name) {
		this.age = 1;
		this.name = name;
	}
	public Annimal(float height,float weight) {
		this(height);
		this.weight = weight;
	}
}