package week3.day1;

public class Calc {
	
	public void add(int num1,int num2) {
		System.out.println("add");
		// TODO Auto-generated method stub

	}
	public void add(int num1,int num2,int num3) {
		System.out.println("add2");
		// TODO Auto-generated method stub

	}


	
	public void mul(int num1,int num2) {
		System.out.println("mul");
		// TODO Auto-generated method stub

	}
	public void mul(int num1,double num2) {
		System.out.println("mul");
		// TODO Auto-generated method stub

	}
	public void sub(int num1,int num2) {
		System.out.println("mul");
		// TODO Auto-generated method stub

	}
	public void sub(double num1,double num2) {
		System.out.println("sub");
		// TODO Auto-gelenerated method stub

	}
	public void div(int num1,int num2) {
		System.out.println("div");
		// TODO Auto-generated method stub

	}
	public void div(double num3,int num4) {
		double res=num3/num4;
		System.out.println("division:" +res);
		// TODO Auto-gelenerated method stub

	}

	public static void main(String[] args) {
	
		Calc result= new Calc();
		result.add(15,20);
		result.add(15, 20,25);
		result.mul(2,3);
		result.div(15.0, 3);
		result.mul(10, 3.00);
		// TODO Auto-generated method stub

	}

}
