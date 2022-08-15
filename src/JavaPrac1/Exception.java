package JavaPrac1;

public class Exception extends Throwable {
    public static void main(String[] args) {
      try {
          int a = 10;
          int b = 0;
          int c = a / b;


    }catch(ArithmeticException e){
            System.out.println(e.getMessage());



    }}}



