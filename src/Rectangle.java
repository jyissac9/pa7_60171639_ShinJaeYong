//Rectangle class�� Shape�� ��ӹ޴´�
public class Rectangle extends Shape {
	//Rectangle Class�� Instance variable���̴�.
	public int x;
	public int y;
	public int width;
	public int height;
	
	//Rectangle Class�� �������̸� ���� ���� parameter���� ���� �������ش�
	public Rectangle(int x, int y, int width, int height) { 
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//getArea method�� Shape Class���� ��ӹ��� method�̰� rectangle�� ���̸� ���Ѵ�.
	public double getArea() {
		int area = width*height;
		return area;
	}
	
	//getLength method�� Shape Class���� ��ӹ��� method�̰� rectangle�� �ѷ��� ���Ѵ�.
	public double getLength() {
		int length = (width + height) * 2 ;
		return length;
	}
	
	//draw() method�� Drawable Interface���� ��ӹ޾ƿ´�.
	public void draw() {
		System.out.println("Rectangle (" + (double) x + "," + (double) y + ")-(" + (double) (x + width) + "," + (double) (y + height) +")" );
	}
}
