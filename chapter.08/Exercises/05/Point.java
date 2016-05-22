public double slope(Point other){
    if(other.x == this.x){
        throw new IllegalArgumentException();
    } else {
        double slope = ((double)other.y - this.y) / ((double)other.x - this.x);
        return slope;
    }
}
