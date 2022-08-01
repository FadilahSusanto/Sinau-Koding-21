public class tugas2 {

   public static void main(String []args) {
      int bil;
      for(int x = 0; x <= 15; x++) {
         bil=0;
            for (int j=1;j<=x;j++){
                if (x%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.println(x+" adalah bilangan prima");
            }else{
               System.out.println(x+" bukan bilangan prima");
            }
      }
   }
}