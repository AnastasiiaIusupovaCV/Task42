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
public class HalfBreed extends Cat{
    
    public HalfBreed(){
        
    }
    
    public HalfBreed(String name_){
        name = name_;
    }

    @Override
    public String getBreed() {
        return "Half-Breed";
    }
    
    @Override
    public boolean isResizable() {
        return false;
    }

    @Override
    public boolean isStretchable() {
        return true;
    }

    @Override
    public boolean isFillable() {
        return true;
    }

    @Override
    public boolean canCalcArea() {
        return true;
    }
    
    
    
}
