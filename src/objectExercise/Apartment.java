package objectExercise;

public class Apartment extends Property {
	private int plan;
	
	Apartment(String name, String ownerName, String type, int price, int plan) {
		super(name, ownerName, type, price);
		this.plan = plan;
	}
	
	public int getPlan() {
		return plan;
	}
	
	public void setPlan(int plan) {
		this.plan = plan;
	}
	
	public void information() {
		super.information();
		System.out.println("間取り :" + plan + "LDK");
		System.out.println("=============================");
	}
}
