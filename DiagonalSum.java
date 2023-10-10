import java.util.Scanner;

public class DiagonalSum {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 },
                          { 4, 5, 6 },
                          { 9, 8, 9} };
        System.out.println(diagonalDifference(array));
    }
    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int sumOfPrim=0;
        int sumOfSec=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                    sumOfPrim+=arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j-i==2 || i-j==2){
                    sumOfSec+=arr[i][j];
                } else if (i==1 && j==1) {
                    sumOfSec+=arr[i][j];
                }
            }
        }

        return Math.abs(sumOfPrim-sumOfSec);
    }

}
