package week3.day1;

public class Student {
public static void studentInfo(int id) {
	System.out.println("The Student Id is "+id);
}
public void studentInfo(int id1,String name) {
	System.out.println("The Student Id is "+id1);
	System.out.println("The Student Name is  "+name);
}
public void studentInfo(String email,long phoneNumber) {
	System.out.println("The student Email id is "+email);
	System.out.println("The student phone number is " +phoneNumber);
}
public static void main(String[] args) {
	Student stud = new Student();
	stud.studentInfo(245);
	stud.studentInfo(242, "Babu");
	stud.studentInfo("abc24@gmail.com", 8745961236L);
}

}
