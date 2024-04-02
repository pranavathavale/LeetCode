public class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1String = "";
        String word2String = "";

        for(String word : word1)
        {
            word1String += word;
        }

        for(String word : word2)
        {
            word2String += word;
        }

        return word1String.equals(word2String);
    }
}
