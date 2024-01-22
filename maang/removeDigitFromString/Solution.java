package maang.removeDigitFromString;

public class Solution {

    public static void main(String[] args) {
        String number = "123";
        Character digit = '3';
        System.out.println(removeDigit(number, digit));
    }
    public static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        for(int i = 0 ; i < number.length() - 1 ; i++){
            if(number.charAt(i) == digit && (number.charAt(i) - '0') < (number.charAt(i + 1) - '0')){
                sb.deleteCharAt(i);
                return sb.toString();
            }
        }
        int last = number.lastIndexOf(digit);
        sb.deleteCharAt(last);
        return sb.toString();
    }
}
