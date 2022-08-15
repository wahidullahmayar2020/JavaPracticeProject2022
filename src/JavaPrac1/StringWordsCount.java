package JavaPrac1;

public class StringWordsCount {
    public static void main(String[] args) {
        String myString="Hello world";
     String [] array=myString.split("");
     int wordcount=array.length;
     System.out.println("number of words in a string"+" "+myString+" is"+" = "+wordcount);

    }
}

