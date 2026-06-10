class Student{
    int roll;
    String name;
    int marks;
}

public class ArrayObject {
    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.roll=1;
        s1.name="Alice";
        s1.marks=85;

        Student s2 = new Student();
        s2.roll=2;  
        s2.name="Bob";
        s2.marks=90;

        Student s3 = new Student();
        s3.roll=3;
        s3.name="Charlie";
        s3.marks=95;

        Student students [] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
           System.out.println(students[i].name +":"+students[i].marks);
        }

    }
}