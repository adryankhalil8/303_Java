import java.util.*;
public class myRunner3 {
    public static void main(String[] args) {

        Circle2 c = new Circle2(100);
        System.out.println("Area of Circle " + c.getArea());

        System.out.println("+++++++++++++++++");

        Shape2 shapeCircleObj = new Circle2(100);
        shapeCircleObj.displayshapName();   // <-- must match method name in Shape2
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        System.out.println(shapeCircleObj instanceof Circle2);

        System.out.println("+++++++++++++++++");

        Shape2 shapeRectangleObj = new Rectangle2("Red");
        shapeRectangleObj.displayshapName();

        Rectangle2 r = (Rectangle2) shapeRectangleObj;
        r.setHeight(2);
        r.setWidth(4);

        System.out.println("Area of Rectangle is " + r.getArea());
        System.out.println(r);
        System.out.println(shapeRectangleObj instanceof Rectangle2);
    }
}