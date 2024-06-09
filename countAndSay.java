public class countAndSay {
    static String nthchar(int n){
        if(n==1){
            return "1";
        }
        String say = nthchar(n-1);

        StringBuilder result = new StringBuilder();

       int i =0;
       while (i<say.length()){
           int count =1;
           while(i+1<say.length() && say.charAt(i) == say.charAt(i+1)){
               count++;
               i++;
           }
           result.append(count);
           result.append(say.charAt(i));
           i++;
       }
       return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(nthchar(4));
    }
}
