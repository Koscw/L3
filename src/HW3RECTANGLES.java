public class HW3RECTANGLES {

        int top;
        int left;
        int width;
        int height;
        public HW3RECTANGLES(int top){
            this.top=top;
    }
    public int getTop(){
            return top;
    }
    public int getLeft(){
        return left;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setTop(int top){
            this.top=top;
    }
    public void setWidth(int width){
        this.width=width;
    }

    public void setLeft(int left){
        this.left=left;
    }


    public HW3RECTANGLES(int top,int left){
        this.top=top;
        this.left=left;
        this.height=0;
        this.width=0;
    }
    public HW3RECTANGLES(int top,int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public HW3RECTANGLES(int top,int left, int width,int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public HW3RECTANGLES(HW3RECTANGLES rectangles){
        this.top = rectangles.top;
        this.left = rectangles.left;
        this.width = rectangles.width;
        this.height = rectangles.height;

    }

}
