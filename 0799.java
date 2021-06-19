class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        //The easiest way is to build 2D array, for each row and each glass
        
        //The row needs adding 2 because the question gives us the row that starts
        //from 0. So the length is row + 1, but also in the for loop, we need to pour
        //water to the cup in the next row. So needs + 2
        
        //there are row + 3 glasses at (row + 1)
        double[][] res = new double[query_row + 2][query_row + 3];
        res[0][0] = poured;
        
        //iterate through each row and each glass
        //if bigger than 1, we will pour water
        
        for(int i = 0; i <= query_row; i++){
            for(int j = 0; j <= query_row + 1; j++){
                if(res[i][j] > 1){
                    
                    //row[i][j] will only pour water to two places, after pouring, goes to 1
                    res[i + 1][j] += (res[i][j] - 1) / 2;
                    res[i + 1][j + 1] += (res[i][j] - 1) / 2;
                    res[i][j] = 1;
                }
            }
        }
        return res[query_row][query_glass];
    }
}
