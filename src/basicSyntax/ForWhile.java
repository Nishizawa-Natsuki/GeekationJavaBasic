package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
		        System.out.println("Fizz");
		      } else if (i % 5 == 0) {
		        System.out.println("Buzz");
		      } else if (i % 3 ==0 && i % 5 == 0) {
		        System.out.println("FizzBuzz");
		      } else {
		        System.out.println(i);
		      }
		}
		
String[] pl = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (String pls: pl) {
			if(pls.equals("Java")) {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			} else if (pls.equals("HTML")) {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			} else {
				System.out.println(pls);
				}
		}
		
		
		
		
		
		
		
		
	}
}		
			 


