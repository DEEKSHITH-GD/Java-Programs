import java.util.Scanner;

public class BootCamp2c {

	public static void main(String[] args) {
		double noOfClasses; double cls_attended; double percent;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Total no of classes conducted: ");
		noOfClasses = s.nextInt();
		System.out.println("Enter the Total no of classes attended: ");
		cls_attended = s.nextInt();
		percent = (cls_attended/noOfClasses) * 100;
		System.out.println(percent);
		if(percent >= 75.0) {
			System.out.println("Your eligible to take exams");
		}
		else{
			System.out.println("Your not eligible to take exams");
		}
		/*Scanner scanner = new Scanner(System.in);
		// Taking input for the ages of three people
        System.out.println("Enter the classes held");
        double claases_held = scanner.nextInt();

        System.out.println("Enter the classes attended");
        double classes_attended = scanner.nextInt();
        
        double res = (classes_attended/claases_held)*100;
        if(res>75.0)
        {
        	System.out.println("Allowed");
        }
        else
        {
        	System.out.println("not allowed");
        }*/
	}
}
