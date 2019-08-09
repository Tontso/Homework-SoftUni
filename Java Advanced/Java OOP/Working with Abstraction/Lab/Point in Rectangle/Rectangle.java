public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public boolean contains(Point point){
        boolean isInHorizontal =
                this.bottomLeft.getCoordinateX() <= point.getCoordinateX() &&
                        this.topRight.getCoordinateX() >= point.getCoordinateX();

        boolean isInVertical =
                this.bottomLeft.getCoordinateY() <= point.getCoordinateY() &&
                        this.topRight.getCoordinateY() >= point.getCoordinateY();

        boolean isInRectangle = isInHorizontal && isInVertical;

        return isInRectangle;

    }

}
