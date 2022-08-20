package functionalInterface;

public class TestMul {
	
	public static void main(String[] args) {
		
		Finterface total = (int a,int b)->a*b;
		
		
		System.out.println(total.Mul(12, 7));
	}

}
