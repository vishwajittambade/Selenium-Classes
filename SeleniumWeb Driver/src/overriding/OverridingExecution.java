package overriding;

public class OverridingExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saint19Batch obj = new Saint19Batch();

		obj.add();

		Saint20Batch object = new Saint20Batch();

		object.add();
		
		object.display();
		
		
//		overriding concept
		
		Saint19Batch a = new Saint20Batch();

		a.add();

	}

}
