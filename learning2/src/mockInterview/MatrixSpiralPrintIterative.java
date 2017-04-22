package mockInterview;


public class MatrixSpiralPrintIterative implements MatrixSpiralPrintI{
    @Override
    public void matrixSpiralPrint(int[][] matrix) {
        if (matrix == null || matrix[0]== null)
            return;

        int topRow = 0;
        int btmRow = matrix.length -1;
        int leftCol = 0;
        int rightCol = matrix[0].length -1;
        while(topRow <= btmRow && leftCol <= rightCol){
            for(int i = leftCol; i <= rightCol; i ++)
                System.out.println(matrix[topRow][i]);
            topRow ++;
            
            for(int i = topRow; i <= btmRow; i++)
                System.out.println(matrix[i][rightCol]);
            rightCol --;
            
            for(int i = rightCol; i>= leftCol; i-- )
                System.out.println(matrix[btmRow][i]);
            btmRow --;
            
            for(int i = btmRow; i >= topRow; i--)
                System.out.println(matrix[i][leftCol]);
            leftCol ++;
        }
        
    }

}

