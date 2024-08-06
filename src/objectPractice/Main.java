package objectPractice;

class Main {

	public static void main(String[] args) {
		// クラス型 変数名 = new クラス名();
		//変数名.インスタンスメソッド名;
		
		Geekdam geekdam = new Geekdam();
		//インスタンスの生成
		// geekdamインスタンスのインスタンスフィールドに値を設定します。
		geekdam.name = "Geekdam太郎";
		geekdam.color = "red";
		geekdam.height = 175.2;
		 geekdam.greeting();
		
		// geekdamインスタンスのインスタンスフィールドの値を出力します。
		System.out.println(geekdam.name);
		System.out.println(geekdam.color);
		System.out.println(geekdam.height);
	}
}
