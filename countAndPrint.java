public class countAndPrint {
    static String counter (int n){
        if(n==1){
            return "1";
        }
        String say = counter(n-1);
        int i=0;
        StringBuilder res = new StringBuilder();
        while(i<say.length()){
            int count =1;
            while(i+1<say.length() && say.charAt(i)== say.charAt(i+1)){
                count++;
                i++;
            }
            res.append(count);
            res.append(say.charAt(i));
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(counter(n));
    }
}
