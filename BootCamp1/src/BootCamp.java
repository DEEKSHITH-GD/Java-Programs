import java.util.Scanner;

public class BootCamp {
	public static void main(String[] args) {
		/*byte person1, person2, person3;
		Scanner s = new Scanner(System.in);
		System.out.println("1st person's age: ");
		person1 = s.nextByte();
		System.out.println("2nd person's age: ");
		person2 = s.nextByte();
		System.out.println("3rd person's age: ");
		person3 = s.nextByte();
		if(person1 > person2 && person1 > person3 && person2 > person3) {
			System.out.println("person 1 is oldest and person 3 is youngest");
		}
		else if(person2 > person1 && person2 > person3 && person1 > person3) {
			System.out.println("person 2 is oldest and person 3 is youngest");
		}
		else if(person3 > person1 && person3 > person2 && person1 > person2) {
			System.out.println("person 3 is oldest and person 2 is youngest");
		}
		else if (person1 < person2 && person1 < person3 && person2 > person3){
			System.out.println("person 1 is youngest and person 2 is oldest");
		}
		else if (person1 < person2 && person1 < person3 && person3 > person2){
			System.out.println("person 1 is youngest and person 3 is oldest");
		}
		else {
			System.out.println("...");
		}*/
				// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				// Taking input for the ages of three people
		        System.out.println("Enter age of person 1:");
		        int age1 = scanner.nextInt();

		        System.out.println("Enter age of person 2:");
		        int age2 = scanner.nextInt();

		        System.out.println("Enter age of person 3:");
		        int age3 = scanner.nextInt();

		        // Finding the oldest and youngest ages
		        int oldest = Math.max(age1, Math.max(age2, age3));
		        int youngest = Math.min(age1, Math.min(age2, age3));

		        // Displaying the results
		        System.out.println("Oldest person's age: " + oldest);
		        System.out.println("Youngest person's age: " + youngest);		
	}
}
