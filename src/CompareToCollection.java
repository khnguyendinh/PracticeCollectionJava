import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**

 * Created by KHOAND on 11/15/2017.
 */
public class CompareToCollection {
    public static CompareToCollection instance;

    public static CompareToCollection getInstance() {
        if (instance == null) {
            instance = new CompareToCollection();
        }
        return instance;
    }

    public void demo()  {
        String[] coins = { "Penny", "nickel", "dime",
                "Quarter", "dollar" };
        Set set = new TreeSet();
        for (int i = 0; i < coins.length; i++)
            set.add(coins[i]);
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set,
                String.CASE_INSENSITIVE_ORDER));
        for(int i=0;i<= 10;i++)
            System.out.print("-");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set,
                String.CASE_INSENSITIVE_ORDER));
    }
}
