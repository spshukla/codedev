import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shreeprakash on 1/4/16.
 */
public class MainApplicationTest {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String numToBeSearched = bufferRead.readLine();

        BufferedReader bufferRead1 = new BufferedReader(new InputStreamReader(System.in));
        String numOfElements = bufferRead1.readLine();

        BufferedReader bufferRead2 = new BufferedReader(new InputStreamReader(System.in));
        String numbers1 = bufferRead2.readLine();
        System.out.println(numbers1);

        String num[] = numbers1.split(" ");
        for(int i=0;i<Integer.valueOf(numOfElements);i++) {
            if(numToBeSearched.equals(num[i])) {
                System.out.println(i-1);
            }
        }
    }
}
