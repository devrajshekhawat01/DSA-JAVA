
 class Student{

	public String name;
	private int rno;
	double per;

	public int getRno()  // getters
	{
		return rno;
	}

	public void setRno(int roll)  // setter function
	{
		rno=roll;
	}


}

public class getter{

	public static void change(Student s)
	{
		s.name="rohan";
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="Abhi";
		s1.per=92.2;
		// s1.rno=33;

		// System.out.println(s1.getRno());

		s1.setRno(200);
		System.out.println(s1.getRno());

	}
}