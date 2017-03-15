package classBox;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Box {
    private double length;
    private double width;
    private double height;

public Box(double length, double width, double height){
    this.setLength(length);
    this.setWidth(width);
    this.setHeigh(height);
}

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeigh(double heigh) {
        if (heigh <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = heigh;
    }

    public double getSurfaceArea(){
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double getLateralSurfaceArea(){
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double getVolume(){
        return this.length * this.height * this.width;
    }
}
