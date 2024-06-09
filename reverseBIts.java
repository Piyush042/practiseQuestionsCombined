public class reverseBIts {

    static int revbits(long n) {
        // Ensure the input number fits within 32-bit representation
        n = n & 0xFFFFFFFFL;

        // Convert the number to a 32-bit binary string
        String s = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');

        // Reverse the string
        String reversedStr = new StringBuilder(s).reverse().toString();

        // Convert the reversed binary string to a 32-bit integer
        return Integer.parseInt(reversedStr, 2);
    }

    public static void main(String[] args) {
          long n = 4294967293L;
        System.out.println(revbits(n));

    }
}
