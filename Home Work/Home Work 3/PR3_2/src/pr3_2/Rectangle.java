/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;

/**
 *
 * @author tbradford16
 */
class RectangleException extends Exception {

    //Parameterless Constructor
    public RectangleException() {
    }

    //Constructor that accepts a message
    public RectangleException(String message) {
        super(message);
    }
}

public class Rectangle extends Shape {

    private int width = 0;
    private int height = 0;

    public Rectangle(int width, int height) {
        try {
            if (width < 0 || height < 0) {
                throw new RectangleException();
            } else {
                this.width = width;
                this.height = height;
            }
        } catch (RectangleException ex) {
            System.out.println("Both height and width need to be greater than or eqaul 0");
        }

    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

}
