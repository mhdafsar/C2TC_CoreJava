package day08.abstraction;

public class Square extends Shape {

	float side = 2.5f;
	@Override
	void calArea() {
		area = side*side;	
	}
	

}