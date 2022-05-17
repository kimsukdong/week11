package week11;

class Food{				
	private int cal;			//필드 데이터 정의
	private int cost;
	private int kg;
	
	public Food(int cal, int cost, int kg){	//생성자 매개변수 존재
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;	}
	public Food(){				//생성자 
		this.cal = 0;
		this.cost = 0;
		this.kg = 0;	}
	
	public void setCal(int cal){			//설정자.
		this.cal = cal;	}
	public void setCost(int cost){
		this.cost = cost;	}
	public void setKg(int kg){
		this.kg = kg;	}
	
	public int getCal(){			//접근자.
		return cal;		}
	public int getCost(){
		return cost;	}
	public int getKg(){
		return kg;	}
}
class Melon extends Food{			//melon 클래스 작성 Food 상속
	private String info;				//필드 정의
						
							//Food 상속 생성자 작성
	public Melon(int cal, int cost, int kg,String info) {
		super(cal, cost, kg);			//Food 생성자 호출
		this.info = info;	}
	public Melon(){
		super();
		info = "NULL";}	

	public void setInfo(String info){			//설정자.
		this.info = info;	}
	public String getInfo(){				//접근자.
		return info;	}
	
	public String toString(){
		return "Melon의 정보\n칼로리 : "+this.getCal()+"\n가격 : "+
		this.getCost()+"\n중량 : "+this.getKg()+"\n정보 : "+this.getInfo();
	}
}

public class Melon_Test {					//드라이버 클래스 작성
	public static void main(String[] args) {	

		Melon m1 = new Melon(124,21,2,"A 등급");
		Melon m2 = new Melon(1,1,1,"0");
		
		m2.setCal(100);
		m2.setCost(210);
		m2.setKg(21);
		m2.setInfo("B 등급");
		
		System.out.println(m1+"\n");
		System.out.println(m2);
	}
}
