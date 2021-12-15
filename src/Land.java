public class Land {
    public int width;
    public int height;

    Land(){}

    Land(int squares){
        this.setHeight(squares);
        this.setWidth(squares);
    }

    Land(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
    }

    //Setters
    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    //Getters
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}

