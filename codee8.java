interface Payment{
    void pay();
}
class upi implements Payment{
    public void pay(){
        System.out.println("Paying");
    }
}
public class codee8{
    public static void main(String[] args){
        upi Payment=new upi();
        Payment.pay();
    
    }
}