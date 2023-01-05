
package VD_setColor.model;

import java.awt.*;

/*
    setForeground(color c) => màu chữ
    setBackground(color c) => màu nền
    setOpaque(color c) => màu viền
*/
public class myColor_model {
    private Color foreground;
    private Color background;
    private boolean opaque;

    public myColor_model(){
        this.foreground = Color.BLUE;
        this.background = Color.cyan;
        this.opaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

}
