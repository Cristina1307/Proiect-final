package junit;

import com.itfactory.GeometricShape;
import com.itfactory.Rectangle;
import com.itfactory.Square;
import com.itfactory.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class SGeometricShapeTest {
    @Test
    public void testTrianglePerimeter() {
        GeometricShape triangle = new Triangle(3, 4, 5);
        assertEquals(12.0, triangle.calculatePerimeter(), 0.001);
    }

    @Test
    public void testSquarePerimeter() {
        GeometricShape square = new Square(4);
        assertEquals(16.0, square.calculatePerimeter(), 0.001);
    }

    @Test
    public void testRectanglePerimeter() {
        GeometricShape rectangle = new Rectangle(3, 6);
        assertEquals(18.0, rectangle.calculatePerimeter(), 0.001);
    }
}