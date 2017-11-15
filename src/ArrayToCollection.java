import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**

 * Created by KHOAND on 11/15/2017.
 */
public class ArrayToCollection {
    public static ArrayToCollection instance;

    public static ArrayToCollection getInstance() {
        if (instance == null) {
            instance = new ArrayToCollection();
        }
        return instance;
    }

    public void demo() throws IOException {
        BufferedReader in = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array: ");
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = in.readLine();
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for (String li : list) {
            String str = li;
            System.out.print(str + " ");
        }
    }
}
