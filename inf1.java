import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class inf1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMonsters = sc.nextInt();
        int playerExp = sc.nextInt();
        int[] monsterPowers = new int[numMonsters];
        int[] monsterBonuses = new int[numMonsters];

        for(int i = 0; i < numMonsters; i++){
            monsterPowers[i] = sc.nextInt();
        }

        for(int i = 0; i < numMonsters; i++){
            monsterBonuses[i] = sc.nextInt();
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<numMonsters;i++){
            map.put(monsterPowers[i], monsterBonuses[i]);
        }

        int monstersDefeated = 0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int mpower = entry.getKey();
            int bonus = entry.getValue();
            if(playerExp>=mpower){
                monstersDefeated ++;
                playerExp += bonus;
            }
            else{
                break;
            }
        }
        System.out.println(monstersDefeated);
    }
}
