class Solution {
    public int longestPalindromeSubseq(String text1) {
       int n = text1.length();
       String text2="";
        for(int i=n-1;i>=0;i--){
            text2= text2 + text1.charAt(i);
        }
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        return dp[n][m];
    } 
    
}