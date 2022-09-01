import java.util.Scanner;
import java.lang.*;

/**
 * @author dehay234
 * @version 1.0
 * @see LNums
 *
 */
public class Main {
    /**
     *
     * @param args - First N Luke Numbers
     */
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int N;

        if(args.length==0) {
            System.out.print("Enter N:");
            N = scanner.nextInt();
        }
        else {
            N = Integer.parseInt(args[0]);
        }

        LNums[] arr = new LNums[N];
        LNums.setArr(arr);

        LNums.search(arr);


    }

}
