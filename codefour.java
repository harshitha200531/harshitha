class codefour{

    public static void main(String[] args){
        char[] ch={'A','B','C'};
        int[] arr=new int[ch.length];
        for(int i=0;i< ch.length;i++){
            arr[i]=(int) ch[i];
        }
        for(int i=0;i<ch.length;i++){
        System.out.println(ch[i]+"="+arr[i]);

    }
    }
}