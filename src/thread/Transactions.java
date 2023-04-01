package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Transactions {

    static Account account = new Account();

    public static void main(String[] args) {
        MyDeposit myDeposit = new MyDeposit();
        MyWithdraw myWithdraw = new MyWithdraw();
        myDeposit.start();
        myWithdraw.start();
    }

    static class MyDeposit extends Thread {

        @Override
        public void run() {
            account.deposit(1000);
        }
    }

    static class MyWithdraw extends Thread {

        @Override
        public void run() {
            account.withdraw(500);
        }
    }

    static class Account {

        private Lock lock = new ReentrantLock();
        private Condition newCondition = lock.newCondition();
        int balance = 0;

        public void deposit(int amount) {
            lock.lock();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance += amount;
            System.out.println("Balance is increased by " + amount + " current balance is " + balance);
            newCondition.signal();

            lock.unlock();
        }

        public int withdraw(int amount) {
            lock.lock();
            while (amount > balance) {
                try {
                    newCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            balance -= amount;
            System.out.println("Balance is decreased by " + amount + " current balance is " + balance);
            lock.unlock();
            return amount;
        }
    }
}
