package cisco.java.programs;

public class SimpleIntrest {
	
	public void Si(int p, int rate, int time) {
		int simple_intrest = (p * rate * time)/100;
		int amount = simple_intrest + p;
		
		System.out.println("Simple Intrest : " + simple_intrest + "% and amount is " + amount);
	}

	public static void main(String[] args) {
		SimpleIntrest v = new SimpleIntrest();
		
		v.Si(10000, 5, 2);
		

	}

}
