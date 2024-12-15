public class Lambda_Thread {
    public static void main(String[] args) {
        Runnable r=()->System.out.println("I am new from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
    
}
