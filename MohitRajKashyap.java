import java.util.*;

public class MohitRajKashyap {

    static int[] arrayElements = {10, 20, 30, 40, 50};
    static int arraySize = 5;

    static int[] stackArr = new int[100];
    static int stackTop = -1;

    static int[] queueArr = new int[100];
    static int queueFront = -1, queueRear = -1;

    static int[] circularQueue = new int[5];
    static int cqFront = -1, cqRear = -1, cqSize = 5;

    static int[] linkedListData = new int[100];
    static int[] linkedListNext = new int[100];
    static int head = -1, nodeCount = 0;

    static int[] dlData = new int[100];
    static int[] dlNext = new int[100];
    static int[] dlPrev = new int[100];
    static int dlHead = -1, dlCount = 0;

    static int[] sllData = new int[100];
    static int[] sllNext = new int[100];
    static int sllCount = 0;

    static int[] inorderArr, postorderArr;
    static int postIndex;

    static int[][] adjMatrix = new int[6][6];
    static boolean[] visited = new boolean[6];

    static int[] stackMid = new int[100];
    static int stackMidTop = -1;

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("  Mohit Raj Kashyap  24SCSE1180371");
        System.out.println("==================================================");

        System.out.println("\n--- 1. Traverse Array and Display Elements ---");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- 2. Insert Element at Given Position ---");
        int[] insertArr = {10, 20, 30, 40, 50};
        int insertPos = 2;
        int insertVal = 99;
        int insertLen = 5;
        int[] tempArr = new int[insertLen + 1];
        for (int i = 0; i < insertPos; i++) {
            tempArr[i] = insertArr[i];
        }
        tempArr[insertPos] = insertVal;
        for (int i = insertPos; i < insertLen; i++) {
            tempArr[i + 1] = insertArr[i];
        }
        System.out.print("Array after inserting " + insertVal + " at position " + insertPos + ": ");
        for (int i = 0; i <= insertLen; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- 3. Remove Element from Array ---");
        int[] removeArr = {10, 20, 30, 40, 50};
        int removePos = 2;
        int removeLen = 5;
        System.out.println("Removing element at position " + removePos + " (value: " + removeArr[removePos] + ")");
        for (int i = removePos; i < removeLen - 1; i++) {
            removeArr[i] = removeArr[i + 1];
        }
        removeLen--;
        System.out.print("Array after removal: ");
        for (int i = 0; i < removeLen; i++) {
            System.out.print(removeArr[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- 4. Multiply Two Polynomials Using Arrays ---");
        int[] poly1 = {1, 2, 3};
        int[] poly2 = {1, 1};
        int deg1 = poly1.length - 1;
        int deg2 = poly2.length - 1;
        int[] polyResult = new int[deg1 + deg2 + 1];
        for (int i = 0; i <= deg1; i++) {
            for (int j = 0; j <= deg2; j++) {
                polyResult[i + j] += poly1[i] * poly2[j];
            }
        }
        System.out.print("Poly1: ");
        for (int i = deg1; i >= 0; i--) {
            System.out.print(poly1[deg1 - i] + "x^" + i + (i > 0 ? " + " : ""));
        }
        System.out.print("\nPoly2: ");
        for (int i = deg2; i >= 0; i--) {
            System.out.print(poly2[deg2 - i] + "x^" + i + (i > 0 ? " + " : ""));
        }
        System.out.print("\nResult: ");
        int resLen = polyResult.length;
        for (int i = resLen - 1; i >= 0; i--) {
            System.out.print(polyResult[resLen - 1 - i] + "x^" + i + (i > 0 ? " + " : ""));
        }
        System.out.println();

        System.out.println("\n--- 5. Transpose of a Matrix ---");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = 3, cols = 3;
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- 6. Stack Using Array (Push and Pop) ---");
        int[] stack = new int[10];
        int top = -1;
        int[] pushVals = {5, 10, 15, 20};
        for (int v : pushVals) {
            if (top < 9) {
                stack[++top] = v;
                System.out.println("Pushed: " + v);
            }
        }
        System.out.println("Popped: " + stack[top--]);
        System.out.print("Stack state: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- 7. Stack Using Linked List ---");
        int[] llStack = new int[100];
        int[] llNext = new int[100];
        int llTop = -1;
        int llCount = 0;

        int[] pushLL = {1, 2, 3, 4};
        for (int v : pushLL) {
            int node = llCount++;
            llStack[node] = v;
            llNext[node] = llTop;
            llTop = node;
            System.out.println("Pushed to LL stack: " + v);
        }
        if (llTop != -1) {
            System.out.println("Popped from LL stack: " + llStack[llTop]);
            llTop = llNext[llTop];
        }
        System.out.print("LL Stack (top to bottom): ");
        int cur = llTop;
        while (cur != -1) {
            System.out.print(llStack[cur] + " ");
            cur = llNext[cur];
        }
        System.out.println();

        System.out.println("\n--- 8. Infix to Postfix Conversion ---");
        String infix = "A+B*C-D";
        StringBuilder postfix = new StringBuilder();
        Stack<Character> opStack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                opStack.push(ch);
            } else if (ch == ')') {
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    postfix.append(opStack.pop());
                }
                if (!opStack.isEmpty()) {
                    opStack.pop();
                }
            } else {
                int prec1;
                if (ch == '+' || ch == '-') prec1 = 1;
                else if (ch == '*' || ch == '/') prec1 = 2;
                else prec1 = 0;
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    char top2 = opStack.peek();
                    int prec2;
                    if (top2 == '+' || top2 == '-') prec2 = 1;
                    else if (top2 == '*' || top2 == '/') prec2 = 2;
                    else prec2 = 0;
                    if (prec2 >= prec1) {
                        postfix.append(opStack.pop());
                    } else {
                        break;
                    }
                }
                opStack.push(ch);
            }
        }
        while (!opStack.isEmpty()) {
            postfix.append(opStack.pop());
        }
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix.toString());

        System.out.println("\n--- 9. Queue Using Array ---");
        int[] queue = new int[10];
        int qFront = 0, qRear = -1, qCount = 0;
        int[] enqVals = {100, 200, 300, 400};
        for (int v : enqVals) {
            if (qCount < 10) {
                queue[++qRear] = v;
                qCount++;
                System.out.println("Enqueued: " + v);
            }
        }
        if (qCount > 0) {
            System.out.println("Dequeued: " + queue[qFront++]);
            qCount--;
        }
        System.out.print("Queue state: ");
        for (int i = qFront; i <= qRear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();

        System.out.println("\n--- 10. Circular Queue ---");
        int[] cq = new int[5];
        int cqF = -1, cqR = -1, cqSz = 5, cqCnt = 0;
        int[] cqEnq = {10, 20, 30, 40, 50};
        for (int v : cqEnq) {
            if (cqCnt < cqSz) {
                cqR = (cqR + 1) % cqSz;
                cq[cqR] = v;
                if (cqF == -1) cqF = 0;
                cqCnt++;
                System.out.println("Circular Enqueued: " + v);
            }
        }
        System.out.println("Circular Dequeued: " + cq[cqF]);
        cqF = (cqF + 1) % cqSz;
        cqCnt--;
        System.out.print("Circular Queue state: ");
        int idx = cqF;
        for (int i = 0; i < cqCnt; i++) {
            System.out.print(cq[idx] + " ");
            idx = (idx + 1) % cqSz;
        }
        System.out.println();

        System.out.println("\n--- 11. Insert Node at Beginning of Linked List ---");
        int[] slData = new int[100];
        int[] slNext2 = new int[100];
        int slHead = -1, slCnt = 0;
        int[] insertNodes = {30, 20, 10};
        for (int v : insertNodes) {
            int n = slCnt++;
            slData[n] = v;
            slNext2[n] = slHead;
            slHead = n;
            System.out.println("Inserted at beginning: " + v);
        }
        System.out.print("Linked List: ");
        int c = slHead;
        while (c != -1) {
            System.out.print(slData[c] + " -> ");
            c = slNext2[c];
        }
        System.out.println("NULL");

        System.out.println("\n--- 12. Delete Node from Given Position ---");
        int delPos = 1;
        if (delPos == 0) {
            slHead = slNext2[slHead];
        } else {
            int prev = slHead;
            for (int i = 0; i < delPos - 1 && slNext2[prev] != -1; i++) {
                prev = slNext2[prev];
            }
            if (slNext2[prev] != -1) {
                System.out.println("Deleted node at position " + delPos + ": " + slData[slNext2[prev]]);
                slNext2[prev] = slNext2[slNext2[prev]];
            }
        }
        System.out.print("List after deletion: ");
        c = slHead;
        while (c != -1) {
            System.out.print(slData[c] + " -> ");
            c = slNext2[c];
        }
        System.out.println("NULL");

        System.out.println("\n--- 13. Doubly Linked List with Insertion ---");
        int[] dData = new int[100];
        int[] dNext = new int[100];
        int[] dPrev2 = new int[100];
        int dHead = -1, dCnt = 0;
        int[] dlInsert = {10, 20, 30};
        for (int v : dlInsert) {
            int n = dCnt++;
            dData[n] = v;
            dNext[n] = dHead;
            dPrev2[n] = -1;
            if (dHead != -1) dPrev2[dHead] = n;
            dHead = n;
            System.out.println("DLL Inserted: " + v);
        }
        System.out.print("DLL forward: ");
        int dc = dHead;
        int dlLast = -1;
        while (dc != -1) {
            System.out.print(dData[dc] + " <-> ");
            dlLast = dc;
            dc = dNext[dc];
        }
        System.out.println("NULL");
        System.out.print("DLL backward: ");
        dc = dlLast;
        while (dc != -1) {
            System.out.print(dData[dc] + " <-> ");
            dc = dPrev2[dc];
        }
        System.out.println("NULL");

        System.out.println("\n--- 14. Merge Two Sorted Linked Lists ---");
        int[] m1Data = {1, 3, 5};
        int[] m2Data = {2, 4, 6};
        List<Integer> merged = new ArrayList<>();
        int mi = 0, mj = 0;
        while (mi < m1Data.length && mj < m2Data.length) {
            if (m1Data[mi] <= m2Data[mj]) {
                merged.add(m1Data[mi++]);
            } else {
                merged.add(m2Data[mj++]);
            }
        }
        while (mi < m1Data.length) merged.add(m1Data[mi++]);
        while (mj < m2Data.length) merged.add(m2Data[mj++]);
        System.out.print("Merged sorted list: ");
        for (int v : merged) System.out.print(v + " -> ");
        System.out.println("NULL");

        System.out.println("\n--- 15. Add Two Polynomials Using Linked List ---");
        int[] pExp1 = {3, 2, 1, 0};
        int[] pCoef1 = {3, 2, 1, 5};
        int[] pExp2 = {3, 1, 0};
        int[] pCoef2 = {1, 4, 2};
        int maxDeg = 3;
        int[] polySum = new int[maxDeg + 1];
        for (int i = 0; i < pExp1.length; i++) polySum[pExp1[i]] += pCoef1[i];
        for (int i = 0; i < pExp2.length; i++) polySum[pExp2[i]] += pCoef2[i];
        System.out.print("Polynomial Sum: ");
        for (int i = maxDeg; i >= 0; i--) {
            if (polySum[i] != 0) {
                System.out.print(polySum[i] + "x^" + i + (i > 0 ? " + " : ""));
            }
        }
        System.out.println();

        System.out.println("\n--- 16. Construct Binary Tree from Inorder and Postorder ---");
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};
        int[] btree = new int[100];
        int[] bleft = new int[100];
        int[] bright = new int[100];
        int btCount = 0;
        Arrays.fill(bleft, -1);
        Arrays.fill(bright, -1);
        int[] postIdx = {postorder.length - 1};
        int btRoot = buildTree(inorder, postorder, 0, inorder.length - 1, postIdx, btree, bleft, bright, new int[]{0});
        System.out.print("Inorder: ");
        for (int v : inorder) System.out.print(v + " ");
        System.out.print("\nPostorder: ");
        for (int v : postorder) System.out.print(v + " ");
        System.out.println("\nBinary tree constructed successfully. Root: " + btree[btRoot]);

        System.out.println("\n--- 17. Preorder Traversal of Binary Tree ---");
        int[] preTree = new int[]{1, 2, 3, 4, 5, -1, -1};
        System.out.print("Preorder (array-based complete BT): ");
        preorderTraversal(preTree, 0);
        System.out.println();

        System.out.println("\n--- 18. Insert Nodes in Binary Search Tree ---");
        int[] bst = new int[100];
        int[] bstLeft = new int[100];
        int[] bstRight = new int[100];
        Arrays.fill(bstLeft, -1);
        Arrays.fill(bstRight, -1);
        int bstCount = 0;
        int bstRoot = -1;
        int[] bstInsert = {50, 30, 70, 20, 40, 60, 80};
        for (int v : bstInsert) {
            int node = bstCount++;
            bst[node] = v;
            if (bstRoot == -1) {
                bstRoot = node;
            } else {
                int cur2 = bstRoot;
                while (true) {
                    if (v < bst[cur2]) {
                        if (bstLeft[cur2] == -1) { bstLeft[cur2] = node; break; }
                        else cur2 = bstLeft[cur2];
                    } else {
                        if (bstRight[cur2] == -1) { bstRight[cur2] = node; break; }
                        else cur2 = bstRight[cur2];
                    }
                }
            }
        }
        System.out.print("BST Inorder: ");
        Stack<Integer> bstStack = new Stack<>();
        int bstCur = bstRoot;
        while (bstCur != -1 || !bstStack.isEmpty()) {
            while (bstCur != -1) { bstStack.push(bstCur); bstCur = bstLeft[bstCur]; }
            bstCur = bstStack.pop();
            System.out.print(bst[bstCur] + " ");
            bstCur = bstRight[bstCur];
        }
        System.out.println();

        System.out.println("\n--- 19. Delete Node from Binary Search Tree ---");
        int delVal = 30;
        bstRoot = bstDelete(bst, bstLeft, bstRight, bstRoot, delVal);
        System.out.print("BST Inorder after deleting " + delVal + ": ");
        Stack<Integer> bstStack2 = new Stack<>();
        int bstCur2 = bstRoot;
        while (bstCur2 != -1 || !bstStack2.isEmpty()) {
            while (bstCur2 != -1) { bstStack2.push(bstCur2); bstCur2 = bstLeft[bstCur2]; }
            bstCur2 = bstStack2.pop();
            System.out.print(bst[bstCur2] + " ");
            bstCur2 = bstRight[bstCur2];
        }
        System.out.println();

        System.out.println("\n--- 20. Graph Using Adjacency Matrix ---");
        int n = 5;
        int[][] adj = new int[n][n];
        int[][] edges = {{0,1},{0,2},{1,3},{2,4},{3,4}};
        for (int[] e : edges) { adj[e[0]][e[1]] = 1; adj[e[1]][e[0]] = 1; }
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(adj[i][j] + " ");
            System.out.println();
        }

        System.out.println("\n--- 21. BFS Traversal ---");
        boolean[] bfsVisited = new boolean[n];
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(0);
        bfsVisited[0] = true;
        System.out.print("BFS from vertex 0: ");
        while (!bfsQueue.isEmpty()) {
            int v2 = bfsQueue.poll();
            System.out.print(v2 + " ");
            for (int i = 0; i < n; i++) {
                if (adj[v2][i] == 1 && !bfsVisited[i]) {
                    bfsVisited[i] = true;
                    bfsQueue.add(i);
                }
            }
        }
        System.out.println();

        System.out.println("\n--- 22. DFS Traversal ---");
        boolean[] dfsVisited = new boolean[n];
        Stack<Integer> dfsStack = new Stack<>();
        dfsStack.push(0);
        System.out.print("DFS from vertex 0: ");
        while (!dfsStack.isEmpty()) {
            int v3 = dfsStack.pop();
            if (!dfsVisited[v3]) {
                dfsVisited[v3] = true;
                System.out.print(v3 + " ");
                for (int i = n - 1; i >= 0; i--) {
                    if (adj[v3][i] == 1 && !dfsVisited[i]) dfsStack.push(i);
                }
            }
        }
        System.out.println();

        System.out.println("\n--- 23. Linear Search ---");
        int[] lsArr = {10, 25, 36, 47, 58};
        int lsKey = 36;
        int lsResult = -1;
        for (int i = 0; i < lsArr.length; i++) {
            if (lsArr[i] == lsKey) { lsResult = i; break; }
        }
        System.out.println("Linear Search: element " + lsKey + (lsResult != -1 ? " found at index " + lsResult : " not found"));

        System.out.println("\n--- 24. Binary Search ---");
        int[] bsArr = {10, 20, 30, 40, 50, 60};
        int bsKey = 40;
        int bsLow = 0, bsHigh = bsArr.length - 1, bsResult = -1;
        while (bsLow <= bsHigh) {
            int mid = (bsLow + bsHigh) / 2;
            if (bsArr[mid] == bsKey) { bsResult = mid; break; }
            else if (bsArr[mid] < bsKey) bsLow = mid + 1;
            else bsHigh = mid - 1;
        }
        System.out.println("Binary Search: element " + bsKey + (bsResult != -1 ? " found at index " + bsResult : " not found"));

        System.out.println("\n--- 25. Chocolate Distribution Problem ---");
        int[] chocolates = {7, 3, 12, 6, 2, 9, 4};
        int students = 3;
        Arrays.sort(chocolates);
        int minDiff = Integer.MAX_VALUE;
        int startIdx = 0;
        for (int i = 0; i + students - 1 < chocolates.length; i++) {
            int diff = chocolates[i + students - 1] - chocolates[i];
            if (diff < minDiff) { minDiff = diff; startIdx = i; }
        }
        System.out.print("Chocolates distributed to " + students + " students: ");
        for (int i = startIdx; i < startIdx + students; i++) System.out.print(chocolates[i] + " ");
        System.out.println("\nMinimum difference: " + minDiff);

        System.out.println("\n--- 26. Find Peak Element ---");
        int[] peakArr = {1, 3, 20, 4, 1, 0};
        int peakLow = 0, peakHigh = peakArr.length - 1;
        while (peakLow < peakHigh) {
            int mid = (peakLow + peakHigh) / 2;
            if (peakArr[mid] < peakArr[mid + 1]) peakLow = mid + 1;
            else peakHigh = mid;
        }
        System.out.println("Peak element: " + peakArr[peakLow] + " at index " + peakLow);

        System.out.println("\n--- 27. Find Distinct Elements ---");
        int[] distinctArr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> distinctSet = new LinkedHashSet<>();
        for (int v : distinctArr) distinctSet.add(v);
        System.out.print("Distinct elements: ");
        for (int v : distinctSet) System.out.print(v + " ");
        System.out.println();

        System.out.println("\n--- 28. Top K Frequent Elements ---");
        int[] freqArr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int v : freqArr) freqMap.put(v, freqMap.getOrDefault(v, 0) + 1);
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort((a, b) -> b.getValue() - a.getValue());
        System.out.print("Top " + k + " frequent elements: ");
        for (int i = 0; i < k && i < freqList.size(); i++) System.out.print(freqList.get(i).getKey() + " ");
        System.out.println();

        System.out.println("\n--- 29. Previous Smaller Element ---");
        int[] pse = {4, 5, 2, 10, 8};
        int[] pseResult = new int[pse.length];
        Stack<Integer> pseStack = new Stack<>();
        for (int i = 0; i < pse.length; i++) {
            while (!pseStack.isEmpty() && pseStack.peek() >= pse[i]) pseStack.pop();
            pseResult[i] = pseStack.isEmpty() ? -1 : pseStack.peek();
            pseStack.push(pse[i]);
        }
        System.out.print("Array:                ");
        for (int v : pse) System.out.print(v + " ");
        System.out.print("\nPrevious Smaller Elm: ");
        for (int v : pseResult) System.out.print(v + " ");
        System.out.println();

        System.out.println("\n--- 30. Delete Mid of a Stack ---");
        Stack<Integer> midStack = new Stack<>();
        int[] midPush = {1, 2, 3, 4, 5};
        for (int v : midPush) midStack.push(v);
        System.out.print("Stack before: ");
        for (int v : midStack) System.out.print(v + " ");
        System.out.println();
        int size = midStack.size();
        int midPos = (size / 2) + 1;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < size - midPos; i++) tempStack.push(midStack.pop());
        midStack.pop();
        while (!tempStack.isEmpty()) midStack.push(tempStack.pop());
        System.out.print("Stack after deleting mid: ");
        for (int v : midStack) System.out.print(v + " ");
        System.out.println();

        System.out.println("\n==================================================");
        System.out.println("  Program by: Mohit Raj Kashyap  24SCSE1180371");
        System.out.println("==================================================");
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
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) { inIdx = i; break; }
        }
        bright[node] = buildTree(inorder, postorder, inIdx + 1, inEnd, postIdx, btree, bleft, bright, cnt);
        bleft[node] = buildTree(inorder, postorder, inStart, inIdx - 1, postIdx, btree, bleft, bright, cnt);
        return node;
    }

    static int bstDelete(int[] bst, int[] bstLeft, int[] bstRight, int root, int key) {
        if (root == -1) return -1;
        if (key < bst[root]) {
            bstLeft[root] = bstDelete(bst, bstLeft, bstRight, bstLeft[root], key);
        } else if (key > bst[root]) {
            bstRight[root] = bstDelete(bst, bstLeft, bstRight, bstRight[root], key);
        } else {
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
