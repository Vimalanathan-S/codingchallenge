class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] colmn = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        
        for (int i=0;i<9;i++){
            rows[i]=  new HashSet<>();
            colmn[i]= new HashSet<>();
            boxes[i]= new HashSet<>();
        }
        for (int row=0;row<9;row++) {
            for (int col=0;col<9;col++) {
                char val=board[row][col];
                if (val=='.') continue;
                int boxIndex = (row / 3) * 3 + (col / 3);
                if (rows[row].contains(val) || colmn[col].contains(val) || boxes[boxIndex].contains(val)) {
                    return false;
                }
                rows[row].add(val);
                colmn[col].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
