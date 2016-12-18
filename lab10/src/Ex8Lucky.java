

class Param{
    public int x = 0;
    public int count = 0;
}

class mainClass {
    public static void main(String[] args) throws InterruptedException {
       Ex8Lucky ex8Lucky = new Ex8Lucky();
       ex8Lucky.check();
    }
}


public class Ex8Lucky {
    Param param = new Param();

     class LuckyThread extends Thread {
        @Override
        public void run() {
            while (param.x < 999999) {
                synchronized (param) {
                    param.x++;

                    if ((param.x % 10) + (param.x / 10) % 10 + (param.x / 100) % 10 == (param.x / 1000)
                            % 10 + (param.x / 10000) % 10 + (param.x / 100000) % 10) {
                        System.out.println(param.x);
                        param.count++;

                    }
                }
            }
        }
    }

  public  void check() throws InterruptedException {
        Thread t1 = new LuckyThread();
        Thread t2 = new LuckyThread();
        Thread t3 = new LuckyThread();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Total: " +  param.count);
    }
}

