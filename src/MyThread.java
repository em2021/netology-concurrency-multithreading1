class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("%s %s. %s%n", "Я поток", currentThread().getName(), "Всем привет!");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}