public class checkStringrotations {
    static boolean checkRotation(String s1 , String s2){
        StringBuilder resultStr = new StringBuilder();
        resultStr.append(s1).append(s1);
        return resultStr.lastIndexOf(s2) != -1;

    }
}
