class Animal{
    void Sound(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("dog");
    }
}
class Human extends Animal{
    void Speak(){
        System.out.println("human");
    }
}
public class codee4{
    public static void main(String[] args){
        Dog dg=new Dog();
        Human hg=new Human();
        dg.Sound();
        dg.Bark();
        hg.Speak();


    }
}