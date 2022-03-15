public class Runner {
	 interface Quotient{
	        void divide(float a, float b);
	    }
	    public static void main(String [] args)
        {
	        Quotient div = (a,b) -> System.out.printf("Number is approximately %.3f", a/b);
	        div.divide(3.4124f,3.4f);
	        System.out.println();
            
            
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
