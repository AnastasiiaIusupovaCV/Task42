/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cats;

/**
 *
 * @author a.yusupova
 */
public class Siamese extends Cat{
    public Siamese(){
        
    }
    
    public Siamese(String name_){
        name = name_;
    }
    
    
    @Override
    public String getBreed() {
        return "Siamese";
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
        return true;
    }

    @Override
    public boolean canCalcArea() {
        return true;
    }
}