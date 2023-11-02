package mostVisitedSectorCircularTrack;

import java.util.ArrayList;
import java.util.List;
/*
Given an integer n and an integer array rounds. We have a circular track which consists of n sectors labeled from 1 to n.
A marathon will be held on this track, the marathon consists of m rounds.
The ith round starts at sector rounds[i - 1] and ends at sector rounds[i].
For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]
Return an array of the most visited sectors sorted in ascending order.

Notice that you circulate the track in ascending order of sector numbers in the counter-clockwise direction
(See the first example).
* */
public class Solution {
    public static void main(String[] args) {
        int sectors = 4;
        //4 {1,3,1,2} , 2 [2,1,2,1,2,1,2,1,2], 7 [1,3,5,7]
        int[] rounds = {1,3,5,7};
        Solution solution = new Solution();
        System.out.println("Most visited sectors : " + solution.mostVisited(sectors, rounds));
    }

    public List<Integer> mostVisited(int n , int[] rounds){
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        List<Integer> answer = new ArrayList<>();
        if(start <= end){
            for (int i = start; i <= end ; i++) {
                answer.add(i);
            }
        }else{
            for (int i = 1; i <= end ; i++) {
                answer.add(i);
            }
            for (int i = start; i <= n ; i++) {
                answer.add(i);
            }
        }
        return answer;
    }
}
