/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cats;

import additionalfigures.IScalable;

/**
 *
 * @author a.yusupova
 */
public class Fattsy extends Cat implements IScalable{
    
    int size;
    
    public Fattsy(){
        
    }
    
    public Fattsy(String name_){
        name = name_;
    }
    
    public Fattsy(String name_, int size_){
        name = name_;
        size = size_;
    }
    
    
    @Override
    public String getBreed() {
        return "Fat";
    }
    
    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public boolean isStretchable() {
        return false;
    }

    @Override
    public boolean isFillable() {
        return true;
    }

    @Override
    public boolean canCalcArea() {
        return false;
    }

    @Override
    public int getSize() {
        
        return size;
    }

    @Override
    public void setSize(int newSize) {
        size = newSize;
    }
    
    
}
