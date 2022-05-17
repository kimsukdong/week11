package week11;

class Phone {
	protected String maker;
	protected int price;
	protected String type;
	
	public Phone(String maker, int price, String type) {
		super();
		this.maker = maker;
		this.price = price;
		this.type = type;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

class SmartPhone extends Phone {
	private String os;
	private String version;
	private int memory;
	private boolean hasCamera;
	private boolean hasBluetooth;

	public SmartPhone(String maker, int price, String type, String os,
			String version, int memory, boolean hasCamera, boolean hasBluetooth) {
		super(maker, price, type);
		this.os = os;
		this.version = version;
		this.memory = memory;
		this.hasCamera = hasCamera;
		this.hasBluetooth = hasBluetooth;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isHasCamera() {
		return hasCamera;
	}
	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	public boolean isHasBluetooth() {
		return hasBluetooth;
	}
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	public String toString(){	 	
		return "제조사 :"+getMaker()+"\t 가격 :"+getPrice()+"\t 타입 :"+getType()+
		"\t OS :"+getOs()+"\t 버전정보 :"+getVersion() + "\t 메모리 :"+getMemory()+"\t 카메라 여부 :"+((hasCamera == true)? "있음":"없음");
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone("삼성", 1200000, "5G", "Android", "24.2", 256, true, true);
		SmartPhone s2 = new SmartPhone("Apple", 1500000, "5G", "IOS", "15.5", 128, true, true);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}