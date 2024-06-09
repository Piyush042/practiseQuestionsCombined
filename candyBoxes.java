import java.util.PriorityQueue;

public class candyBoxes {
    static int minTimeToCollect(int[] boxes, int n) {
        // Create a min-heap priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert all the boxes into the priority queue
        for (int i = 0; i < n; i++) {
            pq.offer(boxes[i]);
        }

        int totalTime = 0;

        // Continue merging until there is only one box left
        while (pq.size() > 1) {
            // Remove the two boxes with the smallest number of candies
            int firstBox = pq.poll();
            int secondBox = pq.poll();

            // Calculate total candies and add it to totalTime
            int totalCandies = firstBox + secondBox;
            totalTime += totalCandies;

            // Merge the two boxes by adding their total candies back into the priority queue
            pq.offer(totalCandies);
        }

        return totalTime;
    }

    public static void main(String[] args) {
        // Example usage
        int[] boxes = {1, 2, 3, 4,5};
        int n = 5;
        System.out.println(minTimeToCollect(boxes, n)); // Output: 19
    }
}

