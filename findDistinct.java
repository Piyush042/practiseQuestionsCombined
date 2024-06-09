import java.util.HashSet;

public class findDistinct {

        static int finddistinct(int[] arr) {
            HashSet<Integer> distinctORs = new HashSet<>();

            for (int start = 0; start < arr.length; start++) {
                int currentOR = 0;
                for (int end = start; end < arr.length; end++) {
                    currentOR |= arr[end];
                    
                    distinctORs.add(currentOR);


                }
            }

            return distinctORs.size();
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            System.out.println(finddistinct(arr));
        }


}
