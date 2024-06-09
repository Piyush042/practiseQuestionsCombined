import java.util.Arrays;
import java.util.Scanner;

public class fitTrainee {
    static void findTrainee(int[][] trainee){
        int[] avg = new int[3];
        for(int i=0;i<3;i++){
            int avgi =0;
            for(int j =0;j<3;j++){
               avgi += trainee[i][j];

            }

            avg[i] = avgi/3;
        }
        Arrays.sort(avg);
        int max = avg[avg.length-1];
        System.out.println(max);
        for(int i =0;i<3;i++){
            System.out.println(avg[i]);
            if(avg[i]<70) System.out.println("Unfit");
            else{
               if(avg[i] == max){
                   System.out.println("Trainee: "+ ++i);
               }
            }
        }

    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][]  trainee= {{95,92,95},{92,90,92},{90,92,90}};
//        for(int i=0;i<3;i++){
//            for (int j =0;j<3;j++){
//                trainee[i][j] = sc.nextInt();
//                if(trainee[i][j]>100){
//                    System.out.println("Invalid input");
//                    j--;
//                }
//            }
//        }
        findTrainee(trainee);
    }
}
