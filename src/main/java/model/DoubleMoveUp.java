package model;

public class DoubleMoveUp implements Move{
    @Override
    public boolean isValid(int x1, int y1, int x2, int y2) {
        if (y1 == y2 && x2 - x1 == 2) return true;
        return false;
    }
}
