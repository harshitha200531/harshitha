class Student{
    int id;
    String name;
    int age;
    Student(int a,String b,int c){
        id=a;
        name=b;
        age=c;
        System.out.println(id+name+age);

    }
}
public class code10{
    public static void main(String[] args){
        Student S1= new Student(1 , "harsh" , 20);
        Student S2= new Student(2 , "janu" , 30);
    }
}