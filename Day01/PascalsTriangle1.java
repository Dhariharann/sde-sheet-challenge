import java.util.ArrayList;
import java.util.List;   

class PascalsTriangle1 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List <List<Integer>> mainTriangle = new ArrayList<>();
        int i, j;
        //first make sure end of rows are always 1
        for(i=0; i<numRows; i++)
        {
            List<Integer> rows = new ArrayList<>();

            for(j=0; j<=i; j++)
            {
                if(j==0 || j==i)
                {
                    rows.add(1);
                }
                //now middle elements -- sum of middle elements [2] above the current row 
                else
                {
                    int left = mainTriangle.get(i-1).get(j-1);
                    int right = mainTriangle.get(i-1).get(j);
                    rows.add(left + right);
                }
            }
            mainTriangle.add(rows);
        }
        return mainTriangle;
    }

}