public class tryCatch {
    static  void divide(int nr, int dr){
        try {
            int result = nr/dr;
            System.out.println(result);

        }
        catch(NullPointerException e){
            System.out.println("An error Occurred" + e.getMessage());
        }
        catch (Exception e){
            System.out.println("An error occurred"+ e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }

    }

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        divide(x,y);
    }
}
