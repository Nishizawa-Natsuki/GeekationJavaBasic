package objectExercise;

public class Land extends Property {
	private double breadth;
	
	Land(String name, String ownerName, String type, int price, double breadth) {
		super(name, ownerName, type, price);
		this.breadth = breadth;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public void information() {
		super.information();
		System.out.println("広さ :" + breadth + "㎡");
		System.out.println("=============================");
	}
}
