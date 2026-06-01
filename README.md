# 🧠 DSA Lab Programs — Java

**Student:** Mohit Raj Kashyap

---

## ⚙️ Getting Started

Make sure Java JDK is installed. Verify with:

```bash
java -version
javac -version
```

**To compile:** `javac ProgramName.java`
**To run:** `java ProgramName`

---

## 📁 Folder Structure

```
📂 Arrays/
    ├── ArrayTraversal.java
    ├── ArrayInsertion.java
    ├── ArrayDeletion.java
    ├── PolynomialMultiplication.java
    └── MatrixTranspose.java

📂 Stack/
    ├── StackUsingArray.java
    ├── StackUsingLinkedList.java
    ├── InfixToPostfix.java
    ├── DeleteMidStack.java
    └── PreviousSmallerElement.java

📂 Queue/
    ├── QueueUsingArray.java
    └── CircularQueue.java

📂 LinkedList/
    ├── InsertAtBeginning.java
    ├── DeleteAtPosition.java
    ├── DoublyLinkedList.java
    ├── MergeSortedLists.java
    └── PolynomialAdditionLinkedList.java

📂 Trees/
    ├── BuildTreeFromInorderPostorder.java
    ├── PreorderTraversal.java
    ├── BSTInsertion.java
    └── BSTDeletion.java

📂 Graph/
    ├── AdjacencyMatrix.java
    ├── BFSTraversal.java
    └── DFSTraversal.java

📂 Searching/
    ├── LinearSearch.java
    └── BinarySearch.java

📂 Problems/
    ├── ChocolateDistribution.java
    ├── FindPeakElement.java
    ├── FindDistinctElements.java
    └── TopKFrequentElements.java
```

---

## 📋 Programs — Input & Output Reference

---

### 🔷 Arrays

---

#### 1️⃣ ArrayTraversal.java

```bash
javac ArrayTraversal.java && java ArrayTraversal
```

**Input:**
```
5
10 20 30 40 50
```

**Output:**
```
Mohit Raj Kashyap
Array elements are:
arr[0] = 10
arr[1] = 20
arr[2] = 30
arr[3] = 40
arr[4] = 50
```

---

#### 2️⃣ ArrayInsertion.java

```bash
javac ArrayInsertion.java && java ArrayInsertion
```

**Input:**
```
4
1 2 4 5
3
2
```

**Output:**
```
Mohit Raj Kashyap
Array after insertion:
1 2 3 4 5
```

---

#### 3️⃣ ArrayDeletion.java

```bash
javac ArrayDeletion.java && java ArrayDeletion
```

**Input:**
```
5
10 20 30 40 50
2
```

**Output:**
```
Mohit Raj Kashyap
Deleted element: 30
Array after deletion:
10 20 40 50
```

---

#### 4️⃣ PolynomialMultiplication.java

```bash
javac PolynomialMultiplication.java && java PolynomialMultiplication
```

**Input:**
```
2
1 2 1
1
1 1
```

**Output:**
```
Mohit Raj Kashyap
Result polynomial coefficients (from degree 0 to 3):
1 3 3 1
Result: 1x^3 + 3x^2 + 3x^1 + 1x^0
```

---

#### 5️⃣ MatrixTranspose.java

```bash
javac MatrixTranspose.java && java MatrixTranspose
```

**Input:**
```
2
3
1 2 3
4 5 6
```

**Output:**
```
Mohit Raj Kashyap
Original Matrix:
   1   2   3
   4   5   6
Transposed Matrix:
   1   4
   2   5
   3   6
```

---

### 🔷 Stack

---

#### 6️⃣ StackUsingArray.java

```bash
javac StackUsingArray.java && java StackUsingArray
```

**Input:**
```
5
1 → Push 10
10
1 → Push 20
20
2 → Pop
4 → Display
5 → Exit
```

**Output:**
```
Mohit Raj Kashyap
10 pushed onto stack.
20 pushed onto stack.
20 popped from stack.
Stack (top to bottom): 10
```

---

#### 7️⃣ StackUsingLinkedList.java

```bash
javac StackUsingLinkedList.java && java StackUsingLinkedList
```

**Input:**
```
1 → Push 5
5
1 → Push 15
15
3 → Peek
2 → Pop
5 → Exit
```

**Output:**
```
Mohit Raj Kashyap
5 pushed onto stack.
15 pushed onto stack.
Top element: 15
15 popped from stack.
```

---

#### 8️⃣ InfixToPostfix.java

```bash
javac InfixToPostfix.java && java InfixToPostfix
```

**Input:**
```
a+b*(c-d)
```

**Output:**
```
Mohit Raj Kashyap
Infix Expression:   a+b*(c-d)
Postfix Expression: abcd-*+
```

---

#### 9️⃣ DeleteMidStack.java

```bash
javac DeleteMidStack.java && java DeleteMidStack
```

**Input:**
```
5
1 2 3 4 5
```

**Output:**
```
Mohit Raj Kashyap
Stack before deletion (top to bottom): 5 4 3 2 1
Stack after deleting middle element (top to bottom): 5 4 2 1
```

---

#### 🔟 PreviousSmallerElement.java

```bash
javac PreviousSmallerElement.java && java PreviousSmallerElement
```

**Input:**
```
6
4 5 2 10 8 3
```

**Output:**
```
Mohit Raj Kashyap
Element -> Previous Smaller Element
4  -> -1
5  -> 4
2  -> -1
10 -> 2
8  -> 2
3  -> 2
```

---

### 🔷 Queue

---

#### 1️⃣1️⃣ QueueUsingArray.java

```bash
javac QueueUsingArray.java && java QueueUsingArray
```

**Input:**
```
5
1 → Enqueue 10
10
1 → Enqueue 20
20
3 → Display
2 → Dequeue
4 → Exit
```

**Output:**
```
Mohit Raj Kashyap
10 enqueued.
20 enqueued.
Queue (front to rear): 10 20
10 dequeued.
```

---

#### 1️⃣2️⃣ CircularQueue.java

```bash
javac CircularQueue.java && java CircularQueue
```

**Input:**
```
3
1 → Enqueue 10, 20, 30
2 → Dequeue
1 → Enqueue 40
3 → Display
4 → Exit
```

**Output:**
```
Mohit Raj Kashyap
10 enqueued.
20 enqueued.
30 enqueued.
10 dequeued.
40 enqueued.
Circular Queue (front to rear): 20 30 40
```

---

### 🔷 Linked List

---

#### 1️⃣3️⃣ InsertAtBeginning.java

```bash
javac InsertAtBeginning.java && java InsertAtBeginning
```

**Input:**
```
1 → Insert 10
10
1 → Insert 20
20
2 → Display
3 → Exit
```

**Output:**
```
Mohit Raj Kashyap
10 inserted at beginning.
20 inserted at beginning.
Linked List: 20 -> 10 -> NULL
```

---

#### 1️⃣4️⃣ DeleteAtPosition.java

```bash
javac DeleteAtPosition.java && java DeleteAtPosition
```

**Input:**
```
Insert 10, 20, 30
2 → Delete at position 2
3 → Display
4 → Exit
```

**Output:**
```
Mohit Raj Kashyap
20 deleted from position 2.
Linked List: 10 -> 30 -> NULL
```

---

#### 1️⃣5️⃣ DoublyLinkedList.java

```bash
javac DoublyLinkedList.java && java DoublyLinkedList
```

**Input:**
```
1 → Insert 10, 20
3 → Display Forward
4 → Display Backward
5 → Exit
```

**Output:**
```
Mohit Raj Kashyap
10 inserted.
20 inserted.
Forward:  NULL <-> 10 <-> 20 <-> NULL
Backward: NULL <-> 20 <-> 10 <-> NULL
```

---

#### 1️⃣6️⃣ MergeSortedLists.java

```bash
javac MergeSortedLists.java && java MergeSortedLists
```

**Input:**
```
3
1 3 5
3
2 4 6
```

**Output:**
```
Mohit Raj Kashyap
List 1: 1 -> 3 -> 5 -> NULL
List 2: 2 -> 4 -> 6 -> NULL
Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
```

---

#### 1️⃣7️⃣ PolynomialAdditionLinkedList.java

```bash
javac PolynomialAdditionLinkedList.java && java PolynomialAdditionLinkedList
```

**Input:**
```
2
3 2
2 1
2
1 2
4 0
```

**Output:**
```
Mohit Raj Kashyap
Polynomial 1: 3x^2 + 2x^1
Polynomial 2: 1x^2 + 4x^0
Sum:          4x^2 + 2x^1 + 4x^0
```

---

### 🔷 Trees

---

#### 1️⃣8️⃣ BuildTreeFromInorderPostorder.java

```bash
javac BuildTreeFromInorderPostorder.java && java BuildTreeFromInorderPostorder
```

**Input:**
```
7
4 2 5 1 6 3 7
4 5 2 6 7 3 1
```

**Output:**
```
Mohit Raj Kashyap
Inorder of built tree:  4 2 5 1 6 3 7
Preorder of built tree: 1 2 4 5 3 6 7
```

---

#### 1️⃣9️⃣ PreorderTraversal.java

```bash
javac PreorderTraversal.java && java PreorderTraversal
```

**Input:**
```
5
5 3 7 1 4
```

**Output:**
```
Mohit Raj Kashyap
Preorder Traversal:  5 3 1 4 7
Inorder Traversal:   1 3 4 5 7
Postorder Traversal: 1 4 3 7 5
```

---

#### 2️⃣0️⃣ BSTInsertion.java

```bash
javac BSTInsertion.java && java BSTInsertion
```

**Input:**
```
1 → Insert 50, 30, 70
2 → Display
3 → Search 30
4 → Exit
```

**Output:**
```
Mohit Raj Kashyap
50 inserted.
30 inserted.
70 inserted.
Inorder (sorted): 30 50 70
30 found in BST.
```

---

#### 2️⃣1️⃣ BSTDeletion.java

```bash
javac BSTDeletion.java && java BSTDeletion
```

**Input:**
```
1 → Insert 50, 30, 70
2 → Delete 30
3 → Display
4 → Exit
```

**Output:**
```
Mohit Raj Kashyap
30 deleted from BST.
Inorder: 50 70
```

---

### 🔷 Graph

---

#### 2️⃣2️⃣ AdjacencyMatrix.java

```bash
javac AdjacencyMatrix.java && java AdjacencyMatrix
```

**Input:**
```
4
4
0 1
0 2
1 3
2 3
```

**Output:**
```
Mohit Raj Kashyap
Adjacency Matrix:
      0  1  2  3
  0 [ 0  1  1  0 ]
  1 [ 1  0  0  1 ]
  2 [ 1  0  0  1 ]
  3 [ 0  1  1  0 ]
```

---

#### 2️⃣3️⃣ BFSTraversal.java

```bash
javac BFSTraversal.java && java BFSTraversal
```

**Input:**
```
5
5
0 1 | 0 2 | 1 3 | 2 4 | 3 4
Start: 0
```

**Output:**
```
Mohit Raj Kashyap
BFS Traversal: 0 1 2 3 4
```

---

#### 2️⃣4️⃣ DFSTraversal.java

```bash
javac DFSTraversal.java && java DFSTraversal
```

**Input:**
```
5
5
0 1 | 0 2 | 1 3 | 2 4 | 3 4
Start: 0
```

**Output:**
```
Mohit Raj Kashyap
DFS Traversal: 0 1 3 4 2
```

---

### 🔷 Searching

---

#### 2️⃣5️⃣ LinearSearch.java

```bash
javac LinearSearch.java && java LinearSearch
```

**Input:**
```
6
10 25 30 45 60 75
30
```

**Output:**
```
Mohit Raj Kashyap
Element 30 found at index 2.
```

---

#### 2️⃣6️⃣ BinarySearch.java

```bash
javac BinarySearch.java && java BinarySearch
```

**Input:**
```
6
10 20 30 40 50 60
40
```

**Output:**
```
Mohit Raj Kashyap
Element 40 found at index 3.
```

---

### 🔷 Problems

---

#### 2️⃣7️⃣ ChocolateDistribution.java

```bash
javac ChocolateDistribution.java && java ChocolateDistribution
```

**Input:**
```
7
3 4 1 9 56 7 9
3
```

**Output:**
```
Mohit Raj Kashyap
Sorted packets: [1, 3, 4, 7, 9, 9, 56]
Packets distributed to students:
3 4 7
Minimum difference between max and min chocolates: 4
```

---

#### 2️⃣8️⃣ FindPeakElement.java

```bash
javac FindPeakElement.java && java FindPeakElement
```

**Input:**
```
5
1 3 20 4 1
```

**Output:**
```
Mohit Raj Kashyap
Peak element is: 20 at index 2
```

---

#### 2️⃣9️⃣ FindDistinctElements.java

```bash
javac FindDistinctElements.java && java FindDistinctElements
```

**Input:**
```
8
1 2 3 2 4 3 5 1
```

**Output:**
```
Mohit Raj Kashyap
Original array:   1 2 3 2 4 3 5 1
Distinct elements: 1 2 3 4 5
Total distinct elements: 5
```

---

#### 3️⃣0️⃣ TopKFrequentElements.java

```bash
javac TopKFrequentElements.java && java TopKFrequentElements
```

**Input:**
```
8
1 1 1 2 2 3 4 4
2
```

**Output:**
```
Mohit Raj Kashyap
Top 2 Frequent Elements:
Element      Frequency
----------------------
1            3
2            2
```

---

## 📊 Quick Reference Table

| # | Program | Topic | Key Concept |
|---|---------|-------|-------------|
| 1 | ArrayTraversal | Arrays | Iteration |
| 2 | ArrayInsertion | Arrays | Shifting elements |
| 3 | ArrayDeletion | Arrays | Shifting elements |
| 4 | PolynomialMultiplication | Arrays | Coefficient mapping |
| 5 | MatrixTranspose | Arrays | 2D array manipulation |
| 6 | StackUsingArray | Stack | LIFO with array |
| 7 | StackUsingLinkedList | Stack | LIFO with nodes |
| 8 | InfixToPostfix | Stack | Operator precedence |
| 9 | DeleteMidStack | Stack | Recursion |
| 10 | PreviousSmallerElement | Stack | Monotonic stack |
| 11 | QueueUsingArray | Queue | FIFO with array |
| 12 | CircularQueue | Queue | Wrap-around indexing |
| 13 | InsertAtBeginning | Linked List | Head pointer |
| 14 | DeleteAtPosition | Linked List | Node traversal |
| 15 | DoublyLinkedList | Linked List | Bidirectional links |
| 16 | MergeSortedLists | Linked List | Two-pointer merge |
| 17 | PolynomialAdditionLinkedList | Linked List | Coefficient matching |
| 18 | BuildTreeFromInorderPostorder | Trees | Tree reconstruction |
| 19 | PreorderTraversal | Trees | DFS traversals |
| 20 | BSTInsertion | Trees | BST property |
| 21 | BSTDeletion | Trees | Successor/predecessor |
| 22 | AdjacencyMatrix | Graph | Matrix representation |
| 23 | BFSTraversal | Graph | Level-order traversal |
| 24 | DFSTraversal | Graph | Recursive DFS |
| 25 | LinearSearch | Searching | O(n) search |
| 26 | BinarySearch | Searching | O(log n) search |
| 27 | ChocolateDistribution | Problems | Sorting + sliding window |
| 28 | FindPeakElement | Problems | Binary search variant |
| 29 | FindDistinctElements | Problems | HashSet |
| 30 | TopKFrequentElements | Problems | HashMap + sorting |

---

> 💡 **Tip:** Always compile before running. If you get a `ClassNotFoundException`, make sure you're running `java` from the same directory as the `.class` file.

---

*📝 DSA Lab — Java | Mohit Raj Kashyap*
