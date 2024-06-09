import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    static ArrayList<Integer> findnth(int r){
        ArrayList<Integer> list = new ArrayList<>();
        int result = 1;
        list.add(1);
        for(int i =1;i<r;i++){  //n-1cr-1 for 6 th row 5/1
            result = result* (r-i);

            result = result/(i);

            list.add(result);
        }
        return  list;
    }
    static ArrayList<List<Integer>> printPascal(int n ){
        ArrayList<List<Integer>>res = new ArrayList<>();


        for(int i =1;i<=n;i++){
            res.add(new ArrayList<>(findnth(i)));
        }
        return res;
    }


    public static void main(String[] args) {
        int n =6;
        System.out.println(printPascal(5));
       // System.out.println(findnth(5));
    }
}
