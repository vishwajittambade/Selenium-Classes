package passingValuefromConstructor;

public class LoginExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentbpath = "http://apps.qaplanet.in/hrm/login.php";
//		Login LG = new Login("http://apps.qaplanet.in/hrm/login.php");
		Login LG = new Login(currentbpath);
		LG.testcase1();
		LG.testcase2();

//		Admin AD = new Admin("http://apps.qaplanet.in/hrm/login.php");
		Admin AD = new Admin(currentbpath);
		AD.testcase501();

	}

}
