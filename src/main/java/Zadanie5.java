public class Zadanie5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("*         *");
//            for (int k=i; k<=i; ++k){
//                System.out.println("      *");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
        }
    }
}