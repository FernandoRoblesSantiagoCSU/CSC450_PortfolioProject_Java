public class CountDown extends Thread {

    @Override
    public void run(){
        for (int i = 20; i >= 0; i--){
            System.out.println("t2: " + i);
        }
    }
}
