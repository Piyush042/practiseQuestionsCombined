public class c3 {
    static int findHolidays(int n, String s){
        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday", "Sunday"};

        int index =1;
        int i=0;
        for(i=0;i<7;i++){
            if(days[i].equals(s)){
                break;
            }
        }
        int daytoSunday = 7-i-1;
        System.out.println(daytoSunday);
        n = n-daytoSunday;
        System.out.println(n);
        int count = n/7;
        return count+1;
    }

    public static void main(String[] args) {
        String s = "Monday";
        int n = 13;
        System.out.println(findHolidays(n,s));
    }
}
