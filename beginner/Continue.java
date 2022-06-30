public class Continue {
    public static void main(String[] args){
        for(int i=0; i<10;i++){
            if (i==4){
                continue;// bo qua gia tri i=4 va tiep tuc in ra cac gia tri tieps theo
            }else{
                System.out.println(i);
            }
        }
    }
}
