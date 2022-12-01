public class InterruptedRaces {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
    public static class TestThread extends Thread{
        @Override
        public void run() {

        }
    }
}
