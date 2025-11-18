package PersonTasksAPP;
import java.util.Scanner;
// create the person class to store info
class person {
	String firstname;
	String lastname;
	String gender;
	int age;
	double weight;
	double height;
	String ethnicgroup;
	String religion;
}
public class PersonTasksAPP {
	static Scanner userinput = new Scanner(System.in);
	// create all the methods for the persons tasks
	static String greeting(String first) {
		String greet="Hi my name's "+first+", what's your name?";
		return greet;}
	static String prayer(String first) {
		String pray="Dear Lord, I, "+first+", pray for peace and strength.";
		return pray;}
	static String takenap(String first) {
		String nap=first+" is sleeping.\nZZZ ZZZZZ ZZZZZ";
		return nap;}
	static String eat(String first) {
		String food=first+" is eating.\nHe really likes pizza!";
		return food;}
	static String getname(person instance) {
		String first=instance.firstname;
		String last=instance.lastname;
		String name=first+last;
		return name;}
	static void setreligion(person instance) {
		System.out.print("What did they change their religion to?");
		String newrel=userinput.nextLine();
		instance.religion=newrel;}
	// get the person info from the user
	public static void main(String[] args) {
		person person1=new person();
		System.out.print("Enter a person's first name");
		person1.firstname=userinput.nextLine();
		System.out.print("Enter their last name");
		person1.lastname=userinput.nextLine();
		System.out.print("Enter their gender (male or female)");
		person1.gender=userinput.nextLine();
		System.out.print("Enter their age (integer)");
		person1.age=userinput.nextInt();
		System.out.print("Enter their weight (lbs)");
		person1.weight=userinput.nextDouble();
		System.out.print("Enter their height (in)");
		person1.height=userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Enter their ethnicity");
		person1.ethnicgroup=userinput.nextLine();
		System.out.print("Enter their religion");
		person1.religion=userinput.nextLine();
		while (true) {
			// figure out what tasks the user wants the person to do
			System.out.println("\n\nWhich of the following activities "
					+ "\nwould you like this person to do?:\n"
					+ "1. Say a greeting\n2. Say a prayer\n3. Take a nap"
					+ "\n4. Eat Something\n5. Return their name\n6. Change their religion");
			String resp=userinput.nextLine();
			// perform the task that the user chooses and display the results
			if (resp.equals("1")) {
				String greet=greeting(person1.firstname);
				System.out.print(greet);}
			else if (resp.equals("2")) {
				String pray=prayer(person1.firstname);
				System.out.print(pray);}
			else if (resp.equals("3")) {
				String nap=takenap(person1.firstname);
				System.out.print(nap);}
			else if (resp.equals("4")) {
				String food=eat(person1.firstname);
				System.out.print(food);}
			else if (resp.equals("5")) {
				String name=getname(person1);
				System.out.print("Their full name is: "+name+".");}
			else if (resp.equals("6")) {
				setreligion(person1);
				System.out.print("Their new religion is: "+person1.religion+".");}
			else {
				System.out.print("Thanks for the information.");
				break;
			}
		}
	}
}
