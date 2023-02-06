package assessment;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter X: ");
        int X = scanner.nextInt();
        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array A: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = valuesInBetween(N, X, Y, A);
        System.out.println(result);
    }
    
    public static ArrayList<Integer> valuesInBetween(int N, int X, int Y, int[] A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (X < A[i] && A[i] < Y) {
                result.add(A[i]);
            }
        }
        return result;
    }
}

