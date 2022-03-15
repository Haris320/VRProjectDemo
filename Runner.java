public class Runner {
	 interface Quotient{
	        void divide(float a, float b);
	    }
	    public static void main(String [] args)
        {
			//Haris - I learned how to format using printf and lamda usage
	        Quotient div = (a,b) -> System.out.printf("Number is approximately %.3f", a/b);
	        div.divide(3.4124f,3.4f);
	        System.out.println();
            //kunal - I learned how to use lambdas from interfaces and lambdas in general
            perfectSquare pS = (int x) ->
            {
		    	int sr = (int)Math.sqrt(x);
		    	return (sr * sr) == x;
		    };
		    System.out.println(pS.perfects(9));
    }


	interface perfectSquare{
		boolean perfects(int x);
	}
}
