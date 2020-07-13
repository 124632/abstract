abstract class Sample {
	public void display() {
		System.out.println("display method");
	}
	abstract void test();
	abstract void demo();
}
abstract class sampleChild extends Sample {
	void test() {
		System.out.println("test method implemented in childclass");
	}
}
class GrandSample extends sampleChild {
	void demo() {
		System.out.println("demo method implemented in childclass");
	}
}