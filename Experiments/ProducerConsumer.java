class ItemQueue {
    int item;
    boolean valueSet = false;

    synchronized int getItem() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Consummed:" + item);
        valueSet = false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        notify();
        return item;
    }

    synchronized void putItem(int item) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.item = item;
        valueSet = true;
        System.out.println("Produced: " + item);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        notify();
    }
}

class Producer implements Runnable {
    ItemQueue itemQueue;

    Producer(ItemQueue itemQueue) {
        this.itemQueue = itemQueue;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            itemQueue.putItem(i++);
        }
    }
}

class Consumer implements Runnable {
    ItemQueue itemQueue;

    Consumer(ItemQueue itemQueue) {
        this.itemQueue = itemQueue;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            itemQueue.getItem();
        }
    }
}

class ProducerConsumer {
    public static void main(String args[]) {
        ItemQueue itemQueue = new ItemQueue();
        new Producer(itemQueue);
        new Consumer(itemQueue);
    }

    /* Output:
        Produced: 0
        Consummed:0
        Produced: 1
        Consummed:1
        Produced: 2
        Consummed:2
        Produced: 3
        Consummed:3
        Produced: 4
        Consummed:4
        ....
     */
}
