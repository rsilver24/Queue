public class Queue<E> {
    //Instance Data

    private QueueNode first;
    private int size;


    //Constructors

    public Queue(){
        size = 0;
        first = new QueueNode();
    }


    //Methods

    void enqueue(E element){
        QueueNode newNode = new QueueNode(element);
        QueueNode subNode = first;
        if (size == 0){
            first.setValue(element);
        }else if (size == 1){
            first.setChildNode(newNode);
        }else{
            for (int i = 1; i < size; i++){
                subNode = subNode.getChildNode();
            } subNode.setChildNode(newNode);
        } size++;
    }

    E dequeue(){
        E value = (E)first.getValue();
        first = first.getChildNode();
        size--;
        return value;
    }

    boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }

    int size(){
        return size;
    }

    E peek(){
        return (E)first.getValue();
    }
}