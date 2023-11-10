The Queue class is a class meant to process data in a form not all to different from an ArrayList or a Stack.
What makes a Queue class unique is that it uses a "first in first out" structure, in which only the FIRST value can be accessed and deleted.
The Queue class uses the QueueNode class to process information. Each value of a queue is assigned a QueueNode to represent it.
Each QueueNode contains a value of any type, and a pointer to a child node that points to which item is "next" in the queue order.
The Queue class has three main operations:

enqueue - add a new node to the bottom of the queue

dequeue - remove the top node of the queue and return it

peek - look at and return the top node without removing it from the queue

Otherwise, the QueueDriver class is run to make sure the Queue class works as intended.
