package Sample.coreprograms;

public class Commanline_arguments {

	public static void main(String[] args) {
	
int length=args.length;
if(length == 0) {
	System.out.println("no inputs are provided");
}
else{
	System.out.println("arguments list are ");
	for(int i=0;i<length;i++) {
		System.out.println(args[i]);
	}
}
	}

}
