class task1 {
     
   
        public static void main(String[] args) {
           
            Runnable runnable = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable using lambda expression: " + i);
                }
            };
    
           
            Thread thread = new Thread(runnable);
    
            // Starting the thread
            thread.start();
        }

    
}