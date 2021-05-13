package project_10;

public class Class_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Class_10 A = new Class_10();
		 
		 A.sum();
		 A.sub();
		 A.sum(100, 200, 30);
	}
		
		public void sum()
		{
			
			int a= 5;
			int b =4;
			int c =(a+ b);
			
			System.out.println(c);
			
		}


		public void sub()
		{
			
			int X= 2;
			int Y =4;
			int Z =(X-Y);
			
			System.out.println(Z);
		
		}	
		
		
		public int sum(int s, int q, int f)
		{
			int z=(s+q+f);
			System.out.println(z);
			
		return z;	
		}
		
		
	

}
