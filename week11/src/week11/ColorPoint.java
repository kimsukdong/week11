package week11;

class Point{
	private int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	protected void move(int x, int y){
		this.x= x;
		this.y= y;
	}
}

public class ColorPoint extends Point{
	String color;
	public ColorPoint(int x, int y, String z){
		super(x,y);
		color = z;
		show0();
	}
	
	public void setPoint(int x, int y){
		move(x,y);
	} 
	
	void setColor(String color){
		this.color = color;
	}
	void show0(){
		System.out.print(color + " ");
		System.out.print("("+getX()+" , " + getY() + ")에서 ");

	}
	void show(){
		System.out.print(color + " ");
		System.out.println("("+getX()+" , " + getY() + ")으로");

	}
	public static void main(String [] args){
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
	//	cp.setPoint(10,20);
		cp.move(10,20);
		cp.setColor("Green");
		cp.show();
	}
	
}
