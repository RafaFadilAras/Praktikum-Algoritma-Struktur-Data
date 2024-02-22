public class DragonMain24 {

    public static void main(String[] args) {
        Dragon24 dragon1 = new Dragon24(10,5,8,20);

        dragon1.moveLeft();
        dragon1.moveRight();
        dragon1.moveUp();
        dragon1.moveDown();
        dragon1.printPosition();
        dragon1.detectCollision();

    }
}