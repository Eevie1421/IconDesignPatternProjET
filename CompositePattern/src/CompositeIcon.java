import javax.swing.*;

/**
 * CompositeIcon allows client to construct an image
 * with multiple subcomponents. Composite Icon acts
 * as the component interface that interacts with the
 * client.
 */
public interface CompositeIcon extends Icon {
    void addIcon(Icon i, int x, int y);
    void removeIcon(Icon i);
    Icon getChild(int x, int y);
}
