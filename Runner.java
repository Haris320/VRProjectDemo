public class Runner {
    public static void main(String [] args){

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
