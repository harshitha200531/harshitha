class Student{
    int id;
    String name;
    Student(int i,String name){
        id=i;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
    public class code9{
        public static void main(String[] args){
            Student S1=new Student(1,"ADI");
            Student S2=new Student(2,"PARI");
            S1.display();
            S2.display();
        }
    }
