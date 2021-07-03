package week3.day2.assignments;

public class College extends University {
	
	

	public static void main(String[] args) {
		College cg= new College();
		cg.pg();
		cg.ug();
		// TODO Auto-generated method stub

	}

	@Override
	public void pg() {
		
		System.out.println("pg called from abstract class");
		// TODO Auto-generated method stub
		
	}

}
