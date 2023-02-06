package assessment;

public class PrintMethod {
	    public static void print(String... args){
	        for(String arg : args){
	            System.out.print(arg + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        print();  //zero argument   
	        print("hello");  //one argument   
	        print("we","are","from","ZSgs");  //four arguments
	    }
}
