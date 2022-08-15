package JavaPrac1;

public class PalandromOrNot {
    public static void main(String[] args) {
        String orginial="radar";
        String reveresed="";
        for(int i=orginial.length()-1;i>=0;i--) {
            reveresed=reveresed+orginial.charAt(i);
        }
        if(orginial.equals(reveresed)){
            System.out.println("String is Palandrome");
        }else{
            System.out.println("String is not Palandrome");
        }


    }
}
