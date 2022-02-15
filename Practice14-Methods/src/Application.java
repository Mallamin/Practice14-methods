
class Person {
	// Classes can contain
	// 1-Data
	// 2-Subroutines(methods)
	void speak() {
		System.out.println("I am" + " "+name+"," + " " +"I have been living here for " +" "+ age+" "+ "years," +" "+ "Nice to meet you!");
	}

	// Instance variables(data/"state")
	String name;
	int age;

}

public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Mohamed Lamin";
		person1.age = 3;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Binta Jalloh";
		person2.age = 1;
		person2.speak();

		System.out.println(person2.name);

	}
}
