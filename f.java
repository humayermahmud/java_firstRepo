public class f {
    // increment 
    /*public static void main(String[] args) {
        for(int i = 1 ; i<= 4 ; i++){
            System.out.println("Himel "+ i);
        }
    }*/
    // decrement
   /* public static void main(String[] args) {
        for(int i = 4 ; i >= 1 ; i--){
            System.out.println("Himel "+ i);
        }
    }*/
    // nasted for loop
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("Day "+i);
            for(int j =1 ; j<= 9 ; j++){
                System.out.println("    "+(j+8)+"  -  "+(j+9));
            }
        }
    }
}
