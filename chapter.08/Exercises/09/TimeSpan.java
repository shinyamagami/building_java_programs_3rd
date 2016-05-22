public void scale(int factor){
    int hours = this.getHours() * factor;
    int minutes = this.getMinutes() * factor;

    this.hours = hours + minutes / 60;
    this.minutes = minutes % 60;
}
