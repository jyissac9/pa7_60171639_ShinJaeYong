//Text Class�� Drawable Interface�� �����Ѵ�.
public class Text implements Drawable {
	//Text Class�� Instance Variable
	String msg;
	
	//Text Class�� ������, ���޹��� parameter�� ���Ӱ� �����Ѵ�.
	public Text(String msg) {
		this.msg = msg;
	}
	
	//Drawable Interface���� ��ӹ��� method�ν� �Ʒ��� ������ �����Ѵ�.
	public void draw() {
		System.out.println(msg);
	}
}
