import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        // TODO: Implement.
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        String report = "";
        for (Seasonable seasonable : seasonables) {
            report += seasonable.toString()+ "\n";
        }
        return report;
    }
}
