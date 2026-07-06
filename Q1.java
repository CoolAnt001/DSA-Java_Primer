package assignment1;

public class Q1 {
	public static void main(String[] args){
		int num=Integer.parseInt(args[0]);
	    System.out.println("The positive integer greater than 2 from command line argument is "+num);
	    int count=0;
	    while (num>2) {
	    	    count++;
	    	    num/=2;
	    }
	    System.out.println("The number of times one must repeatedly divide this number \nby 2 before getting a value less than 2 is "+count);
	}    
}
