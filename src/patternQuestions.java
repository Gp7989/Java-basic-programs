public class patternQuestions {
    public static void main(String[] args) {
      /*  for(int i=0 ; i<5 ; i++){
          //  System.out.println("*");
            for(int j =0 ; j<5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       */
        int a = 4;
        int b = 5;
        for(int i = 1 ; i <=a ; i++){
            for (int j =1 ; j <=b ;j++){
                if (i==1 || j==1 || i==a|| j  == b){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
