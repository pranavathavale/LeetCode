public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int subIndex = 0;
        int originalIndex = 0;
        while(subIndex < s.length() && originalIndex < t.length())
        {
            if (s.charAt(subIndex) == t.charAt(originalIndex))
            {
                subIndex++;
                originalIndex++;
            }
            else
            {
                originalIndex++;
            }
        }
        return s.length() == subIndex;
    }
}
