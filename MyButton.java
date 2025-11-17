package buttons;

import javax.swing.* ; 
import java.awt.* ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyButton extends JButton  {
    public boolean getOver() {
        return over;
    }
    public void setOver(boolean over) {
        this.over = over;
    }
    
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }
    
    public Color getColorover() {
        return colorover;
    }
    public void setColorover(Color colorover) {
        this.colorover = colorover;
    }

    public Color getColorClick() {
        return colorClick;
    }
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public MyButton (){
        color= new Color(255,255,255) ;
        colorover= new Color(204,204,204);
        colorClick = new Color(153,153,153) ;
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me ){
                setBackground(colorover) ;
                over=true ;
            }
            
            @Override
            public void mouseExited(MouseEvent me ){
                setBackground(color);
                over =false ; 
            }
            @Override
            public void mousePressed(MouseEvent me ){
                setBackground(colorClick);
            }
            @Override
            public void mouseReleased(MouseEvent me ){
                if (over){
                    setBackground(colorover);
                } else{
                    setBackground(color) ;
                }
            }
        }) ;
        
    }
    
    private boolean over ; 
    private Color color ;
    private Color colorover ;
    private Color colorClick ; 
    private Color borderColor ; 
    private int radius=0 ;
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g = (Graphics2D) grphcs ; 
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(borderColor);
        g.fillRoundRect(0, 0, getWidth(), getHeight(), radius,radius );
        g.setColor(getBackground());
        g.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, radius, radius);
        super.paintComponent(grphcs);
    }
}
