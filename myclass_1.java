class table{
    public synchronized void prn_tbl(int x){
        for(int i = 1;i <= 10;i++){
            int temp = i*x;
            System.out.println(temp);
            try{
                Thread.sleep(4000);
            }
            catch(Exception e){}
        }
    }
 }
    class mythread_1 extends Thread{
    table ty;
    mythread_1(table ty){
        this.ty = ty;}
        public void run(){
            ty.prn_tbl(5);}
       }
       class mythread_2 extends Thread{
        table tx;
        mythread_2(table tx){
            this.tx = tx;}
            public void run(){
                tx.prn_tbl(10);}
       } 
public class myclass_1 {
    public static void main(String[] args) {
        table  tb1 = new table();
        mythread_1 my_th1 = new mythread_1(tb1);
        Thread th_1 = new Thread(my_th1);
        th_1.start();
       
        mythread_2 my_th2 = new mythread_2(tb1);
        Thread th_2 = new Thread(my_th2);
        th_2.start();
        
    }
}
