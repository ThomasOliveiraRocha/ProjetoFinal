
package projeto;


public class Divisao extends Formulas{
    public float calcular(float num1,float num2)  throws ArithmeticException{
        if(num2 ==0){
            throw new ArithmeticException();
        }else{
          return num1 / num2;  
        } 
    }
}
