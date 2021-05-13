
public class Calculator_Using_Method extends  Subtraction 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator_Using_Method a =new Calculator_Using_Method();
		a.sum(100, 20);
        a.Sub1();
        a.Sub2();
        
	}
	
	
	public int sum(int a, int b){
		int P=(a+b);
		System.out.println(P);
		
		return P;
	}
	

}
