public class Point{
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        setLocation(x, y);
    }
    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public void translate(int dx, int dy){
        setLocation(x + dx, y + dy);
    }
    public int quadrant(){
        if(x > 0 && y > 0){
            return 1;
        } else if (x < 0 && y > 0){
            return 2;
        } else if (x < 0 && y < 0){
            return 3;
        } else if (x > 0 && y < 0){
            return 4;
        } else {
            return 0;
        }
    }
    public void flip(){
        int xa = y;
        int ya = x;
        x = xa * -1;
        y = ya * -1;
    }
    public int manhattanDistance(Point other){
        int distance = Math.abs(other.x - this.x) + Math.abs(other.y - this.y);
        return distance;
    }
}
