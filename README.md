## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |      10,000,000    |     0.018113    |
| Using ReentrantLock     |      10,000,000    |     1.085542    |
| Synchronized method     |      10,000,000    |     0.993739    |
| AtomicLong for total    |      10,000,000    |     0.397388    |

## 1. Using unsynchronized counter object

-1.1: Yes, but sometimes it's not be zero.

-1.2: the result is in the table above.

-1.3: Because when you run each thread in has load, change and replace. Sometimes both thread load the same amount. It should replace then load the value.	

## 2. Implications for Multi-threaded Applications

How might this affect real applications?  

## 3. Counter with ReentrantLock

-3.1: the result will always be zero and the average runtime is in the table.

-3.2: Because lock will done one thread first then do the other thread.

-3.3: ReentrantLock will lock the current working thread then unlock when it finish. ReentrantLock can choose what you want to lock in the method.
Use when multi-thread using same resource.

-3.4: Unlock thread that running and make other thread can be lock.

## 4. Counter with synchronized method

-4.1: the result will always be zero and the average runtime is in the table.

-4.2: Because synchronize make sure that only one method can access the resource at the given point in time.

-4.3: Synchronize make sure that only one method can access the resource at the given point in time. Use when multi-thread using same resource.

## 5. Counter with AtomicLong

answer question 5

## 6. Analysis of Results

answer question 6

## 7. Using Many Threads (optional)

