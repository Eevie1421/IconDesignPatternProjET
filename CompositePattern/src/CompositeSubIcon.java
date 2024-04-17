import javax.swing.*;
import java.awt.*;

/**
 * @author eevie Evelyn Totman
 * CompositeSubIcon performs the function of the Leaf
 * class for a CompositeImage. Each
 * SubIcon has both an image as well
 * data pertaining to its location
 */
public class CompositeSubIcon implements CompositeIcon{

    private Icon image;
    private int x;
    private int y;

    public CompositeSubIcon(Icon i, int x, int y){
        this.image = i;
        this.x = x;
        this.y = y;
    }

    //Getter methods
    public Icon getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    
    @Override
    public void addIcon(Icon i, int x, int y) {

    }

    @Override
    public void removeIcon(Icon i) {

    }

    @Override
    public Icon getChild(int x, int y) {
        return null;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
