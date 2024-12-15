class a implements Runnable 
{
    public void run()
    {
        System.out.println("i am thread");
    }
}
public class Implementing_runnable
{
    public static void main(String[] args) {
        a r=new a();
        Thread s=new Thread(r);
        s.run();
    }
}