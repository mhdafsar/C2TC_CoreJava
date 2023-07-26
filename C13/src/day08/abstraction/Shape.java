package day08.abstraction;

public abstract class Shape {
	float area;
	
	//abstract method
	abstract void calArea();
	
	//concrete method
	void print() {
		System.out.println("Area is : "+area);
	}

}