public class PascalsTriangle {
   public static void printPascalsTriangle(int n)
   {
    for(int line =0 ;line < n; line++)
    {
        int value =1;
        for(int space = 0; space < n; space++)
        {
            System.out.print(" ");
        }
        for(int i=0;i<=line;i++)
        {
            System.out.print(value + " ");
            value = value*(line - i)/(i+1);
        }
        System.out.println();
    }
   } 
   public static void main(String[] args) {
    int n =5;
    System.out.println("Pascals Triangle : ");
    printPascalsTriangle(n);
   }
}
