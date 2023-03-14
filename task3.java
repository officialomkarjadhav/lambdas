interface task3{
    String convertToUppercase(String lowercase);
}
class example{
    public static void main(String[] args) {
        task3 t=(lowercase )->{
            return lowercase.toLowerCase();

        };

        String or="EXAMPLE OF STRING";
        String low=t.convertToUppercase(or);
        System.out.println("To lower case :"+low);
    }
}