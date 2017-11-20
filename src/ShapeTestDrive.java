/*PA7
�̸� : �����
�й� : 60171639
*/

public class ShapeTestDrive { //Shape�� Test�ϴ� Class

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; //Shape Array�� ũ�Ⱑ 3���� ����
		shapes[0] = new Rectangle(10, 20, 30, 40); 
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		//Shape Array�ȿ� ���� shapes ��ü���� getArea, getLength�� �����ϰ� ����� �����.
		for(Shape s : shapes) {
			System.out.printf("Area : %.1f\n", s.getArea());
			System.out.printf("Length : %.1f\n", s.getLength());
		}
		
		Drawable[] drawables = new Drawable[4]; //Drawable Array�� ũ�Ⱑ 4�� ����
		
		//shape array�� ���̸�ŭ drawables array�� shapes ��ä�� �߰��Ѵ�.
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		
		//Shapes[3]�� ���ǵ��� �ʾ����Ƿ� drawables[3]�� Text��ü�� �����Ѵ�.
		drawables[3] = new Text("Sample Text");
		
		//drawables array�ȿ� �ִ� Drawable d���� ������ �ҷ����� draw()�� �����Ų��.
		for (Drawable d: drawables) {
			d.draw();
		}
	}

}