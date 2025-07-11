
public class StudentsClass{

	// creating a new data type
	public static class Student{
		String name;
		int rno;
		double per;
	}

	public static void change(Student s){
		s.name="aman";
	}

	

	public static void main(String[] args) {

	class Car{
		String name;
		String type;
		int price;
	}

		// Car c1 = new Car();
		// c1.name="alto";
		// c1.price

		Student s1 = new Student();
		s1.name="abhi";
		s1.rno=22;
		s1.per=90.1;
		System.out.println(s1.name);

		change(s1); // classes are passed by refernce
		System.out.println(s1.name);

		// s1.name="Abhishek"; // update
		// System.out.println(s1.name);


		Student s2 = new Student();
		s2.name="navin";
		s2.rno=22;
		s2.per=78;
		System.out.println(s2.name);

	}
}