public class CountUp extends Thread{

    @Override
    public void run(){
        for (int i = 0; i <= 20; i++ ){
            System.out.println("t1: " + i);
        }
    }
}
