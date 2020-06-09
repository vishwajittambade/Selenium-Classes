package methods;

public class MethodExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonReturnType obj = new NonReturnType();
// NonReturnType
		obj.add();

		obj.add(100, 50);
		obj.add(10,20,30);
		obj.add(10f,20f);
		

		RetrunType object = new RetrunType();
// ReturnType 
		int b = object.add();
		System.out.println(b);

		int t = object.add(10, 5);

		System.out.println(t);

	}

}
