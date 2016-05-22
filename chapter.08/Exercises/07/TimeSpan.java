public void add(TimeSpan span){
    this.hours += span.getHours();
    this.minutes += span.getMinutes();

    this.hours = hours + minutes / 60;
    this.minutes = minutes % 60;
}
