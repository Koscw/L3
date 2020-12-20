public class Hw3Rectangles {

    int top;
    int left;
    int width;
    int height;

    public Hw3Rectangles(int top) {
        this.top = top;
    }

    public int getTop() {
        return top;
    }

    public int getLeft() {
        return left;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLeft(int left) {
        this.left = left;
    }


    public Hw3Rectangles(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }

    public Hw3Rectangles(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Hw3Rectangles(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Hw3Rectangles(Hw3Rectangles rectangles) {
        this.top = rectangles.top;
        this.left = rectangles.left;
        this.width = rectangles.width;
        this.height = rectangles.height;

    }

}
