abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("hello");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("long");
    }
}
public class codee5{
    public static void main(String[] args){
        Circle cl=new Circle();
        cl.draw();
        cl.message();
    
    }
}