class TakeACab implements Service {
  
  public TakeACab() {
  }

  @Override
  public int computeFare(Request request) {
    return request.findPrice("TakeACab");
  }

  @Override
  public String toString() {
    return "TakeACab";
  }
}
