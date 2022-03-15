public class Runner {

	 interface Quotient{
	        void divide(float a, float b);
	    }

	    public static void main(String [] args){
	        Quotient div = (a,b) -> System.out.printf("Number is approximately %.3f", a/b);
	        div.divide(3.4124f,3.4f);
	        System.out.println();
    }
}
