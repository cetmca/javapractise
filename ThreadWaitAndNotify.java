package com.intvw.practise;

class Calculator extends Thread {
    long sumUptoMillion;
    long sumUptoTenMillion;

    public void run() {
        synchronized (this) {
            calculateSumUptoMillion();
            notify();
        }
        calculateSumUptoTenMillion();
    }

    private void calculateSumUptoMillion() {
        for (int i = 0; i < 1000000; i++) {
            sumUptoMillion += i;
        }
        System.out.println("Million done");
    }

    private void calculateSumUptoTenMillion() {
        for (int i = 0; i < 10000000; i++) {
            sumUptoTenMillion += i;
        }
        System.out.println("Ten Million done"+sumUptoTenMillion);
    }
}

public class ThreadWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Calculator thread = new Calculator();
        Calculator thread2 = new Calculator();
        
        synchronized(thread){
            thread.start();
            thread.wait();
        }
        
        synchronized(thread2){
            thread2.start();
            thread2.wait();
        }
        
        System.out.println("377777777-->"+thread.sumUptoMillion);
        System.out.println("388888888-->"+thread.sumUptoTenMillion);
        
        System.out.println("477777777777-->"+thread2.sumUptoMillion);
        System.out.println("488888888888-->"+thread2.sumUptoTenMillion);
    }
}
