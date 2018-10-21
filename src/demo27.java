
public class demo27 {
	public static void main(String[] args) {
		Lady missLiu = new Lady();
		missLiu.pet = new Dog2();
		missLiu.petEnjoy();
		
		Lady missWang = new Lady();
		missWang.pet = new Bird();
		missWang.petEnjoy();
	}
}

class Lady{
	Pet pet;
	void petEnjoy() {
		pet.enjoy();
	}
}

class Pet{
	int name;
	void enjoy() {
		System.out.println("宠物高兴");
	}
}

class Bird extends Pet{
	void enjoy() {
		System.out.println("渣渣。。。。。");
	}
}

class Dog2 extends Pet{
	void enjoy() {
		System.out.println("汪汪汪。。。。");
	}
}