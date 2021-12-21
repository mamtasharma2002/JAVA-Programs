class myclass {
    public static void main(String[] args) throws Exception{
    Thread t1 = new Thread(() ->
        {
            for(int i = 0;i<=5;i++){
            System.out.println("hi");
            try{Thread.sleep(500);}catch(Exception e){}
            }
          }/*,"hi Thread"*/);
    Thread t2 = new Thread(() ->
        {
            for(int i = 0;i<=5; i++){
            System.out.println("hello");
            try{Thread.sleep(1000);}catch(Exception e){}
         }
        }/*,"hello Thread"*/);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //System.out.println(t1.getName());
        //System.out.println(t2.getName());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(t1.isAlive());
        System.out.println("bye");
    }
}  
