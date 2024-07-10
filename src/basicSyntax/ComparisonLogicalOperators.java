package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);
		
		
		int isSunny = 8;
		int isWarm = 8;
		boolean andResultA = (isSunny > 1 && isWarm > 5);
		System.out.println(andResultA);
		
		int x = 3;
		int y = 4;
		boolean notResult = (x > 0 && y % 2 == 0);
		System.out.println(notResult);
		
		boolean hasPermission = !(x == y);
		System.out.println(hasPermission);
	}

}
