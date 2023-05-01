class JustRide implements Service {
  
  public JustRide() {
  }

  @Override
  public int computeFare(Request request) {
    return request.findPrice("JustRide");
  }

  @Override
  public String toString() {
    return "JustRide";
  }
}
