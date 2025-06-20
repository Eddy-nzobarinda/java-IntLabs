package com.eddy.intermediateWeek1labs.shape.factory;

import com.eddy.intermediateWeek1labs.shape.product.Circle;
import com.eddy.intermediateWeek1labs.shape.product.Shape;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
