package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);
		
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean andResultA = (isSunny && isWarm);
		System.out.println(andResultA);
		
		int x = 3;
		int y = 4;
		boolean notResult = (x > 0 && y % 2 == 0);
		System.out.println(notResult);
		
		boolean hasPermission = !(x == y);
		System.out.println(hasPermission);
	}

}
