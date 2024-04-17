public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i] = digits[i] + 1;
                return digits;
            }
            else if(digits[i] == 9 && digits.length > 1)
            {
                digits[i] = 0;
            }
            else if(digits[i] == 9)
            {
                digits = new int[]{1,0};
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
}
