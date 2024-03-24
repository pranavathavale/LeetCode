import java.util.ArrayList;
import java.util.Collections;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        ArrayList<Integer> altitudes = new ArrayList<Integer>();
        for (int i = 0; i < gain.length; i++)
        {
            altitude = altitude + gain[i];
            altitudes.add(altitude);
        }
        if (Collections.max(altitudes) > 0)
        {
            return Collections.max(altitudes);
        }
        else
        {
            return 0;
        }
    }
}
