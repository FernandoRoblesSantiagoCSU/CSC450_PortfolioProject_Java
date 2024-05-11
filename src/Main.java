public class Main {
    public static void main(String[] args) {
        //Create Counters objects
        CountUp countUp = new CountUp();
        CountDown countDown = new CountDown();

        //Start count up thread
        countUp.start();

        //join thread to make countDown threat wait until countUp is finished
        try {
            countUp.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDown.start();

    }
}


