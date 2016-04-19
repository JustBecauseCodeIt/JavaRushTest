package com.javarush.test.level16.lesson10.task04;

/* А без interrupt слабо?
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
*/

public class Solution {
    public static boolean isCancel = false;
    public static void main(String[] args) throws InterruptedException {
       // TestThread tt = new TestThread();
        Thread t = new Thread(new TestThread());
        t.start();

        Thread.sleep(3000);

        Solution.isCancel=true;
      //  t.join();
        ourInterruptMethod();

       // Solution.isCancel=false;

    }

    public static void ourInterruptMethod() {
   //    Solution.isCancel=false;

    }

    public static class TestThread implements Runnable {


        @Override
        public void run() {
            while(!Solution.isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                }
            }
        }
    }
}
