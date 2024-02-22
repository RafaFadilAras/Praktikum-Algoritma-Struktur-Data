public class Dragon24 {
    int x, y, width, height;

    void moveLeft () {
        if (x<0 && x > width) {
            x -= 1;
        } else
        detectCollision();
    }

    void moveRight () {
        if (x < 0 && x > width) {
            x += 1;
        } else
        detectCollision();
    }

    void moveUp () {
        if (y<0 && y > height) {
            y += 1;
        } else
        detectCollision();
    }

    void moveDown () {
        if (y < 0 && y > height) {
            y -= 1; 
        } else
        detectCollision();
    }

    void printPosition() {
    }

    void detectCollision() {
        if (x== width || y == height) {
            System.out.println("Game Over");
        }
    }
}
