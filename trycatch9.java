import static java.lang.Character.isLetter;

public class trycatch9 {
    static void findNo(int n){
        int x = 0;
        try{

            x = 12%n;
            System.out.println(x);

        }
        catch (Exception e){
            System.out.println("error division");
        }

    }

    public static void main(String[] args) {
        int n = 3;
        findNo(5);
        String s= "75dh ";
        //if(Character.isLetterOrDigit(s.charAt(0)));

    }

}
