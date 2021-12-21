class samplee extends Thread
{
    public void run(){
        System.out.println(this.getName()+" i am the sample : ");
    for (int i = 0;i<=5;i++)
    {
        System.out.println(this.getName()+" i am the sample : ");
    }
  }
}
class sample{
public static void main(String[] args) {
    samplee thread = new samplee();
    thread.start();
    for (int i = 0;i<=5;i++)
    {
        System.out.println("i am mamta");
    }
       try {
        thread.join();

    } catch (Exception e) {
        System.out.println(e);
    }
  }
}
