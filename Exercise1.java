public class Exercise1 {
	
	public static void main(String[] args){

		Exercise1 ex1 = new Exercise1();
		Exercise1 ex2 = new Exercise1();

		if(!ex1.equals(ex2))
			System.out.println("the two are not equal.");
		if(ex1 instanceof Object)
			System.out.println("t1 is an object.");
	}
}