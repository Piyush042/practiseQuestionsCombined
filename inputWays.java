import java.util.ArrayList;
import java.util.Scanner;

public class inputWays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        while (sc.hasNextLine()) { // when you want after two space program should be execute
//            String line = sc.nextLine();
//            if (line.isEmpty()) {
//                break;
//            }
//            String[] tokens = line.split("\\s");
//            for (String token : tokens) {
//                list.add(Integer.parseInt(token));
//            }
//
//        }
//
//        for (Integer val: list) {
//            System.out.println(val);
//        }
//    }

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            ArrayList<String> inputList = new ArrayList<>();
//
//            System.out.println("Enter input (press Enter twice to stop):");
//
//            while (true) {
//                String line = scanner.nextLine().trim();
//                if (line.isEmpty()) {
//                    break;
//                }
//                inputList.add(line);
//            }
//
//            System.out.println("Inputs stored in ArrayList:");
//            for (String input : inputList) {
//                String[] tokens = input.split("\\s+");
//                String firstString = tokens[0];
//                double secondDouble = Double.parseDouble(tokens[1]);
//                double thirdDouble = Double.parseDouble(tokens[2]);
//
//                System.out.println("First string: " + firstString);
//                System.out.println("Second double: " + secondDouble);
//                System.out.println("Third double: " + thirdDouble);
//                System.out.println();
//            }
//        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> inputList = new ArrayList<>();

            System.out.println("Enter input (press Enter twice to stop):");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    break;
                }
                inputList.add(line);
            }

            System.out.println("Inputs stored in ArrayList:");
            for (String input : inputList) {
                String[] entries = input.split("\\;");
                for(String entry : entries) {
                    String[] tokens = entry.split("\\s+");
                    String firstString = tokens[0];
                    double secondDouble = Double.parseDouble(tokens[1]);
                    double thirdDouble = Double.parseDouble(tokens[2]);

                    System.out.println("First string: " + firstString);
                    System.out.println("Second double: " + secondDouble);
                    System.out.println("Third double: " + thirdDouble);
                    System.out.println();
                }
            }
        }


}
