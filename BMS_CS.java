class BMS extends Thread
{   
    public void run()
    {
            try {
                for(int i=5;i>=1;i--){
                    System.out.println("BMS COLLEGE OF ENGINEERING :" + i);
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
            
                System.out.println("BMS Thread is quitting");
            }
    }
}
class CS extends Thread{
    public void run()
    {
            try {
                for(int i=5;i>=1;i--){
                    System.out.println("COMPUTR SCIENCE: " + i);
                    Thread.sleep(2000);

                }
            } catch (InterruptedException e) {
                System.out.println("CS Thread is quitting");
            }
    }
}
public class BMS_CS{
    public static void main(String args[])
    {
        BMS b=new BMS();
        CS cs=new CS();
        b.start();
        cs.start();
    }

}



