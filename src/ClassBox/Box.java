package ClassBox;

public class Box  {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if(length < 0 ) {
            // Problem
            throw new IllegalArgumentException("Length cannot be 0 or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width < 0 ) {
            // Problem
            throw new IllegalArgumentException("Width cannot be 0 or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height < 0 ) {
            // Problem
            throw new IllegalArgumentException("Height cannot be 0 or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
    public double calculateLateralSurfaceAre() {
        return 2 * length * height + 2 * width * height;
    }
    public double calculateVolume() {
        return length * width * height;
    }
}
