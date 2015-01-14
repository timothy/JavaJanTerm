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
class TriangleException extends Exception {

    //Parameterless Constructor
    public TriangleException() {
    }

    //Constructor that accepts a message
    public TriangleException(String message) {
        super(message);
    }
}

public class Triangle extends Shape {

    private int A;
    private int B;
    private int C;

    // This takes the Triangle Inequality Theorem into account
    public Triangle(int s1, int s2, int s3) {
        try {
            if (s1 < 0 || s2 < 0 || s3 < 0 || s1 > s2 + s3 || s2 > s1 + s3 || s3 > s1 + s2) {
                throw new TriangleException();
            } else {
                this.A = s1;
                this.B = s2;
                this.C = s3;
            }
        } catch (TriangleException ex) {
            System.out.println("All three sides must be greater than or eqaul 0 \n"
                    + "and A cannot be greater than B + C to form a Triangle\n");
        }
    }

    @Override
    public double getArea() {
        int s = (this.A + this.B + this.C) / 2;

        return (double) s * (s - this.A) * (s - this.B) * (s - this.C);
    }

    @Override
    public double getPerimeter() {
        return (double) this.A + this.B + this.C;
    }
}
