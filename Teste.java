
public class Teste {

	public static void main(String[] args) {
	try {		
		
		MinhaThread t1,t2;
		
		t1 = new MinhaThread(1,10,500);
		t2 = new MinhaThread(2,10,800);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("terminei...");

	}

}
