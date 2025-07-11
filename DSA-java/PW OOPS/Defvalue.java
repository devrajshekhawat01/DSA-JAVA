
class Student{
		String name;
		private int rno;
		double per;
	}


class DefValue{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rno=11;
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s1.per);
		
	}
}