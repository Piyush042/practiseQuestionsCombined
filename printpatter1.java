public class printpatter1 {
    static void print1(int n ){
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    static void printSquare(int n) {
        // Print the top border
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // Print the middle part with hollow spaces
        for (int j = 0; j < n - 2; j++) {
            System.out.print("* ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }

        // Print the bottom border
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }
    }


    public static void main(String[] args) {
        int n = 5;
       printSquare(n);
    }
}
