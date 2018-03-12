package testmaven;
import java.util.Stack;

public class ControladorAnalisisLexico {
  private Stack stack ;
  private int espacios ;
  public ControladorAnalisisLexico(){
    stack = new Stack();
    espacios = 0 ;
  }
  public int getEspacios(){
    return espacios;

  }
  public void setEspacios(int espacios){
    this.espacios = espacios;
  }
  public Stack getStack(){
    return stack;
  }

}
