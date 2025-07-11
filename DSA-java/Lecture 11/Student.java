
public class student {
    int rollno;
    String studentname;

    class teacher{
        String teachername;
        int salaries;
    }

    public static void main(String[] args) {
        student sc = new student();
        sc.rollno = 1;
        sc.studentname = "abhi";
        System.out.println(sc.rollno);
        System.out.println(sc.studentname);

        teacher t = new teacher();
        t.teachername = "ramesh";
        t.salaries = 5000;
        System.out.println(t.teachername);

        
    }

}