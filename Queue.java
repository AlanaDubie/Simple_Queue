public class Queue
{
    private Item front;
    private Item rear;

    /**
     * creates empty queue
     */
    public Queue()
    {
        front = null;
        rear = null;
    }

    /**
     * adds new item to rear
     */
    public void insert(int i)
    {
        Item item = new Item(i);

        //queue is empty (have to updae front & rear)
        if (isEmpty())
            front = item;
        //queue is not empty (stick the new item to the end of the queue & updae rear)
        else
            rear.next = item;
        rear = item;
    }

    /**
     * removes item from front
     */
    public int remove()
    {
        int temp = -999;    //initialize to unusual value
        if (isEmpty()) //report an error and quit 
        {
            System.out.println("Error in remove() - queue is empty");
            System.err.println("Error in remove() - queue is empty");
            System.exit(1);
        }
        else //remove the item from the front of the queue and update front
        {
            temp = front.info;
            front = front.next;
        }
        return temp;
    }

     /**
     * returns true if the queue is empty
     */
    public Boolean isEmpty()
    {
        return front == null;
    }
}
