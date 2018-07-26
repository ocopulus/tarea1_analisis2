public class Resta{

  private double num1;
  private double num2;

  public Resta(){
  }

  public double getNum1(){
      return this.num1;
  }

  public void setNum1(double num1){
     this.num1=num1;
  }

  public double getNum2(){
      return this.num1;
  }

  public void setNum1(double num1){
     this.num1=num2;
  }

  public void restarNumeros(){
    System.out.println("La resta del primer numero: "+getNum1()+" y del segundo numero: "+getNum2()+ "es: " + (getNum1() - getNum2()));
  }
}