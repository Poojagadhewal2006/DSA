public class MatrixSearch {
    public static boolean search(int [][] matrix,int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j=cols-1;
        while(i<rows && j>=0)
        {
            if(matrix[i][j] == target)
            {
                System.out.println("Element found at position : (" + i + ", " + j + ")");
                return true;
            }
            else if(matrix[i][j] > target)
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        System.out.println("Element not found. ");
        return  false;
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17}
        };
        int target = 5;
        if(!search(matrix, target))
        {
            System.out.println("Element " + target + " is not in the matrix . ");
        }
    }
}
