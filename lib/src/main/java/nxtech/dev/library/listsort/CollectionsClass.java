
package nxtech.dev.library.listsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class CollectionsClass {

    // Sort strings alphabetically
    public void setSortByString(
            ArrayList<HashMap<String, Object>> listmap,
            final String key,
            final boolean isDesc) {

        Collections.sort(listmap,
            new Comparator<HashMap<String, Object>>() {
                @Override
                public int compare(
                        HashMap<String, Object> a,
                        HashMap<String, Object> b) {

                    String first = String.valueOf(a.get(key));
                    String second = String.valueOf(b.get(key));

                    if (isDesc) {
                        return second.compareToIgnoreCase(first);
                    }

                    return first.compareToIgnoreCase(second);
                }
            });
    }

    // Sort whole numbers
    public void setSortByNumber(
            ArrayList<HashMap<String, Object>> listmap,
            final String key,
            final boolean isDesc) {

        Collections.sort(listmap,
            new Comparator<HashMap<String, Object>>() {
                @Override
                public int compare(
                        HashMap<String, Object> a,
                        HashMap<String, Object> b) {

                    long first = Long.parseLong(
                            String.valueOf(a.get(key)));
                    long second = Long.parseLong(
                            String.valueOf(b.get(key)));

                    if (isDesc) {
                        return Long.compare(second, first);
                    }

                    return Long.compare(first, second);
                }
            });
    }
}
