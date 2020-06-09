package overriding;

public class Saint20Batch extends Saint19Batch{

	int i=20;
	
	void add() {
		System.out.println("This is Saint 20 Batch");
			
	}
	

	void print() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	
	
	
}
