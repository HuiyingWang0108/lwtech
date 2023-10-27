package staticTest;

public class AreaCalculate {
    public static void main(String[] args) {

        System.out.println("The original object number is " + AreaCalculate.countObjNum);

        AreaCalculate obj1 = new AreaCalculate(2, 3);
        AreaCalculate obj2 = new AreaCalculate(4, 3);
        System.out.println("The object number is " + AreaCalculate.countObjNum);

    }

    private int length;
    private int width;
    private int area;

    private static int countObjNum = 0;

    /**
     * construction function: 1, no return; 2,method name the same as class name
     * 
     * @param length
     * @param width
     */
    public AreaCalculate(int length, int width) {
        this.length = length;
        this.width = width;
        countObjNum++;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The length is ").append(this.length);
        sb.append("\n");
        sb.append("the width is ").append(this.width);
        return sb.toString();
    }

}