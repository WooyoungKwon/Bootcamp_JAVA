package Day22;

import java.util.Arrays;

class Worker extends Thread{
   public void run() {

       Runnable task = () -> {
           for (int i=0; i<5; i++) {
               System.out.println(i);
               try {
                   Thread.sleep(1);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       };
   }
}