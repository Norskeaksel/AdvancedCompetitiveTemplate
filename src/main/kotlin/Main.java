import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }


    public static void main(String[] args) throws IOException {
        try {
            br = new BufferedReader(new FileReader("src/main/kotlin/Input.txt"));
            out = new PrintWriter(new FileWriter("src/main/kotlin/Output.txt"));
        } catch (FileNotFoundException e) {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(System.out));
        }
        int n = readInt();
        System.out.println(solve());
        out.close();
    }

    public static String solve() {
        return "";
    }
}
