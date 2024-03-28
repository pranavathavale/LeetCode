import java.util.Arrays;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String string1 = strs[0];
        String string2 = strs[strs.length - 1];
        String outputString = "";
        int stringLength = 0;
        if(string1.length() < string2.length())
        {
            stringLength = string1.length();
        }
        else
        {
            stringLength = string2.length();
        }
        for(int i = 0; i < stringLength; i++)
        {
            if(string1.charAt(i) == string2.charAt(i))
            {
                outputString += string1.charAt(i);
            }
            else
            {
                break;
            }
        }
        return outputString;
    }
}
