package ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level){
    this.level = level;
  }
  @Override
  protect void write(String message) {
    System.out.println("Standart Console::Logger: " +message);
  }
}
