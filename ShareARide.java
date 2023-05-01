class ShareARide implements Service {
  
  public ShareARide() {
  }

  @Override
  public int computeFare(Request request) {
    return request.findPrice("ShareARide");
  }

  @Override
  public String toString() {
    return "ShareARide";
  }
}
