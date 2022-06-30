package Method;

public class Method1 {
    static void Methodeg1(){
      int i;
      for (i=0;i<10;i++){
        if (i==5){
            continue;
        }else{
            System.out.println(i);
        }
      }
    }
    public static void main(String[] args){
        Methodeg1();
    }
}
