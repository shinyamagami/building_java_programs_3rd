public boolean isCollinear(Point p1, Point p2){

    if (this.x == p1.x && this.x == p2.x){
        return true;
    } else {
        double slope1 = Math.abs(((p1.y - this.y) / (p1.x - this.x))) * 1000;
        slope1 = (int)Math.floor(slope1);
        double slope2 = Math.abs(((p2.y - this.y) / (p2.x - this.x))) * 1000;
        slope2 = (int)Math.floor(slope2);
        if (slope1 == slope2){
            return true;
        } else {
            return false;
        }
    }
}
