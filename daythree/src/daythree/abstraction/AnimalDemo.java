package daythree.abstraction;

public class AnimalDemo {

	public static void main(String[] args) {
		//You cannot create an instance of an abstract
		//Animal animal = new Animal();
		Horse horse = new Horse();
		horse.animalSound();
		horse.sleep();
	}

}
