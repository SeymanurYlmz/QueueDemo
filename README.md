# QueueDemo
This project is a simple Queue (FIFO) data structure implementation written in Java.

It simulates adding, removing, and viewing people in a queue — similar to systems used in hospitals, banks, or ticket lines.

## Purpose
The purpose of this project is to demonstrate:
- How a queue works internally
- How nodes are linked using a singly linked list
- How to implement essential queue operations (enqueue, dequeue, peek, display)
- How to take user input and add it into the queue dynamically

### How It Works
The queue follows the standard FIFO (First In, First Out) principle:
- Enqueue → Adds a person to the end of the queue 
- Dequeue → Removes the first person from the queue
- Peek → Shows the current first person
- Display → Prints all elements in the queue
The user enters how many people they want to add, then inputs ID, Name, and Department — these are stored in nodes.

#### Technologies Used
- Java
- OOP (Object-Oriented Programming)
- Singly Linked List Structure
- Scanner (for user input)

##### Methods Explained

enqueue(int id, String name, String department)
- Adds a new person to the end of the queue. 
- If queue is empty → new node becomes both front and rear
- Otherwise → the new node is linked at the rear

dequeue()
- Removes the person at the front of the queue.
- If queue is empty → prints a warning
- Moves front to the next node
- If the queue becomes empty → rear is set to null

peek()
- Shows the information of the person currently at the front of the queue.

display()
- Prints all people in the queue from front → rear.

isEmpty()
- Returns true if both front and rear are null.


