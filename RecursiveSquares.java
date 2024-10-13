import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;

public class RecursiveSquares extends Frame {

    public RecursiveSquares() {
        setSize(300, 300);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void drawSquare(Graphics2D g, int xPosition, int yPosition, int length, int n) {
        // Base case: if n is 0, stop the recursion
        if (n == 0) return;

        // Step 1: draw the square
        g.draw(new Rectangle2D.Double(xPosition, yPosition, length, length));

        // Step 2: make recursive calls to draw 4 smaller squares
        int newLength = length / 2;
        drawSquare(g, xPosition - newLength / 2, yPosition - newLength / 2, newLength, n - 1); // top-left
        drawSquare(g, xPosition + length - newLength / 2, yPosition - newLength / 2, newLength, n - 1); // top-right
        drawSquare(g, xPosition - newLength / 2, yPosition + length - newLength / 2, newLength, n - 1); // bottom-left
        drawSquare(g, xPosition + length - newLength / 2, yPosition + length - newLength / 2, newLength, n - 1); // bottom-right
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // recursive pattern of order n
        int n = 2; // Adjust this value to change the recursion depth
        drawSquare(g2, 100, 100, 100, n);
    }

    public static void main(String[] args) {
        RecursiveSquares squaresGUI = new RecursiveSquares();
        squaresGUI.setVisible(true);
    }
}
