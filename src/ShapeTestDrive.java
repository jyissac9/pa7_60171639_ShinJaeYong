/*PA7
이름 : 신재용
학번 : 60171639
*/

public class ShapeTestDrive { //Shape를 Test하는 Class

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; //Shape Array를 크기가 3으로 선언
		shapes[0] = new Rectangle(10, 20, 30, 40); 
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		//Shape Array안에 속한 shapes 객체들이 getArea, getLength를 실행하고 결과를 출력함.
		for(Shape s : shapes) {
			System.out.printf("Area : %.1f\n", s.getArea());
			System.out.printf("Length : %.1f\n", s.getLength());
		}
		
		Drawable[] drawables = new Drawable[4]; //Drawable Array를 크기가 4로 선언
		
		//shape array의 길이만큼 drawables array에 shapes 객채를 추가한다.
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		
		//Shapes[3]은 정의되지 않았으므로 drawables[3]을 Text객체로 정의한다.
		drawables[3] = new Text("Sample Text");
		
		//drawables array안에 있는 Drawable d들을 차레로 불러내어 draw()를 실행시킨다.
		for (Drawable d: drawables) {
			d.draw();
		}
	}

}