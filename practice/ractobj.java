package practice;
class ract {
	int hieght;
	int width;
	void disp(int h1,int w1) {
		hieght = h1;
		width = w1;
		System.out.println("Ractangle : "+(hieght*width));
	}
}

public class ractobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ract obj = new ract();
		obj.disp(5,5);

	}

}
