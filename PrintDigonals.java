public class PrintDigonals {
    public static void printDigonals(int [][] matrix)
    {
        int n = matrix.length;
        System.out.println("Primary Diagonal : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(matrix[i][i] + " ");
        }
            System.out.println();
            System.out.println("Secondary Diagonal : ");
            for (int i=0;i<n;i++)
            {
                System.out.print(matrix[i][n-1-i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int [][] matrix  = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
            System.out.println("Matrix : ");
            for(int [] row : matrix)
            {
                for(int val : row)
                {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            printDigonals(matrix);
        }
    }

