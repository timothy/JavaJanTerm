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
class EllipseException extends Exception {

    //Parameterless Constructor
    public EllipseException() {
    }

    //Constructor that accepts a message
    public EllipseException(String message) {
        super(message);
    }
}

public class Ellipse extends Shape {

    private int A = 0;
    private int B = 0;

    public Ellipse(int r1, int r2) {
        try {
            if (r1 < 0 || r2 < 0 || r1 > r2*3) {
                throw new EllipseException();
            } else {
                this.A = r1;
                this.B = r2;
            }
        } catch (EllipseException ex) {
            System.out.println("Both A and B must be greater than or eqaul 0");
        }
    }
    // used Approximation 2 from http://www.mathsisfun.com/geometry/ellipse-perimeter.html for perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (this.A + this.B) - Math.sqrt((3 * this.A + this.B)*(this.A + 3 * this.B)));
    }

    @Override
    public double getArea() {
        return (Double)(this.A * this.B * Math.PI);
    }
}
