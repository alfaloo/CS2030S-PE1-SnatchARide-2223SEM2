class PrivateCar implements Car {
  private String plate;
  private int time;

  public PrivateCar(String plate, int time) {
    this.plate = plate;
    this.time = time;
  }

  @Override
  public int getTime() {
    return this.time;
  }

  @Override
  public String toString() {
    String min = time == 1 ? "1 min" : String.format("%x mins", this.time);
    String s = String.format("PrivateCar %s (%s away)", this.plate, min);
    return s;
  }
}
