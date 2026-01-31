class Animal{
    void sound(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("dog");
    }
}
public class codee1 {
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.Bark();
        dg.sound(); 
    }
}
