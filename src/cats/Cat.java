/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cats;

import java.awt.Point;

/**
 *
 * @author a.yusupova
 */
public abstract class Cat implements figures.IMovable, additionalfigures.IInforming {
    
    String name = "Kiss-kiss";
    Point position = new Point(); // position on map (for example)
 
    
    public abstract String getBreed();

    public void setName(String val)
    {
        name = val;
    }

    @Override
    public String name() {
        return name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String figureType() {
        return getBreed();
    }

    @Override
    public Point position() {
        return position;
    }

    @Override
    public boolean isResizable() {
        return false;
    }

    @Override
    public boolean isStretchable() {
        return false;
    }

    @Override
    public boolean isFillable() {
        return false;
    }

    @Override
    public boolean canCalcArea() {
        return false;
    }

    @Override
    public void moveTo(int x, int y) {
        position.x  =x;
        position.y  =y;
    }

    @Override
    public void moveTo(Point to) {
        position = to;
    }

    @Override
    public void shift(int dx, int dy) {
        position.x += dx;
        position.y += dy;
        
    }

    @Override
    public void shift(Point dp) {
        position.x += dp.x;
        position.y += dp.y;
    }
    
            
}
