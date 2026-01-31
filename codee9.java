public class codee9{
    public static void main(String[] args){
        int[] a={10,20,30};
        int[] b={15,25,35};
        int i;
        int max1=a[0];
        int max2=b[0];
        for(i=1; i<a.length; i++){
            if(a[i]>max1){
                max1=a[i];
            }
        }
        for(i=1; i<b.length; i++){
            if(b[i]>max2){
                max2=b[i];
            }
        }
        if(max1>max2){
        System.out.println("largest number is:"+max1);
    } else {
         System.out.println("largest number is:"+max2);

    }

    }
}
