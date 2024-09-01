package ArrayListPrograms;

public class varArgsMehtod {
static int balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varArgsMehtod(100,500,700,1000);
	}

	public static void varArgsMehtod(int...amt) {
		for(int bal:amt) {
			balance+=bal;
			System.out.println("deposited amount ="+bal);
		}
		
	}

}
