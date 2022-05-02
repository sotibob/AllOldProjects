public class Duck implements Bird {
  @Override
  public String sound() {
    return "Quack!";
  } 

  @Override
  public String name() {
    return "Duck";
  }
}