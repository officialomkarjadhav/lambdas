public interface task2{
    String reverseString(String s);
}

class Example{
    public static void main(String[] args) {
      
     task2 sr= (s)-> {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
     };

     String or="Omkar jadhav";
      String re= sr.reverseString(or);
      System.out.println("original String "+or);
      System.out.println("reverse String "+re);
     }
    }
       
      

    
