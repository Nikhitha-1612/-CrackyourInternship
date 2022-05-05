class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[0].length; j ++){
                if(helper(board, word, i, j, 0)){return true;}
            }
        }
        return false;
    }
    
    public boolean helper(char[][] board, String word, int x, int y, int i){
        if(i >= word.length()){return true;}
        
        if(x >= board.length || x < 0 || y >= board[0].length || y < 0){
            return false;
        }
        
        if(board[x][y] != word.charAt(i)){return false;}
        
        board[x][y] ^= 256;
        boolean ret = 
            helper(board, word, x+1, y, i+1) || 
            helper(board, word, x-1, y, i+1) ||
            helper(board, word, x, y+1, i+1) || 
            helper(board, word, x, y-1, i+1);
        board[x][y] ^= 256;
        
        return ret;
          
    }

}
