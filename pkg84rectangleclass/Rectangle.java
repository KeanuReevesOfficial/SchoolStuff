/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg84rectangleclass;

/**
 *
 * @author Paul Christian
 */
public class Rectangle{
    private float length;
    private float width;
    private float perimeter;
    private float area;
    
    public Rectangle(float length, float width){
        if(length < 0.0 && length > 20.0){
            throw new IllegalArgumentException("Length must be float between "
                    + "0.0 & 20.0");
        }
        if(width < 0.0 && width > 20.0){
            throw new IllegalArgumentException("Width must be float between "
                    + "0.0 & 20.0");
        }
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    
    public float getPerimeter(){
        return (getLength() * 2) + (getWidth() * 2);
    }
    
    public float getArea(){
        return area = getLength() * getWidth();
    }
}

