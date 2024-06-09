import java.util.Arrays;

public class c9 {
    static int[] findVehicles(int v, int w) {
        int f = 1;
        int t = v;
        int[] storage = {-1, -1}; // Initialize with no solution found

        while (f < v && t > 0) {
            int fw = f * 4;
            int tw = t * 2;

            if (fw + tw == w) {
                System.out.println(fw+tw);
                storage[0] = f;
                storage[1] = t;
                break; // Exit the loop once a valid solution is found
            }
            f++;
            t--;
        }

        return storage;
    }

    public static void main(String[] args) {
        int v = 200;
        int w = 540;

        int[] result = findVehicles(v, w);
        System.out.println("fW = " + result[0] + " tW = " + result[1]);
    }
}
