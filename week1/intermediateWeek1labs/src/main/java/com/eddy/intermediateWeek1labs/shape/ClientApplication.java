package com.eddy.intermediateWeek1labs.shape;

import com.eddy.intermediateWeek1labs.shape.factory.CircleFactory;
import com.eddy.intermediateWeek1labs.shape.factory.ShapeFactory;
import com.eddy.intermediateWeek1labs.shape.product.Shape;
import com.eddy.intermediateWeek1labs.shape.factory.SquareFactory;

public class ClientApplication {

    public static void main(String[] args) {
        // create a circle
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.display();

        //create a square

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.display();
    }
}
