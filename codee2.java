class Animal{
    void Sound(){
        System.out.println("hello");
    
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("hi");

    }
}
public class codee2{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.Sound();
    }
}