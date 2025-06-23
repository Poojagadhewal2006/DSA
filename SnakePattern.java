

public class SnakePattern {
    public static void printSnakePattern(int [][] matrix)
    {
        int rows = matrix.length;
        for(int i=0;i<rows;i++)
        {
            if(i%2 == 0)
            {
                for(int j=0;j<matrix[i].length;j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else 
            {
                for(int j=matrix[i].length-1;j>=0;j--)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println("Snake Pattern : ");
        printSnakePattern(matrix);
    }
}
