class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList();
        if(matrix.length==0)return res;
        
        int rowbegi=0;
        int rowend=matrix.length-1;
        int colbegi=0;
        int colend=matrix[0].length-1;
        while(rowbegi<=rowend && colbegi<=colend){
            //move left
            for(int i=colbegi;i<=colend;i++){
                res.add(matrix[rowbegi][i]);
            }
            rowbegi++;
            for(int i=rowbegi;i<=rowend;i++){
                res.add(matrix[i][colend]);
            }
            colend--;
            if(rowbegi<=rowend){
            for(int i=colend;i>=colbegi;i--){
                res.add(matrix[rowend][i]);
              }
            }
            rowend--;
           
            if(colbegi<=colend){
            for(int i=rowend;i>=rowbegi;i--){
                res.add(matrix[i][colbegi]);
            }
            }
            colbegi++;
        }
        return res;
    }
}
