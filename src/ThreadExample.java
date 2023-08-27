class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
        System.out.println("Implementing thread by extending Thread class");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
        System.out.println("Implementing thread by Runnable interface");
    }
}


public class ThreadExample {

    public static void main(String[] args) {
        // Creating and starting a thread
        MyThread thread = new MyThread();
        thread.start();

        // Creating and starting a thread using a Runnable
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        /**
         * Anonymous Threads: You can also create anonymous threads using either of the above approaches.*/
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code to be executed by the thread
                System.out.println("Implementing Anonymous Thread");
            }
        });
        anonymousThread.start();

    }
}

/**
 * Thread Management:
 * Java provides methods to manage threads, including:
 *
 * start():- Begins the execution of the thread.
 * join():- Waits for the thread to complete its execution.
 * sleep():- Pauses the current thread's execution for a specified time.
 * interrupt():- Interrupts a thread's execution.
 * isAlive():- Checks if a thread is still active.
 * setName() and getName():- Set and retrieve the thread's name.
 **/
