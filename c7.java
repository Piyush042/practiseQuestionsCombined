public class c7 {
    static int count(char[] arr, int l) {

        int left = arr.length % l;

        int index = 0;
        int max = 0;

        while (index < arr.length - left) {
            int counta = 0;
            int j = index;
            if(index+l >= arr.length-left)break;
            while (j < index +l) { // Adjusted the loop condition
                if (arr[j] == 'a'){
                    counta++;
                }
                j++;

            }
            if (counta > max) {
                max = counta;
            }
            index += l-1;
        }

        int leftcount = 0;
        for (int i = arr.length - left; i < arr.length; i++) {
            if (arr[i] == 'a')
                leftcount++;
        }
        return Math.max(max, leftcount);
    }
    static int countera(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='a')count++;
        }
        return count;
    }

    static int counta(String s,int l){
        int n = s.length();
        int i =0;
        int maxCount =0;
        while (i<n){
            int count = countera(s.substring(i,Math.min(i+l,n)));
            maxCount = Math.max(count,maxCount);
            i+=l;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "bbbaaababa";

        char[] c = s.toCharArray();
        int l = 5;
        System.out.println(count(c, l));
        System.out.println(counta(s,l));
    }
}
