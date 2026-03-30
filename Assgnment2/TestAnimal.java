/*
Inheritance & Method Overriding
Animal (Superclass): Include name, sound, and legs (int). Create a constructor and a speak() method that prints: "[name] says [sound]".
Dog (Subclass): Extend Animal. Add a breed field. Create a constructor using super(). Override speak() to append " and wags tail".
Bird (Subclass): Extend Animal. Add a canFly (boolean) field. Create a constructor using super(). Override speak() and add a new fly() method.
Fish (Subclass): Extend Animal. Add a waterType (String: Fresh/Salt) field. Create a constructor using super(). Add a new swim() method.
Testing (in main): * Create one instance of each class. Call speak() on all of them. Try calling fly() on the Bird and swim() on the Fish.
Create an Animal[] array of size 4. Store all your animals in it. Loop through the array and call speak() on each object.
*/
class Animal{
	String name, sound; 
	int legs;
	Animal(){

	}
	public void speak(){
		System.out.println(name+" says "+sound);
	}
}
class Dog extends Amimal{
	String breed;
	Amimal(){
		super();
	}
	
	@override
	public void speak(){
		System.out.println(name+" says "+ sound +"  and wags tail");
	}
}
class Bird extends Amimal{
	boolean canFly;

	@override
	public void speak(){
		System.out.println(name+" says "+ sound +"  and flies");
	}

	public void fly(){

	}
}
class Fish extends Animal{
	
	Strig waterType;
	Fish(){

	}
	@override
	public void speak(){
		System.out.println(name+" says "+ sound +"  and flies");
	}

	public void swim(){

	}

}
class TestAnimal{
	public static void main(Strinng args[]){
		Animal[] animals=new Animal[4];
		animal[0]=new Dog();
		animal[1]=new Bird();
		animal[2]=new Fish();

		for(Animal animal:animals){
			animal.speack();
		}
	}
}