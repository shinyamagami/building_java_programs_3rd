public void subtract(TimeSpan span){
    this.hours -= span.getHours();
    this.minutes -= span.getMinutes();

    if (this.minutes < 0){
        this.hours -= 1;
        this.minutes = 60 + this.minutes;
    }
}
