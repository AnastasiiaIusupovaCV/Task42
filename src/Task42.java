
import java.awt.Color;
import figures.*;
import java.awt.Graphics;
import java.util.AbstractList;
import figures.IMovable;
import java.awt.image.BufferedImage;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a.yusupova
 */
public class Task42 {
    Graphics graphics = null;
    
    Task42()
    {
        
    }
    
    public static void addToList (java.util.List<Object> someObjects, Object obj){
        if(obj == null ) return;
        if(obj instanceof IMovable)
        {
            ((IMovable)obj).moveTo((int)(100.0*(Math.random()-0.5)),
                    (int)(100.0*(Math.random()-0.5)));
        }
        
        if(obj instanceof additionalfigures.IInforming)
        {
            additionalfigures.IInforming i = (additionalfigures.IInforming)obj;
            System.out.println("adding " + i.name() + " of " +i.figureType());
        }
        

        someObjects.add(obj);
    }
    
    
    public static void main(String[] args) {
        BufferedImage img = new BufferedImage(100, 100, 1);
        
        Graphics graphics = img.getGraphics();
        Task42 t = new Task42();
        
        
        java.util.List<Object> someObjects = new java.util.ArrayList<Object>();
        Object  obj = new figures.Circle(15, graphics); 
        Task42.addToList(someObjects, obj);   
        
        obj = new additionalfigures.Rectangle(15,45, graphics); Task42.addToList(someObjects, obj);
        obj = new additionalfigures.Square(15, graphics); Task42.addToList(someObjects, obj);
        obj = new figures.Dot(graphics); Task42.addToList(someObjects, obj);
        obj = new additionalfigures.FilledRectangle(45,20,Color.CYAN, graphics); Task42.addToList(someObjects, obj);
        obj = new additionalfigures.FilledSquare(15,Color.MAGENTA, graphics); Task42.addToList(someObjects, obj);
        obj = new figures.InformingCircle(15, graphics); Task42.addToList(someObjects, obj);
        obj = new figures.InformingSquare(25, graphics); Task42.addToList(someObjects, obj);
        obj = new figures.InformingRectangle(55,30, graphics); Task42.addToList(someObjects, obj);
        obj = new figures.InformingEllipse(31, 56, graphics); Task42.addToList(someObjects, obj);
        
//        obj = new cats.Fattsy("Pluphy", 100); Task42.addToList(someObjects, obj);
//        obj = new cats.Swinex("Tricksy", 100); Task42.addToList(someObjects, obj);
        obj = new cats.HalfBreed("Cat"); Task42.addToList(someObjects, obj);
//        obj = new cats.Siamese("Skinnie"); Task42.addToList(someObjects, obj);
        
        
         System.out.println("someObjects.size = " + someObjects.size());
        
        for (Object someObject : someObjects) {
            if(someObject instanceof IMovable)
            {
                ((IMovable)obj).moveTo((int)(100.0*(Math.random()-0.5)),
                    (int)(100.0*(Math.random()-0.5)));
            }
        }
        
        for (Object someObject : someObjects) {
            if(someObject instanceof additionalfigures.IInforming)
            {
                additionalfigures.IInforming i = (additionalfigures.IInforming)someObject;
                System.out.println(i.name());
            }
            if( someObject instanceof additionalfigures.IScalable )
            {
                additionalfigures.IInforming i = (additionalfigures.IInforming)someObject;
                System.out.println("is instanceof additionalfigures.IScalable "+i.name() + " type "+i.figureType());
                
//                ((additionalfigures.IScalable)obj).setSize((int)Math.random()*100);
            }
        }
        
        
        for (Object someObject : someObjects) {
            if(someObject instanceof additionalfigures.IInforming)
            {
                additionalfigures.IInforming i = (additionalfigures.IInforming)someObject;
                String data = "===============================";
                data += "Name: " + i.name() + "\n";
                data += "type: " + i.figureType()+ "\n";
                data += "Fillable: " + i.isFillable()+ "\n";
                data += "Can be measured: " + i.canCalcArea()+ "\n";
                data += "Scalable: " + i.isResizable()+ "\n";
                data += "Can be squized: " + i.isStretchable()+ "\n";
                data += "Located at: " + i.position().toString()+ "\n";
                data += "===============================";
                System.out.println(data);
            }
        }
        
        
        
    }
    
}
