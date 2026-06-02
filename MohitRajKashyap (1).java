import java.util.*;

public class MohitRajKashyap {

    static Scanner sc = new Scanner(System.in);

    static void printHeader() {
        System.out.println("==================================================");
        System.out.println("   Mohit Raj Kashyap  |  24SCSE1180371");
        System.out.println("==================================================");
    }

    static void printMenu() {
        System.out.println("\n==================== MAIN MENU ====================");
        System.out.println(" 1.  Traverse Array and Display Elements");
        System.out.println(" 2.  Insert Element at Given Position");
        System.out.println(" 3.  Remove Element from Array");
        System.out.println(" 4.  Multiply Two Polynomials");
        System.out.println(" 5.  Transpose of a Matrix");
        System.out.println(" 6.  Stack Using Array (Push & Pop)");
        System.out.println(" 7.  Stack Using Linked List");
        System.out.println(" 8.  Infix to Postfix Conversion");
        System.out.println(" 9.  Queue Using Array");
        System.out.println(" 10. Circular Queue");
        System.out.println(" 11. Insert Node at Beginning of Linked List");
        System.out.println(" 12. Delete Node from Given Position (Linked List)");
        System.out.println(" 13. Doubly Linked List with Insertion");
        System.out.println(" 14. Merge Two Sorted Linked Lists");
        System.out.println(" 15. Add Two Polynomials Using Linked List");
        System.out.println(" 16. Construct Binary Tree from Inorder & Postorder");
        System.out.println(" 17. Preorder Traversal");
        System.out.println(" 18. Insert Nodes in Binary Search Tree");
        System.out.println(" 19. Delete Node from Binary Search Tree");
        System.out.println(" 20. Graph Using Adjacency Matrix");
        System.out.println(" 21. BFS Traversal");
        System.out.println(" 22. DFS Traversal");
        System.out.println(" 23. Linear Search");
        System.out.println(" 24. Binary Search");
        System.out.println(" 25. Chocolate Distribution Problem");
        System.out.println(" 26. Find Peak Element");
        System.out.println(" 27. Find Distinct Elements");
        System.out.println(" 28. Top K Frequent Elements");
        System.out.println(" 29. Previous Smaller Element");
        System.out.println(" 30. Delete Mid of a Stack");
        System.out.println(" 0.  Exit");
        System.out.println("====================================================");
        System.out.print("Enter your choice: ");
    }

    static int[] readArray(String label) {
        System.out.print("Enter number of elements for " + label + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printHeader();
        int choice;
        do {
            printMenu();
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {

                case 1: {
                    System.out.println("--- Traverse Array and Display Elements ---");
                    int[] arr = readArray("array");
                    System.out.print("Array elements: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("[" + i + "]=" + arr[i] + "  ");
                    }
                    System.out.println();
                    break;
                }

                case 2: {
                    System.out.println("--- Insert Element at Given Position ---");
                    int[] arr = readArray("array");
                    int len = arr.length;
                    System.out.print("Enter position to insert (0 to " + len + "): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    int[] result = new int[len + 1];
                    for (int i = 0; i < pos; i++) result[i] = arr[i];
                    result[pos] = val;
                    for (int i = pos; i < len; i++) result[i + 1] = arr[i];
                    System.out.print("Array after inserting " + val + " at position " + pos + ": ");
                    printArray(result, len + 1);
                    break;
                }

                case 3: {
                    System.out.println("--- Remove Element from Array ---");
                    int[] arr = readArray("array");
                    int len = arr.length;
                    System.out.print("Enter position to remove (0 to " + (len - 1) + "): ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos >= len) { System.out.println("Invalid position!"); break; }
                    System.out.println("Removed element: " + arr[pos]);
                    for (int i = pos; i < len - 1; i++) arr[i] = arr[i + 1];
                    System.out.print("Array after removal: ");
                    printArray(arr, len - 1);
                    break;
                }

                case 4: {
                    System.out.println("--- Multiply Two Polynomials ---");
                    System.out.println("Enter coefficients from highest degree to lowest.");
                    int[] p1 = readArray("Polynomial 1");
                    int[] p2 = readArray("Polynomial 2");
                    int d1 = p1.length - 1, d2 = p2.length - 1;
                    int[] res = new int[d1 + d2 + 1];
                    for (int i = 0; i <= d1; i++)
                        for (int j = 0; j <= d2; j++)
                            res[i + j] += p1[i] * p2[j];
                    System.out.print("Poly 1: ");
                    for (int i = 0; i <= d1; i++) System.out.print(p1[i] + "x^" + (d1 - i) + (i < d1 ? " + " : ""));
                    System.out.print("\nPoly 2: ");
                    for (int i = 0; i <= d2; i++) System.out.print(p2[i] + "x^" + (d2 - i) + (i < d2 ? " + " : ""));
                    System.out.print("\nResult: ");
                    int rLen = res.length;
                    for (int i = 0; i < rLen; i++) System.out.print(res[i] + "x^" + (rLen - 1 - i) + (i < rLen - 1 ? " + " : ""));
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("--- Transpose of a Matrix ---");
                    System.out.print("Enter number of rows: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter number of columns: ");
                    int cols = sc.nextInt();
                    int[][] mat = new int[rows][cols];
                    System.out.println("Enter matrix elements row by row:");
                    for (int i = 0; i < rows; i++)
                        for (int j = 0; j < cols; j++) mat[i][j] = sc.nextInt();
                    System.out.println("Original Matrix:");
                    for (int i = 0; i < rows; i++) { for (int j = 0; j < cols; j++) System.out.print(mat[i][j] + "\t"); System.out.println(); }
                    int[][] trans = new int[cols][rows];
                    for (int i = 0; i < rows; i++)
                        for (int j = 0; j < cols; j++) trans[j][i] = mat[i][j];
                    System.out.println("Transposed Matrix:");
                    for (int i = 0; i < cols; i++) { for (int j = 0; j < rows; j++) System.out.print(trans[i][j] + "\t"); System.out.println(); }
                    break;
                }

                case 6: {
                    System.out.println("--- Stack Using Array ---");
                    int[] stk = new int[100];
                    int top = -1;
                    int sChoice;
                    do {
                        System.out.println("\n1. Push  2. Pop  3. Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value to push: ");
                            int v = sc.nextInt();
                            if (top >= 99) System.out.println("Stack Overflow!");
                            else { stk[++top] = v; System.out.println(v + " pushed."); }
                        } else if (sChoice == 2) {
                            if (top == -1) System.out.println("Stack Underflow!");
                            else System.out.println("Popped: " + stk[top--]);
                        } else if (sChoice == 3) {
                            if (top == -1) System.out.println("Stack is empty.");
                            else { System.out.print("Stack (bottom to top): "); for (int i = 0; i <= top; i++) System.out.print(stk[i] + " "); System.out.println(); }
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 7: {
                    System.out.println("--- Stack Using Linked List ---");
                    int[] llStk = new int[100];
                    int[] llNxt = new int[100];
                    int llTop = -1, llCnt = 0;
                    int sChoice;
                    do {
                        System.out.println("\n1. Push  2. Pop  3. Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value to push: ");
                            int v = sc.nextInt();
                            int nd = llCnt++;
                            llStk[nd] = v; llNxt[nd] = llTop; llTop = nd;
                            System.out.println(v + " pushed.");
                        } else if (sChoice == 2) {
                            if (llTop == -1) System.out.println("Stack is empty!");
                            else { System.out.println("Popped: " + llStk[llTop]); llTop = llNxt[llTop]; }
                        } else if (sChoice == 3) {
                            if (llTop == -1) System.out.println("Stack is empty.");
                            else { System.out.print("Stack (top to bottom): "); int c = llTop; while (c != -1) { System.out.print(llStk[c] + " "); c = llNxt[c]; } System.out.println(); }
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 8: {
                    System.out.println("--- Infix to Postfix Conversion ---");
                    sc.nextLine();
                    System.out.print("Enter infix expression (e.g. A+B*C): ");
                    String infix = sc.nextLine().trim();
                    StringBuilder postfix = new StringBuilder();
                    Stack<Character> opStk = new Stack<>();
                    for (int i = 0; i < infix.length(); i++) {
                        char ch = infix.charAt(i);
                        if (Character.isLetterOrDigit(ch)) {
                            postfix.append(ch);
                        } else if (ch == '(') {
                            opStk.push(ch);
                        } else if (ch == ')') {
                            while (!opStk.isEmpty() && opStk.peek() != '(') postfix.append(opStk.pop());
                            if (!opStk.isEmpty()) opStk.pop();
                        } else {
                            int p1 = (ch == '+' || ch == '-') ? 1 : (ch == '*' || ch == '/') ? 2 : 0;
                            while (!opStk.isEmpty() && opStk.peek() != '(') {
                                char tp = opStk.peek();
                                int p2 = (tp == '+' || tp == '-') ? 1 : (tp == '*' || tp == '/') ? 2 : 0;
                                if (p2 >= p1) postfix.append(opStk.pop()); else break;
                            }
                            opStk.push(ch);
                        }
                    }
                    while (!opStk.isEmpty()) postfix.append(opStk.pop());
                    System.out.println("Infix:   " + infix);
                    System.out.println("Postfix: " + postfix.toString());
                    break;
                }

                case 9: {
                    System.out.println("--- Queue Using Array ---");
                    int[] que = new int[100];
                    int qF = 0, qR = -1, qCnt = 0;
                    int sChoice;
                    do {
                        System.out.println("\n1. Enqueue  2. Dequeue  3. Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            if (qCnt >= 100) System.out.println("Queue Full!");
                            else { que[++qR] = v; qCnt++; System.out.println(v + " enqueued."); }
                        } else if (sChoice == 2) {
                            if (qCnt == 0) System.out.println("Queue Empty!");
                            else { System.out.println("Dequeued: " + que[qF++]); qCnt--; }
                        } else if (sChoice == 3) {
                            if (qCnt == 0) System.out.println("Queue is empty.");
                            else { System.out.print("Queue: "); for (int i = qF; i <= qR; i++) System.out.print(que[i] + " "); System.out.println(); }
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 10: {
                    System.out.println("--- Circular Queue ---");
                    System.out.print("Enter circular queue size: ");
                    int cqSz = sc.nextInt();
                    int[] cq = new int[cqSz];
                    int cqF = -1, cqR = -1, cqCnt = 0;
                    int sChoice;
                    do {
                        System.out.println("\n1. Enqueue  2. Dequeue  3. Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            if (cqCnt == cqSz) { System.out.println("Circular Queue Full!"); }
                            else {
                                System.out.print("Enter value: ");
                                int v = sc.nextInt();
                                cqR = (cqR + 1) % cqSz;
                                cq[cqR] = v;
                                if (cqF == -1) cqF = 0;
                                cqCnt++;
                                System.out.println(v + " enqueued.");
                            }
                        } else if (sChoice == 2) {
                            if (cqCnt == 0) System.out.println("Circular Queue Empty!");
                            else { System.out.println("Dequeued: " + cq[cqF]); cqF = (cqF + 1) % cqSz; cqCnt--; }
                        } else if (sChoice == 3) {
                            if (cqCnt == 0) System.out.println("Queue is empty.");
                            else { System.out.print("Circular Queue: "); int idx = cqF; for (int i = 0; i < cqCnt; i++) { System.out.print(cq[idx] + " "); idx = (idx + 1) % cqSz; } System.out.println(); }
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 11: {
                    System.out.println("--- Insert Node at Beginning of Linked List ---");
                    int[] slD = new int[100];
                    int[] slN = new int[100];
                    int slH = -1, slC = 0;
                    int sChoice;
                    do {
                        System.out.println("\n1. Insert at Beginning  2. Display  3. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = slC++;
                            slD[nd] = v; slN[nd] = slH; slH = nd;
                            System.out.println(v + " inserted at beginning.");
                        } else if (sChoice == 2) {
                            if (slH == -1) System.out.println("List is empty.");
                            else { System.out.print("List: "); int c = slH; while (c != -1) { System.out.print(slD[c] + " -> "); c = slN[c]; } System.out.println("NULL"); }
                        }
                    } while (sChoice != 3);
                    break;
                }

                case 12: {
                    System.out.println("--- Delete Node from Given Position (Linked List) ---");
                    int[] slD = new int[100];
                    int[] slN = new int[100];
                    int slH = -1, slC = 0;
                    System.out.println("Build the linked list first.");
                    int sChoice;
                    do {
                        System.out.println("\n1. Add node (end)  2. Delete at position  3. Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = slC++;
                            slD[nd] = v; slN[nd] = -1;
                            if (slH == -1) { slH = nd; }
                            else { int c = slH; while (slN[c] != -1) c = slN[c]; slN[c] = nd; }
                        } else if (sChoice == 2) {
                            System.out.print("Enter position to delete (0-based): ");
                            int pos = sc.nextInt();
                            if (slH == -1) { System.out.println("List is empty!"); break; }
                            if (pos == 0) { System.out.println("Deleted: " + slD[slH]); slH = slN[slH]; }
                            else {
                                int prev = slH;
                                for (int i = 0; i < pos - 1 && slN[prev] != -1; i++) prev = slN[prev];
                                if (slN[prev] == -1) System.out.println("Position out of range!");
                                else { System.out.println("Deleted: " + slD[slN[prev]]); slN[prev] = slN[slN[prev]]; }
                            }
                        } else if (sChoice == 3) {
                            if (slH == -1) System.out.println("List is empty.");
                            else { System.out.print("List: "); int c = slH; while (c != -1) { System.out.print(slD[c] + " -> "); c = slN[c]; } System.out.println("NULL"); }
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 13: {
                    System.out.println("--- Doubly Linked List with Insertion ---");
                    int[] dD = new int[100];
                    int[] dNx = new int[100];
                    int[] dPr = new int[100];
                    int dH = -1, dC = 0;
                    int sChoice;
                    do {
                        System.out.println("\n1. Insert at Beginning  2. Insert at End  3. Display Forward  4. Display Backward  5. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = dC++;
                            dD[nd] = v; dNx[nd] = dH; dPr[nd] = -1;
                            if (dH != -1) dPr[dH] = nd;
                            dH = nd;
                            System.out.println(v + " inserted at beginning.");
                        } else if (sChoice == 2) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = dC++;
                            dD[nd] = v; dNx[nd] = -1;
                            if (dH == -1) { dPr[nd] = -1; dH = nd; }
                            else { int c = dH; while (dNx[c] != -1) c = dNx[c]; dNx[c] = nd; dPr[nd] = c; }
                            System.out.println(v + " inserted at end.");
                        } else if (sChoice == 3) {
                            System.out.print("Forward: "); int c = dH; while (c != -1) { System.out.print(dD[c] + " <-> "); c = dNx[c]; } System.out.println("NULL");
                        } else if (sChoice == 4) {
                            int last = dH;
                            while (last != -1 && dNx[last] != -1) last = dNx[last];
                            System.out.print("Backward: "); while (last != -1) { System.out.print(dD[last] + " <-> "); last = dPr[last]; } System.out.println("NULL");
                        }
                    } while (sChoice != 5);
                    break;
                }

                case 14: {
                    System.out.println("--- Merge Two Sorted Linked Lists ---");
                    int[] a1 = readArray("first sorted list");
                    int[] a2 = readArray("second sorted list");
                    Arrays.sort(a1); Arrays.sort(a2);
                    List<Integer> merged = new ArrayList<>();
                    int i = 0, j = 0;
                    while (i < a1.length && j < a2.length) {
                        if (a1[i] <= a2[j]) merged.add(a1[i++]); else merged.add(a2[j++]);
                    }
                    while (i < a1.length) merged.add(a1[i++]);
                    while (j < a2.length) merged.add(a2[j++]);
                    System.out.print("Merged Sorted List: ");
                    for (int v : merged) System.out.print(v + " -> ");
                    System.out.println("NULL");
                    break;
                }

                case 15: {
                    System.out.println("--- Add Two Polynomials Using Linked List ---");
                    System.out.println("Polynomial 1:");
                    System.out.print("  Enter number of terms: ");
                    int t1 = sc.nextInt();
                    int[] exp1 = new int[t1], coef1 = new int[t1];
                    for (int i = 0; i < t1; i++) {
                        System.out.print("  Term " + (i + 1) + " -> Coefficient: ");
                        coef1[i] = sc.nextInt();
                        System.out.print("  Term " + (i + 1) + " -> Exponent: ");
                        exp1[i] = sc.nextInt();
                    }
                    System.out.println("Polynomial 2:");
                    System.out.print("  Enter number of terms: ");
                    int t2 = sc.nextInt();
                    int[] exp2 = new int[t2], coef2 = new int[t2];
                    for (int i = 0; i < t2; i++) {
                        System.out.print("  Term " + (i + 1) + " -> Coefficient: ");
                        coef2[i] = sc.nextInt();
                        System.out.print("  Term " + (i + 1) + " -> Exponent: ");
                        exp2[i] = sc.nextInt();
                    }
                    Map<Integer, Integer> polyMap = new TreeMap<>(Collections.reverseOrder());
                    for (int i = 0; i < t1; i++) polyMap.merge(exp1[i], coef1[i], Integer::sum);
                    for (int i = 0; i < t2; i++) polyMap.merge(exp2[i], coef2[i], Integer::sum);
                    System.out.print("Result: ");
                    boolean first = true;
                    for (Map.Entry<Integer, Integer> e : polyMap.entrySet()) {
                        if (e.getValue() != 0) {
                            if (!first) System.out.print(" + ");
                            System.out.print(e.getValue() + "x^" + e.getKey());
                            first = false;
                        }
                    }
                    System.out.println();
                    break;
                }

                case 16: {
                    System.out.println("--- Construct Binary Tree from Inorder and Postorder ---");
                    int[] ino = readArray("inorder sequence");
                    int[] posto = readArray("postorder sequence");
                    int[] btree = new int[200];
                    int[] bl = new int[200], br = new int[200];
                    Arrays.fill(bl, -1); Arrays.fill(br, -1);
                    int[] pIdx = {posto.length - 1};
                    int[] cnt = {0};
                    int root = buildTree(ino, posto, 0, ino.length - 1, pIdx, btree, bl, br, cnt);
                    System.out.println("Binary Tree constructed. Root value: " + btree[root]);
                    System.out.print("Preorder of constructed tree: ");
                    Stack<Integer> preStk = new Stack<>();
                    preStk.push(root);
                    while (!preStk.isEmpty()) {
                        int nd = preStk.pop();
                        if (nd == -1) continue;
                        System.out.print(btree[nd] + " ");
                        preStk.push(br[nd]);
                        preStk.push(bl[nd]);
                    }
                    System.out.println();
                    break;
                }

                case 17: {
                    System.out.println("--- Preorder Traversal (Array-based Complete Binary Tree) ---");
                    int[] tree = readArray("binary tree (level-order, use -1 for null)");
                    System.out.print("Preorder Traversal: ");
                    preorderTraversal(tree, 0);
                    System.out.println();
                    break;
                }

                case 18: {
                    System.out.println("--- Insert Nodes in Binary Search Tree ---");
                    int[] bst = new int[200];
                    int[] bstL = new int[200], bstR = new int[200];
                    Arrays.fill(bstL, -1); Arrays.fill(bstR, -1);
                    int bstCnt = 0, bstRoot = -1;
                    int sChoice;
                    do {
                        System.out.println("\n1. Insert  2. Inorder Display  3. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = bstCnt++;
                            bst[nd] = v; bstL[nd] = -1; bstR[nd] = -1;
                            if (bstRoot == -1) bstRoot = nd;
                            else {
                                int cur = bstRoot;
                                while (true) {
                                    if (v < bst[cur]) { if (bstL[cur] == -1) { bstL[cur] = nd; break; } else cur = bstL[cur]; }
                                    else { if (bstR[cur] == -1) { bstR[cur] = nd; break; } else cur = bstR[cur]; }
                                }
                            }
                            System.out.println(v + " inserted.");
                        } else if (sChoice == 2) {
                            System.out.print("BST Inorder: ");
                            Stack<Integer> stk2 = new Stack<>();
                            int cur = bstRoot;
                            while (cur != -1 || !stk2.isEmpty()) {
                                while (cur != -1) { stk2.push(cur); cur = bstL[cur]; }
                                cur = stk2.pop(); System.out.print(bst[cur] + " "); cur = bstR[cur];
                            }
                            System.out.println();
                        }
                    } while (sChoice != 3);
                    break;
                }

                case 19: {
                    System.out.println("--- Delete Node from Binary Search Tree ---");
                    int[] bst = new int[200];
                    int[] bstL = new int[200], bstR = new int[200];
                    Arrays.fill(bstL, -1); Arrays.fill(bstR, -1);
                    int bstCnt = 0, bstRoot = -1;
                    System.out.println("Build the BST first.");
                    int sChoice;
                    do {
                        System.out.println("\n1. Insert  2. Delete  3. Inorder Display  4. Back");
                        System.out.print("Choice: ");
                        sChoice = sc.nextInt();
                        if (sChoice == 1) {
                            System.out.print("Enter value: ");
                            int v = sc.nextInt();
                            int nd = bstCnt++;
                            bst[nd] = v; bstL[nd] = -1; bstR[nd] = -1;
                            if (bstRoot == -1) bstRoot = nd;
                            else {
                                int cur = bstRoot;
                                while (true) {
                                    if (v < bst[cur]) { if (bstL[cur] == -1) { bstL[cur] = nd; break; } else cur = bstL[cur]; }
                                    else { if (bstR[cur] == -1) { bstR[cur] = nd; break; } else cur = bstR[cur]; }
                                }
                            }
                            System.out.println(v + " inserted.");
                        } else if (sChoice == 2) {
                            System.out.print("Enter value to delete: ");
                            int v = sc.nextInt();
                            bstRoot = bstDelete(bst, bstL, bstR, bstRoot, v);
                            System.out.println(v + " deleted (if it existed).");
                        } else if (sChoice == 3) {
                            System.out.print("BST Inorder: ");
                            Stack<Integer> stk2 = new Stack<>();
                            int cur = bstRoot;
                            while (cur != -1 || !stk2.isEmpty()) {
                                while (cur != -1) { stk2.push(cur); cur = bstL[cur]; }
                                cur = stk2.pop(); System.out.print(bst[cur] + " "); cur = bstR[cur];
                            }
                            System.out.println();
                        }
                    } while (sChoice != 4);
                    break;
                }

                case 20: {
                    System.out.println("--- Graph Using Adjacency Matrix ---");
                    System.out.print("Enter number of vertices: ");
                    int gn = sc.nextInt();
                    int[][] gAdj = new int[gn][gn];
                    System.out.print("Enter number of edges: ");
                    int ge = sc.nextInt();
                    System.out.println("Enter each edge as: vertex1 vertex2 (0-based)");
                    for (int i = 0; i < ge; i++) {
                        System.out.print("Edge " + (i + 1) + ": ");
                        int u = sc.nextInt(), v = sc.nextInt();
                        gAdj[u][v] = 1; gAdj[v][u] = 1;
                    }
                    System.out.println("Adjacency Matrix:");
                    System.out.print("   ");
                    for (int i = 0; i < gn; i++) System.out.print(i + " ");
                    System.out.println();
                    for (int i = 0; i < gn; i++) {
                        System.out.print(i + ": ");
                        for (int j = 0; j < gn; j++) System.out.print(gAdj[i][j] + " ");
                        System.out.println();
                    }
                    break;
                }

                case 21: {
                    System.out.println("--- BFS Traversal ---");
                    System.out.print("Enter number of vertices: ");
                    int gn = sc.nextInt();
                    int[][] gAdj = new int[gn][gn];
                    System.out.print("Enter number of edges: ");
                    int ge = sc.nextInt();
                    System.out.println("Enter each edge as: vertex1 vertex2");
                    for (int i = 0; i < ge; i++) {
                        System.out.print("Edge " + (i + 1) + ": ");
                        int u = sc.nextInt(), v = sc.nextInt();
                        gAdj[u][v] = 1; gAdj[v][u] = 1;
                    }
                    System.out.print("Enter start vertex for BFS: ");
                    int start = sc.nextInt();
                    boolean[] vis = new boolean[gn];
                    Queue<Integer> bfsQ = new LinkedList<>();
                    bfsQ.add(start); vis[start] = true;
                    System.out.print("BFS Traversal: ");
                    while (!bfsQ.isEmpty()) {
                        int v = bfsQ.poll();
                        System.out.print(v + " ");
                        for (int i = 0; i < gn; i++) if (gAdj[v][i] == 1 && !vis[i]) { vis[i] = true; bfsQ.add(i); }
                    }
                    System.out.println();
                    break;
                }

                case 22: {
                    System.out.println("--- DFS Traversal ---");
                    System.out.print("Enter number of vertices: ");
                    int gn = sc.nextInt();
                    int[][] gAdj = new int[gn][gn];
                    System.out.print("Enter number of edges: ");
                    int ge = sc.nextInt();
                    System.out.println("Enter each edge as: vertex1 vertex2");
                    for (int i = 0; i < ge; i++) {
                        System.out.print("Edge " + (i + 1) + ": ");
                        int u = sc.nextInt(), v = sc.nextInt();
                        gAdj[u][v] = 1; gAdj[v][u] = 1;
                    }
                    System.out.print("Enter start vertex for DFS: ");
                    int start = sc.nextInt();
                    boolean[] vis = new boolean[gn];
                    Stack<Integer> dfsStk = new Stack<>();
                    dfsStk.push(start);
                    System.out.print("DFS Traversal: ");
                    while (!dfsStk.isEmpty()) {
                        int v = dfsStk.pop();
                        if (!vis[v]) { vis[v] = true; System.out.print(v + " "); for (int i = gn - 1; i >= 0; i--) if (gAdj[v][i] == 1 && !vis[i]) dfsStk.push(i); }
                    }
                    System.out.println();
                    break;
                }

                case 23: {
                    System.out.println("--- Linear Search ---");
                    int[] arr = readArray("array");
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int result = -1;
                    for (int i = 0; i < arr.length; i++) if (arr[i] == key) { result = i; break; }
                    System.out.println(key + (result != -1 ? " found at index " + result : " not found in the array."));
                    break;
                }

                case 24: {
                    System.out.println("--- Binary Search ---");
                    int[] arr = readArray("sorted array");
                    Arrays.sort(arr);
                    System.out.print("Sorted Array: "); printArray(arr, arr.length);
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int lo = 0, hi = arr.length - 1, result = -1;
                    while (lo <= hi) {
                        int mid = (lo + hi) / 2;
                        if (arr[mid] == key) { result = mid; break; }
                        else if (arr[mid] < key) lo = mid + 1;
                        else hi = mid - 1;
                    }
                    System.out.println(key + (result != -1 ? " found at index " + result : " not found in the array."));
                    break;
                }

                case 25: {
                    System.out.println("--- Chocolate Distribution Problem ---");
                    int[] choc = readArray("chocolate packets");
                    System.out.print("Enter number of students: ");
                    int stu = sc.nextInt();
                    if (stu > choc.length) { System.out.println("Not enough packets!"); break; }
                    Arrays.sort(choc);
                    int minDiff = Integer.MAX_VALUE, startIdx = 0;
                    for (int i = 0; i + stu - 1 < choc.length; i++) {
                        int diff = choc[i + stu - 1] - choc[i];
                        if (diff < minDiff) { minDiff = diff; startIdx = i; }
                    }
                    System.out.print("Distributed packets: ");
                    for (int i = startIdx; i < startIdx + stu; i++) System.out.print(choc[i] + " ");
                    System.out.println("\nMinimum difference: " + minDiff);
                    break;
                }

                case 26: {
                    System.out.println("--- Find Peak Element ---");
                    int[] arr = readArray("array");
                    int lo = 0, hi = arr.length - 1;
                    while (lo < hi) {
                        int mid = (lo + hi) / 2;
                        if (arr[mid] < arr[mid + 1]) lo = mid + 1; else hi = mid;
                    }
                    System.out.println("Peak element: " + arr[lo] + " at index " + lo);
                    break;
                }

                case 27: {
                    System.out.println("--- Find Distinct Elements ---");
                    int[] arr = readArray("array");
                    Set<Integer> seen = new LinkedHashSet<>();
                    for (int v : arr) seen.add(v);
                    System.out.print("Distinct elements: ");
                    for (int v : seen) System.out.print(v + " ");
                    System.out.println();
                    break;
                }

                case 28: {
                    System.out.println("--- Top K Frequent Elements ---");
                    int[] arr = readArray("array");
                    System.out.print("Enter K: ");
                    int k = sc.nextInt();
                    Map<Integer, Integer> freq = new HashMap<>();
                    for (int v : arr) freq.put(v, freq.getOrDefault(v, 0) + 1);
                    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
                    list.sort((a, b) -> b.getValue() - a.getValue());
                    System.out.print("Top " + k + " frequent elements: ");
                    for (int i = 0; i < k && i < list.size(); i++) System.out.print(list.get(i).getKey() + "(freq=" + list.get(i).getValue() + ") ");
                    System.out.println();
                    break;
                }

                case 29: {
                    System.out.println("--- Previous Smaller Element ---");
                    int[] arr = readArray("array");
                    int[] res = new int[arr.length];
                    Stack<Integer> stk2 = new Stack<>();
                    for (int i = 0; i < arr.length; i++) {
                        while (!stk2.isEmpty() && stk2.peek() >= arr[i]) stk2.pop();
                        res[i] = stk2.isEmpty() ? -1 : stk2.peek();
                        stk2.push(arr[i]);
                    }
                    System.out.print("Input Array:           "); for (int v : arr) System.out.printf("%-4d", v); System.out.println();
                    System.out.print("Previous Smaller Elem: "); for (int v : res) System.out.printf("%-4d", v); System.out.println();
                    break;
                }

                case 30: {
                    System.out.println("--- Delete Mid of a Stack ---");
                    Stack<Integer> stk2 = new Stack<>();
                    int[] arr = readArray("stack elements (bottom to top)");
                    for (int v : arr) stk2.push(v);
                    System.out.print("Stack (bottom to top): "); for (int v : stk2) System.out.print(v + " "); System.out.println();
                    int sz = stk2.size();
                    int midP = (sz / 2) + 1;
                    Stack<Integer> tmp = new Stack<>();
                    for (int i = 0; i < sz - midP; i++) tmp.push(stk2.pop());
                    int midVal = stk2.pop();
                    while (!tmp.isEmpty()) stk2.push(tmp.pop());
                    System.out.println("Deleted mid element: " + midVal);
                    System.out.print("Stack after deletion: "); for (int v : stk2) System.out.print(v + " "); System.out.println();
                    break;
                }

                case 0:
                    System.out.println("==================================================");
                    System.out.println("  Mohit Raj Kashyap  |  24SCSE1180371");
                    System.out.println("  Thank you! Exiting program.");
                    System.out.println("==================================================");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 0-30.");
            }
        } while (choice != 0);
    }

    static void preorderTraversal(int[] tree, int i) {
        if (i >= tree.length || tree[i] == -1) return;
        System.out.print(tree[i] + " ");
        preorderTraversal(tree, 2 * i + 1);
        preorderTraversal(tree, 2 * i + 2);
    }

    static int buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int[] postIdx, int[] btree, int[] bleft, int[] bright, int[] cnt) {
        if (inStart > inEnd) return -1;
        int rootVal = postorder[postIdx[0]--];
        int node = cnt[0]++;
        btree[node] = rootVal;
        bleft[node] = -1;
        bright[node] = -1;
        int inIdx = inStart;
        for (int i = inStart; i <= inEnd; i++) if (inorder[i] == rootVal) { inIdx = i; break; }
        bright[node] = buildTree(inorder, postorder, inIdx + 1, inEnd, postIdx, btree, bleft, bright, cnt);
        bleft[node] = buildTree(inorder, postorder, inStart, inIdx - 1, postIdx, btree, bleft, bright, cnt);
        return node;
    }

    static int bstDelete(int[] bst, int[] bstLeft, int[] bstRight, int root, int key) {
        if (root == -1) return -1;
        if (key < bst[root]) bstLeft[root] = bstDelete(bst, bstLeft, bstRight, bstLeft[root], key);
        else if (key > bst[root]) bstRight[root] = bstDelete(bst, bstLeft, bstRight, bstRight[root], key);
        else {
            if (bstLeft[root] == -1) return bstRight[root];
            if (bstRight[root] == -1) return bstLeft[root];
            int minNode = bstRight[root];
            while (bstLeft[minNode] != -1) minNode = bstLeft[minNode];
            bst[root] = bst[minNode];
            bstRight[root] = bstDelete(bst, bstLeft, bstRight, bstRight[root], bst[minNode]);
        }
        return root;
    }
}
