package maang.stringCompression;

public class Solution {
    public static void main(String[] args) {
        //'a','a','b','b','c','c','c'
        // "a","b","b","b","b","b","b","b","b","b","b","b","b"
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));

    }
    public static int compress(char[] chars) {
        int indexAns = 0; // keep track of current position in compressed array
        int index = 0;  // iterate through input array using this pointer
        while(index < chars.length){
            char currentChar = chars[index]; // current character being compressed
            int count = 0;  // count of consecutive occurrences of letter
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;  // count consecutive occurrences of letter in input array
            }
            // write letter to compressed array
            chars[indexAns++] = currentChar;

            // if count is greater than 1, write count as string to compressed array
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    // convert count to string and iterate over each character in string
                    chars[indexAns++] = c;
        }
        System.out.println(chars);
        return indexAns; // return length of compressed array
    }
}

/*
Time complexity: O(n)
Space complexity: O(1)
*/