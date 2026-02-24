import java.util.Scanner;

public class sparseMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        // Reading matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Printing matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Count non-zero elements
        int count = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] != 0)
                    count++;

        // Sparse matrix in 3-tuple form
        int[][] sparse = new int[count + 1][3];

        sparse[0][0] = r;
        sparse[0][1] = c;
        sparse[0][2] = count;

        int k = 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != 0) {
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = a[i][j];
                    k++;
                }
            }
        }

        // Printing sparse matrix
        System.out.println("\nSparse matrix (3-tuple form):");
        System.out.println("Row Col Value");

        for (int i = 0; i <= count; i++) {
            System.out.println(
                    sparse[i][0] + "   " +
                    sparse[i][1] + "   " +
                    sparse[i][2]);
        }
    }
}