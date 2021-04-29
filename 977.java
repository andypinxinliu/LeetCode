class Solution{
    public int findJudge(int N, int[][] trust) {
        int[] trusto = new int[N+1];
        int[] betrust = new int[N+1];
        for(int[] i : trust){
            trusto[i[0]]++;
            betrust[i[1]]++;
        }
        for(int i=1;i<=N;i++){
            if(trusto[i] == 0 && betrust[i] == N - 1)
                return i;
        }
        return -1;
    }
    
}
