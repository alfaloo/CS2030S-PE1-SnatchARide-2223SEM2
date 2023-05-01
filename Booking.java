class Booking implements Comparable<Booking> {
  private Car car;
  private Service service;
  private Request request;

  public Booking(Car car, Service service, Request request) throws IllegalArgumentException {
    if (car instanceof Cab) {
      if (service instanceof JustRide || service instanceof TakeACab) {
        this.car = car;
        this.service = service;
        this.request = request;
      } else {
        String message = String.format("%s does not provide the %s service.", car, service);
        throw new IllegalArgumentException(message);
      }
    } else if (car instanceof PrivateCar) {
      if (service instanceof JustRide || service instanceof ShareARide) {
        this.car = car;
        this.service = service;
        this.request = request;
      } else {
        String message = String.format("%s does not provide the %s service.", car, service);
        throw new IllegalArgumentException(message);
      }
    } else {
      throw new IllegalArgumentException("Unknown Car Type");
    }
  }

  public int getFare() {
    return this.service.computeFare(this.request);
  }

  public int getCarTime() {
    return this.car.getTime();
  }

  @Override
  public int compareTo(Booking booking) {
    if (this.getFare() < booking.getFare()) {
      return -1;
    } else if (this.getFare() == booking.getFare()) {
      if (this.getCarTime() < booking.getCarTime()) {
        return -1;
      } else {
        return 1;
      }
    } else {
      return 1;
    }
  }
}
