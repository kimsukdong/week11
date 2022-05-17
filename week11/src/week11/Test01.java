package week11;

class Person {
	String name;
	String address;
	String phone;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class Customer extends Person {
	int customerNumber;
	int mileage;
	public Customer(String name, String address, int customerNumber, int mileage) {
		super(name, address);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}
	public Customer(String name, String address, String phone) {
		super(name, address, phone);
	}

	public String toString(){
		return  getName() + "\t주소 : " + getAddress() + "\t전화번호 : " + getPhone() + "\t마일리지 : " + mileage;
}
}

public class Test01 {
	public static void main(String[] args){
		Customer c1 = new Customer("미현", "아산시 호서대학교", "041 540 5114");
		Customer c2 = new Customer("유미", "천안시 호서대학교", 1234, 540);
		System.out.println("객체 1 : " + c1);
		System.out.println("객체 2 : " + c2);

	}
}