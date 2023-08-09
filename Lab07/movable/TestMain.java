package movable;
public class TestMain {
    public static void main(String[] args) {
        Movable point = new MovablePoint(2,6,3,4);
        System.out.println(point);

        point.moveDown();
        System.out.println("Test point move down: " + point);

        point.moveUp();
        System.out.println("Test point move up: " + point);

        point.moveLeft();
        System.out.println("Test point move left: " + point);

        point.moveRight();
        System.out.println("Test point move right: " + point);

        Movable circle = new MovableCircle(1,2,1,2,5);
        System.out.println(circle);

        circle.moveDown();
        System.out.println("Test circle move down: " + circle);

        circle.moveUp();
        System.out.println("Test circle move up: " + circle);

        circle.moveLeft();
        System.out.println("Test circle move left: " + circle);

        circle.moveRight();
        System.out.println("Test circle move right: " + circle);

        Movable rectangle = new MovableRectangle(3,4,5,6,1,1);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println("Test rectangle move down: " + rectangle);

        rectangle.moveUp();
        System.out.println("Test rectangle move up: " + rectangle);

        rectangle.moveLeft();
        System.out.println("Test rectangle move left: " + rectangle);

        rectangle.moveRight();
        System.out.println("Test rectangle move right: " + rectangle);
    }
}
