public class Circle extends Shape{
	//Circle Class의 Instance variable들이다.
	public int x;
	public int y;
	public int radius;
	
	//Circle Class의 생성자이며 전달 받은 parameter들을 새로 정의해준다
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//getArea method는 Shape Class에서 상속받은 method이고 circle의 넓이를 구한다.
	public double getArea() {
		double area = radius*radius*(Math.PI);
		return area;
	}
	
	//getLength method는 Shape Class에서 상속받은 method이고 circle의 둘레를 구한다.
	public double getLength() {
		double length = 2*(Math.PI)*radius;
		return length;
	}
	
	//draw() method는 Drawable Interface에서 상속받아온다.
	public void draw() {
		System.out.println("Circle (" + (double) x + "," + (double) y + ")-radius(" + (double) (radius) +")" );
	}
}
