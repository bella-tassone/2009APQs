public class NumberTile {

    private int getIndexForFit(NumberTile tile) {
        if((board.size() == 0) || (board.get(0).getLeft() == tile.getRight())) {
            return 0;
        }
        for(int i = 1; i< board.size(); i++) {
            if (board.get(i).getLeft() == tile.getRight() && board.get(i-1).getRight() == tile.getLeft()) {
                return i;
            }
        }
        if(board.get(board.size - 1).getRight() == tile.getleft()) {
            return board.size();
        }
        return -1;
    }
    public boolean insertTile(NumberTile tile) {

        int index = getIndexForFit(tile);
        int sideAttempt = 1;

        while (index == -1 && sideAttempt < 4) {
            tile.rotate();
            index = getIndexForFit(tile);
            sideAttempt++;
        }

        if(index != -1) {
            return true;
        }
        else { return false;}

    }
}
