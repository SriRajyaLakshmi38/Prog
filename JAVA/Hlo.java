class Hlo {
   public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
       if (i%5==0 && i%3==0) {
        System.out.println("Hello Wolrd");
       } else if(i%3==0) {
        System.out.println("Hello");
       } else if (i%5==0) {
           System.out.println("Wolrd");   
       }
       else{
        System.out.println("Sri");
       }
    }
   }
}
