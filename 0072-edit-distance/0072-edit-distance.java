class Solution {

    
    public int min1(int a, int b, int c){
        return Math.min(a,Math.min(b,c));  
    }


    public int minDistance(String word1, String word2) {

int m = word1.length();
int n = word2.length();
 
int [][] mat = new int[m+1][n+1];
for(int i = 0; i <= m; i++){
    mat[i][0] = i;
}

for(int j = 0; j <= n; j++){
    mat[0][j] = j;
}
for(int i = 1; i<=m ; i++){
    for(int j = 1; j<=n ; j++){

       int top = mat[i-1][j];
        int left = mat[i][j-1]; 
        int diag = mat[i-1][j-1] ;
        

        
    if(word2.charAt(j-1) == word1.charAt(i-1)) {
    mat[i][j] = diag;
}
else {
    mat[i][j] = min1(top,left,diag)+1;
}


    }
}
        
    return mat[m][n];
    }
}
 