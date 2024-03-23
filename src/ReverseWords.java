public class ReverseWords {
    public String reverseWords(String s) {
        String[] wordArray = s.split(" ");
        String finalWord = "";
        for(int i = wordArray.length - 1; i >= 0; i--)
        {
            finalWord = finalWord.concat(wordArray[i] + " ");
        }
        finalWord = finalWord.trim().replaceAll("\\s+", "\s");

        return finalWord;
    }
}
