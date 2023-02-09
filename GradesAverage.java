import java.util.Scanner;

public class GradesAverage{
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int numStudents = sc.nextInt();
		int[] grades = new int[numStudents];

		int i = 1;
		while (i <= numStudents){

			System.out.print("Enter the grade for student "+ i + ":");
			grades[i-1] = sc.nextInt();

			if (grades[i-1]>=0 && grades[i-1]<=100){
				i++;
			}else{
				System.out.println("Invalid grade, try again...");
			}

		}
		double total = 0;
		for (int n = 0;n < numStudents;n++) {
			total += grades[n];
		}

		System.out.println("The average is " + total/numStudents);
		
	}
}