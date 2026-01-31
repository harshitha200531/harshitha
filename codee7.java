interface Payment{
    void pay();
}
class upi implements Payment{
    public void pay(){
        System.out.println("Paying");
    }
}
public class codee7{
    public static void main(String[] args){
        upi gpay=new upi();
        gpay.pay();
    
    }
}