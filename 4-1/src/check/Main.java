package check;

//パッケージインポート
import constants.Constants;

public class Main {
	
	/*課題①
	 * 【Main.java】にてフィールド変数firstNameとlastNameを宣言し、
	 * firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	 * なお、変数のアクセス修飾子は「private」とする。
	 * */
	
	private static final String firstName = "涼太";
	private static final String lastName = "三部";
	
	
	
	/*課題②
	 * 【Main.java】にてfirstNameとlastNameを引数で受け取って、
	 * 連結して表示させるメソッド「printName」を作成しなさい。
	 * 作成した関数のアクセス修飾子は「private」とする。
	 * */
	
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " + lastName + " " + firstName);
	}
	
	/*課題③
	 *【Main.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
	 **/
	
	public static void main(String[] args) {
		//インスタンス
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		//コンソール出力
		printName(firstName,lastName);
		pet.introduce();
		robotPet.introduce();
	}

}
