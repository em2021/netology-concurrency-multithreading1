class Main {
    public static void main(String[] args) throws Exception {

        ThreadGroup threadGroup = new ThreadGroup("group1");
        System.out.println("Создаю потоки...");
        int numberOfThreads = 4;
        for (int i = 1; i <= numberOfThreads; i++) {
            new MyThread(threadGroup, String.valueOf(i)).start();
        }
        try {
            Thread.sleep(15000);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Завершаю все потоки...");
        threadGroup.interrupt();
    }
}