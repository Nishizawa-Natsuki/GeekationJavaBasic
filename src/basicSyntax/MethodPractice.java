package basicSyntax;

public class MethodPractice {
	 public static void main(String[] args) {
		 int a = 4;
	     int b = 2;
	
	     int result1 = sumNumbers(a,b);
	     int result2 = subtractNumbers(a,b);
	     int result3 = multiplyNumbers(a,b);
	     int result4 = divideNumbers(a,b);
	
	     printResult(result1);	
	     printResult(result2);	
	     printResult(result3);	
	     printResult(result4);	
     }

     public static int sumNumbers(int num1, int num2) {
	     int sum = num1 + num2;
	
	     return sum;
     }

     public static int subtract7Numbers(int num1, int num2) {
	     int sum = num1 - num2;
	
	     return sum;
     }

     public static int multiplyNumbers(int num1, int num2) {
	     int sum = num1 * num2;
	
	     return sum;
     }

     public static int divideNumbers(int num1, int num2) {
	     int sum = num1 / num2;
	
	     return sum;
     }

     public static void printResult(int result) {
         System.out.println("計算結果は" + result + "です。");
     }

}
