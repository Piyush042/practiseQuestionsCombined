import java.util.*;

public class avg_max_fruit {
    static void findWays(String[] s){

        HashMap<String,Double> map = new HashMap<>();
        double sumAvg = 0d;
        for(String val : s){
            String[] tokens = val.split(" ");
            double sum = Double.parseDouble(tokens[1]) * Double.parseDouble(tokens[2]);
            sumAvg += sum;
            map.put(tokens[0],map.getOrDefault(tokens[0],0d)+sum);

        }

        double max = Collections.max(map.values());
        for (Map.Entry<String,Double> entry: map.entrySet()){
            if(entry.getValue() == max) System.out.println(entry.getKey().replaceAll("\"",""));
        }
        System.out.println("avg is: " +sumAvg/3 );


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(sc.hasNextLine()){
           String s = sc.nextLine();
           if(s.isEmpty())break;
           list.add(s);

        }

        String[] str = new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i] = list.get(i);
        }
//        for(String string: list){
//            String[] entry = string.split(";");
//            findWays(entry);
//        }
        findWays(str);
    }
}
