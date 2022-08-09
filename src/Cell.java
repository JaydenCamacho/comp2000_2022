import java.awt.Rectangle;
import java.awt.Graphics;
public class Cell extends Rectangle {
    int col;
    int row;
    static int size = 35;
    public Cell(int inCol, int inRow) {
        col = inCol;
        row = inRow;
    }

    void paint(Graphics g) {
        g.drawRect(col*size+10, row*size+10, size, size);
    }
}
