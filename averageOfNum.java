public class averageOfNum {

	public static void main(String[] args) {

		int sum =0;
		// Created a sum variable which will hold the sum of all integers
		for(int i=0; i<args.length; i++)
			sum+=(Integer.parseInt(args[i]));

		System.out.println("The average of the numbers is: " + 
				   sum/args.length);

	}

 }
