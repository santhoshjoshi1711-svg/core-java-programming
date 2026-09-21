class Task extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        task.setName("Java-Thread");
        task.start();
        task.join();

        System.out.println("Main thread completed.");
    }
}
