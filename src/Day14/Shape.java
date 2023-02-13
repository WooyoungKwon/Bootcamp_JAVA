package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Shape implements Comparator {

    public Shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }
    private String type, color;

    private Double area;

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return String.format(color, area);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


    List<Shape> shapes = Arrays.asList(
            new Shape("삼각형", "빨간색", 10.5),
            new Shape("사각형", "파란색", 11.2),
            new Shape("원", "파란색", 16.5),
            new Shape("원", "빨간색", 5.3)
    );
}

class ShapeTest {

}
