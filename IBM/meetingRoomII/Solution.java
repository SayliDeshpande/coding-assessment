package meetingRoomII;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[][] input = {{1, 10}, {2, 7}, {3, 19}, {8, 12}, {10, 20}, {11, 30}};
        Solution solution = new Solution();
        System.out.println("Approach 1 : Meeting rooms required : " + solution.minMeetingRooms_approach1(input));
        System.out.println("Approach 2 : Meeting rooms required : " + solution.minMeetingRooms_approach2(input));

    }

    public int minMeetingRooms_approach1(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // sort with start times
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        // maintain heap of end times
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(
                intervals.length,
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a - b;
                    }
                }
        );
        // allocate new to room to first meeting
        heap.add(intervals[0][1]);
        // iterate over interval and find either new room or existing to next meeting
        // by comparing, statr time of next meeting with end time of previous meeting
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= heap.peek()) {
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }
        return heap.size();

    }

    public int minMeetingRooms_approach2(int[][] intervals) {
        // makes two separate arrays of start times and end times
        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        //sort start times
        Arrays.sort(start, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        // sort end times
        Arrays.sort(end, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        // use two pointers
        int start_pointer = 0;
        int end_pointer = 0;
        int rooms = 0;
        // now, compare elements in start array with elements in end array
        while (start_pointer < intervals.length) {
            // if start[i] <= end[i] = allocate new room else use existing room
            if (start[start_pointer] >= end[end_pointer]) {
                rooms--;
                end_pointer++;
            }
            // update two pinters accordingly
            rooms++;
            start_pointer++;

        }
        return rooms;
    }
}

