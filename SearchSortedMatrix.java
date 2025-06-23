

public class SearchSortedMatrix {
    public static boolean search(int[][] matrix,int key)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j = cols - 1;
        while(i < rows && j >=0)
        {
            if(matrix[i][j] == key)
            {
                System.out.println("Found at position : (" + i + ", " + j + ")");
                return true;
            }
            else if(matrix[i][j] > key)
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }
    public static void main(String[] args) {
        int[][]  matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 29;
        search(matrix,key);

    }
}
