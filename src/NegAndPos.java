import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegAndPos {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void isThisNegOrPos(String name){

    }
    private static String getStringAsInput() {
        String data = null;

        try {
            data = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static int getIntAsInput() {
        return Integer.parseInt(getStringAsInput());
    }
}
