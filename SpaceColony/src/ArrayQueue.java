
/*
 * This data structure implements QueueInterface with a circular array
 * implementation. It provides default queue behavior, such as enqueue, dequeue,
 * getFront, and isEmpty.
 */

// public class ArrayQueue<T> implements QueueInterface<T>
public class ArrayQueue<T> {

    private T[] queue;
    private static final int DEFAULT_LENGTH = 10;
    private static final int MAX_CAPACITY = 100;
    private int enqueueIndex;
    private int dequeueIndex;
    private int size;
}
