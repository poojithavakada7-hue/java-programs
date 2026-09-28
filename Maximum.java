import java.util.*;

class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++)
            pq.add(sc.nextInt());

        int score = 0;

        for (int i = 0; i < k; i++) {
            int m = pq.poll();
            score += m;
            pq.add(m + 1);
        }

        System.out.println(score);
    }
}