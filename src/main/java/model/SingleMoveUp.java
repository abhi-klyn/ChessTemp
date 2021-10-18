package model;

public class SingleMoveUp implements Move{

    @Override
    public boolean isValid(int x1, int y1, int x2, int y2) {
        if (y1 == y2 && x1 - x2 == 1) return true;
        return false;
    }
}
