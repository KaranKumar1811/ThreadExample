package com.lambton;

public class ThreadExample extends Thread
{
    public ThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
      for(int i=1;i<10;i++)
      {
          System.out.println(this.getName()+":"+i);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
