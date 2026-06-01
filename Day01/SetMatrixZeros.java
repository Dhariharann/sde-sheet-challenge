class SetMatrixZeros 
{
    public void setZeroes(int[][] matrix) 
    {
        int i=0, j=0;
        int m, n;
        //length of rows and columns 
        m = matrix.length;
        n = matrix[0].length;
        //track rows and cols to change to zero 
        boolean[] rows = new boolean[m];
        boolean[] columns = new boolean[n];
        //find the zeros in matrix first and mark them true
        for( i=0;  i<m; i++)
        {
            for( j=0; j<n; j++)
            {
                if(matrix[i][j] == 0)
                {
                   rows[i] = true;
                   columns[j] = true; 
                }
            }
        }
        //change the marked rows and columns to zero
        for( i=0;  i<m; i++)
        {
            for( j=0; j<n; j++)
            {
                if( rows[i] || columns[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}