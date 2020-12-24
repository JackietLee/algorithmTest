public class FindFromArray {
    public boolean Find(int target, int[][] matrix) {
        if(null == matrix || matrix.length == 0 || matrix[0].length ==0){
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r= 0,c=cols-1;
        while(r<=rows-1&&c>=0){
            if(target == matrix[r][c]){
                return true;
            }else if(target < matrix[r][c]){
                c--;
            }else {
                r++;
            }
        }
        return false;
    }
}
