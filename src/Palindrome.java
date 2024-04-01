public class Palindrome {
    public boolean isPalindrome(int x) {
        String inputNumberString = Integer.toString(x);
        String outputString = "";
        for(int i = inputNumberString.length() - 1; i >= 0; i--)
        {
            outputString += inputNumberString.charAt(i);
        }
        return inputNumberString.equals(outputString);
    }
}
