public class makePerfectString {
    static int validString(String s){
        int n = s.length();
        int countStar = 0;
        int countHash =0;
        for(int i =0;i<n;i++){
            if(s.charAt(i)== '*'){
                countStar++;
            } else if (s.charAt(i)=='#') {
                countHash++;
            }
        }
        return countStar-countHash;
    }
}
