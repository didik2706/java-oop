public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorder());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorder());
        System.out.println(rectangle.getParentCorner());
    }
}
