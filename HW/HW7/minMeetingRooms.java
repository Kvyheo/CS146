import java.util.Arrays;
import java.util.PriorityQueue;

public class ServerManager {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
          Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        endTimes.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int startTime = intervals[i][0];

            if (!endTimes.isEmpty() && startTime >= endTimes.peek()) {
                endTimes.poll();
            }
            endTimes.offer(intervals[i][1]);
        }
        return endTimes.size();
    }

    public static void main(String[] args) {
        ServerManager serverManager = new ServerManager();

        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(serverManager.minMeetingRooms(intervals1));  

        int[][] intervals2 = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(serverManager.minMeetingRooms(intervals2)); 
    }
}
