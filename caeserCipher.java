public class caeserCipher {
    static String securedMsg(String message, int key){
            int[] arr = new int[message.length()];
            for(int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                if(Character.isLetter(ch)) {
                    int base = Character.isLowerCase(ch) ? 'a' : 'A';
                    arr[i] = (ch - base + key) % 26 + base; // Modulo 26 ensures wrapping around the alphabet
                } else {
                    arr[i] = ch; // Preserve non-alphabetic characters
                }
            }
            return new String(arr, 0, arr.length);
        }


    public static void main(String[] args) {
        String s = "All the Besz";
        int key = 1;
        System.out.println(securedMsg(s,key));
    }

}
