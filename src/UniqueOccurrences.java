import java.util.HashMap;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int counter = 1;
        for(int num: arr)
        {
            if (!hmap.containsKey(num))
            {
                hmap.put(num, 0);
            }
        }
        for(int num: arr)
        {
            if(hmap.keySet().contains(num))
            {
                hmap.put(num, hmap.get(num) + counter);
            }
        }
        if (hmap.values().stream().distinct().count() != hmap.keySet().stream().count())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
