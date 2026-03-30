/*
 Polymorphism — Shape Hierarchy
Shape (Superclass): Include a color (String) field. Add methods area() (returning 0) and perimeter() (returning 0). Add a displayInfo() method that calls and prints the results of area() and perimeter().

Circle (Subclass): Add radius. Override area() ($\pi \times r^2$) and perimeter() ($2 \times \pi \times r$).

Rectangle (Subclass): Add width and height. Override both math formulas.
Triangle (Subclass): Add base, height, side1, side2, and side3. Override both math formulas ($\text{area} = 0.5 \times \text{base} \times \text{height}$).
Square (Subclass): Extend Rectangle. Take a single side parameter in the constructor and call super(side, side).
Testing (in main): Create a Shape[] array containing one of each shape type. Loop through the array and call displayInfo() on each. Notice how Java automatically calls the correct subclass version of the methods—this is polymorphism in action!
*/
class Shape{

	String color;
	double area(){
		return 0f;
	}
	double perimeter(){
		return 0f;
	}
	void displayInfo(){
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}

/*
Circle (Subclass): Add radius. Override area() ($\pi \times r^2$) and perimeter() ($2 \times \pi \times r$).
*/


class Circle extends Shape{
	float radius;
	Circle(float radius){
		this.radius=radius;
	}
	double area(){
		return 3.14*radius*radius;
	}
	double perimeter(){
		return 2*3.14*radius;
	}
	void displayInfo(){
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}
//Rectangle (Subclass): Add width and height. Override both math //formulas.

class Rectangle extends Shape{
	float width,height;
	Rectangle(float width,float height){
		this.width=width;
		this.height=height;
	}
	double area(){
		return width*height;
	}
	double perimeter(){
		return 2*(height+width);
	}
	void displayInfo(){
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}

class Square extends Shape{
	float side;
	Square(float side){
		this.side=side;
	}
	double area(){
		return side*side;
	}
	double perimeter(){
		return 4*side;
	}
	void displayInfo(){
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}

/*
Triangle (Subclass): Add base, height, side1, side2, and side3. Override both math formulas ($\text{area} = 0.5 \times \text{base} \times \text{height}$).
*/

class Triangle extends Shape{
	float height,base;
	Triangle(float height,float base){
		this.height=height;
		this.base=base;
	}
	double area(){
		return 0.5*height*base;
	}
	
}
/*
Create a Shape[] array containing one of each shape type. Loop through the array and call displayInfo() on each. Notice how Java automatically calls the correct subclass version of the methods—this is polymorphism in action
*/
class TestShape{
	public static void main(String args[]){
		Shape[] shapes=new Shape[4];
		shapes[0]=new Circle(2f);
		shapes[1]=new Rectangle(2f,3f);
		shapes[2]=new Square(4f);
		shapes[3]=new Triangle(3f,4f);
		for(Shape shape:shapes){
			shape.area();
			shape.perimeter();
			shape.displayInfo();
		}
	}
	
}