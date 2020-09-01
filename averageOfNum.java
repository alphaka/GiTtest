public class averageOfNum {

	public static void main(String[] args) {

		int sum =0;

		for(int i=0; i<args.length; i++)
			sum+=(Integer.parseInt(args[i]));
		
		int size=args.length;

		System.out.println("The average of the numbers is: " + 
				   sum/args.length);

	}

 }
