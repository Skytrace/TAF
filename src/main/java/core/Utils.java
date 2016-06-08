package core;

public class Utils {

    public synchronized void callSynhronizedMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000L);
                System.out.println("Now i'm in synhronized method " + i + " from thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
