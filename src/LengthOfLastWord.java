public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String outputString = s.trim();
        int index = outputString.lastIndexOf(" ");
        outputString = outputString.substring(index + 1);
        return outputString.length();
    }
}
