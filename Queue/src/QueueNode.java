// Roan Silver      Created: September 21st 2023        Last Edits: November 10th, 2023
public class QueueNode<T, E> {

    // Instance Data !!!

    private QueueNode childQueueNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public QueueNode(){
        childQueueNode = null;
        value = null;
    }

    // 1 Input Constructor
    public QueueNode(T valueInput){
        this.value = valueInput;
        childQueueNode = null;
    }

    // 2 Input Constructor
    public QueueNode(T valueInput, QueueNode childQueueNodeInput){
        this.value = valueInput;
        this.childQueueNode = childQueueNodeInput;
    }

    // ACCESSORS :)

    public QueueNode getChildNode(){
        return childQueueNode;
    }

    public T getValue(){
        return value;
    }

    // MUTATORS :/

    public void setChildNode(QueueNode newChildQueueNode){
        childQueueNode = newChildQueueNode;
    }

    public void setValue(T newValue){
        value = newValue;
    }

    // Method Overrides >:(

    public String toString(){
        return "Node: " + value;
    }

    public boolean equals(QueueNode passingQueueNode){
        if (this.getValue().equals(passingQueueNode.getValue())){
            return true;
        } return false;
    }
}
