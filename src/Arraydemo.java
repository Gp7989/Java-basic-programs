public class Arraydemo {
    public static void main(String[] args) {
  //      int arr[][] = new int[3][4];
//      for(int i=0 ; i<3 ;i++){
//          for (int j=0; j< 4 ; j++){
//              arr[i][j] = (int)(Math.random()*100);
//              System.out.print(arr[i][j]+" ");
//          }
//          System.out.println(" ");
//      }
//int arr[][] = new int[3][];  // jagged array
//        arr[0] = new int[3];
//        arr[1]= new int[4];
//        arr[2] = new int[2];
//        for(int i=0 ; i< arr.length;i++){
//            for (int j=0; j< arr[i].length ; j++){
//                arr[i][j] = (int)(Math.random()*100);
//            }
//        }
//        for(int n[] : arr){
//            for (int m : n){
//                System.out.print(m + " ");
//            }
//            System.out.println();
 //       }
        Object arr[] = new Object[4];
        arr[0] = 1;
        arr[1] = "asdfsfa";
        arr[2] = 23;
        for(Object n : arr){
            System.out.println(n);
        }
    }
}
