public class QueueDriver {
    public static void main(String[] args) {
        Queue Q = new Queue();

        // Test to see if the isEmpty method works
        System.out.print("Method isEmpty check (should print true, as nothing is added): ");
        System.out.println(Q.isEmpty());

        System.out.println();

        // Test to see if the size() method works
        System.out.print("Method size check (should print 0, as nothing is added): ");
        System.out.println(Q.size());

        System.out.println();

        // Test to see if the enqueue and peek methods works
        System.out.println("Method enqueue + peek check (should be — Value = 1, Size = 3): ");
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        System.out.println("Value = " + Q.peek() + "   Size = " + Q.size());

        System.out.println();

        // "top" check of size and isEmpty methods
        System.out.print("Method isEmpty + size method checks (should print: false, 3): ");
        System.out.println(Q.isEmpty() + ", " + Q.size());

        System.out.println();

        //Test to see if the dequeue method works
        System.out.print("Method dequeue check (should be returning: 1, 2, 3): ");
        System.out.println("Values: " + Q.dequeue() + ", " + Q.dequeue() + ", " + Q.dequeue());

        System.out.println();

        //Final isEmpty check
        System.out.print("Final isEmpty check (should print true), and size check (should print 0): ");
        System.out.println(Q.isEmpty() + ", " + Q.size());
    }
}
