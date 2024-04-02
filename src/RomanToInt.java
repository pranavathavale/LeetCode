import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int outputNumber = 0;
        HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>()
        {{  put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for(int i = 0; i < s.length(); i ++)
        {
            if(i+1 < s.length() && (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))))
            {
                outputNumber -= romanValues.get(s.charAt(i));
            }
            else
            {
                outputNumber += romanValues.get(s.charAt(i));
            }
        }

        return outputNumber;
    }
}
