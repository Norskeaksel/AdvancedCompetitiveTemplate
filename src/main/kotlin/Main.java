import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter writer = new PrintWriter(System.out, false);

    public static void main(String[] args) throws IOException {
        while (true) {
            String a = read();
            String b = read();
            if (a.equals("0") && b.equals("0")) break;
            writer.println(solve(a, b));
        }
        writer.flush();
    }

    static String read() throws IOException {
        StringTokenizer tokenizer = new StringTokenizer("");
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int solve(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger prev2 = BigInteger.ONE;
        BigInteger prev1 = BigInteger.ONE.add(BigInteger.ONE);
        if (A.compareTo(BigInteger.ONE) <= 0) {
            if (B.equals(BigInteger.ONE)) return 1;
            if (B.equals(new BigInteger("2"))) return 2;
        }
        int nr = 0;
        while (prev2.add(prev1).compareTo(B) <= 0) {
            if (prev2.add(prev1).compareTo(A) >= 0) {
                nr++;
            }
            BigInteger cur = prev2.add(prev1);
            prev2 = prev1;
            prev1 = cur;
        }
        return nr;
    }
}
