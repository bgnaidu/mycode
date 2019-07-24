package Sample.coreprograms;

public class IfElseIf {

	public static void main(String[] args) {
	

		int marks=52;
		char grade;
		
		if (marks >=90) {
			grade='A';
		}
		else if(marks >=80) {
			grade='B';
		}
		else if (marks >=70) {
			grade='c';
		}
		else if (marks >= 50) { 
			grade='d';
		}
		else {
			grade='e';
		}
		System.out.println("Grade ="+grade);
	}

}
