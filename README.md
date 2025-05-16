# RUHungry

## Project Description
Java - based restaurant management system using data structures

This project focuses on demonstrating fundamental data structures such as:
- Hash tables with separate chaining
- Singly linked lists
- Queues and arrays
- File I/O for simulation input and output

## Features
- Menu management using a linked list of dishes and ingredients
- Stock system with a hash table for tracking inventory
- Customer queue and seating logic using arrays and custom queue implementation
- Restock and donation processing
- Order fulfillment and transaction tracking
- Can be tested using '.in' input files and '.out' output files

## How to Compile and Run

### Step 1: Compile the Project

```bash
javac -d bin src/restaurant/*.java
```

### Step 2: Run the Program
java -cp bin restaurant.Menu menu.in stock.in order1.in donate1.in restock1.in transaction1.in

## Acknowledgements

This project was completed as part of the CS112: Data Structures course at Rutgers University.
Some classes (such as 'Dish.java', 'Ingredient.java', 'MenuNode.java', 'StockNode.java', 'TransactionNode.java', 'Party.java', 'Queue.java', 'StdIn.java', and 'StdOut.java') were provided as part of the assignment framework.

All simulation logic, program flow, data structure integration, and command - line functionality in 'RUHungry.java' (some parts were already given, mentioned in the code comments) and 'Menu.java' were implemented independently by me.

## Author

Kashish Patel
Computer Science and ITI Major, Rutgers University
Github: [@kashish-1703] (https://github.com/kashish-1703)

## License

This project is licensed for educational and personal use only.
It may not be distributed, submitted, or published as part of another academic course.

> Portions of the code were provided by the course staff for CS112 at Rutgers University.
