public class numSumInStrings {
    static boolean isNum(char c ){
        return Character.isDigit(c);
    }
    static  int findSum(String s){
        int sum = 0;
        for(int i =0;i<s.length();i++ ){
            if(isNum(s.charAt(i))){
                sum+= s.charAt(i)-'0';
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s= "this 4 5 di s8";
        System.out.println(findSum(s));
    }
}
