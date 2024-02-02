package maang.flipGame;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // "++++"
        String currentState = "++++";
        System.out.println(generatePossibleNextMoves(currentState));
    }

    public static List<String> generatePossibleNextMoves(String currentState) {
        List<String> possibleStates = new ArrayList<>();
        StringBuilder sb = new StringBuilder(currentState);
        for(int i = 0 ; i < currentState.length() - 1 ; i++){
            if(currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+'){
                sb.setCharAt(i, '-');
                sb.setCharAt(i + 1, '-');
                possibleStates.add(sb.toString());
                sb.setCharAt(i, '+');
                sb.setCharAt(i + 1, '+');
            }
        }
        return possibleStates;
    }
}
