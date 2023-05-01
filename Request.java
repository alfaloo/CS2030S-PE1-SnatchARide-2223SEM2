class Request {
  
  private int distance;
  private int passengers;
  private int time;

  public Request(int distance, int passengers, int time) {
    this.distance = distance;
    this.passengers = passengers;
    this.time = time;
  }

  public int findPrice(String type) {
    if (type == "JustRide") {
      if (time >= 600 && time <= 900) {
        int price = 22 * this.distance + 500;
        return price;
      } else {
        int price = 22 * this.distance;
        return price;
      }
    } else if (type == "TakeACab") {
      int price = 33 * this.distance + 200;
      return price;
    } else if (type == "ShareARide") {
      if (time >= 600 && time <= 900) {
        double temp = 50.0 / this.passengers * this.distance;
        int price = (int) temp + 500;
        return price;
      } else {
        double temp = 50.0 / this.passengers * this.distance;
        int price = (int) temp;
        return price;
      }
    } else {
      return -1;
    }
  }

}
