    class Person{
    private String name;
    private int age;

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
public class code11{
    public static void main(String[] args){
    Person P1=new Person();
    P1.setName("varshini");
    P1.setAge(20);
    System.out.println(P1.getName());
    System.out.println(P1.getAge());
}
}