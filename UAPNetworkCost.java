import java.util.Scanner;

public class UAPNetworkCost {
    class Node {
        int data;
        Node next;
    
        Node(int data) 
        {
            this.data = data;
        }
    }
    
    class SLL {
    
        Node head, tail;
        int size = 0;
    
        public boolean isEmpty() {
            return size == 0;
        }
    
        public void addLast(Node input) {
            if (isEmpty()) {
                head = tail = input;
            } else {
                tail.next = input;
                tail = input;
            }
            size++;
        }
    
        public Node isData(int data) {
            Node pointer = head;
            while (pointer != null) {
                if (pointer.data == data) {
                    return pointer;
                }
                pointer = pointer.next;
            }
            return null;
        }
    
        public boolean isExist(int data) {
            Node pointer = head;
            while (pointer != null) {
                if (pointer.data == data) {
                    return true;
                }
                pointer = pointer.next;
            }
            return false;
        }
    }
    
    class GraphASD {
    
        SLL[] arrNode;
    
        GraphASD(int maxNode) {
            arrNode = new SLL[maxNode];
            for (int i = 0; i < arrNode.length; i++) {
                arrNode[i] = new SLL();
            }
        }
    
        void addData(int DataAwal, int DataAkhir) {
            Node first = new Node(DataAwal);
            Node last = new Node(DataAkhir);
            arrNode[first.data].addLast(last);
            arrNode[last.data].addLast(first);
        }
    
        void printGraph() {
            for (int i = 0; i < arrNode.length; i++) {
                System.out.print(i + " : ");
                Node pointer = arrNode[i].head;
                while (pointer != null) {
                    System.out.print(pointer.data + " ");
                    pointer = pointer.next;
                }
                System.out.println();
            }
        }
        void dijkstra(int start, int end) {
            try {
                int x = 0;
                if (arrNode[start].isExist(end)) {
                    x = 1;
                } else {
                    Node sign = arrNode[start].head;
                    do {
                        if (arrNode[sign.data].isExist(end)) {
                            sign = arrNode[sign.data].head;
                            x++;
                        } else {
                            sign = sign.next;
                            if (sign.data == end) {
                                x++;
                            }
                        }
                    } while (sign.data != end);
                } System.out.println(x);
            } catch (Exception e) {
                int y = -1;
                System.out.print(y);
            }
        }
    }
    
    public class UAP_networkcost {
        public static Scanner masuk = new Scanner(System.in);
        public static void main(String[] args) {
            
            GraphASD graphASD = new GraphASD(masuk.nextInt());
            int p = masuk.nextInt();
            masuk.nextLine();
            for (int i = 0; i < p; i++) {
                String[] in = masuk.nextLine().split(" ");
                int tmp1 = Integer.parseInt(in[0]);
                int tmp2 = Integer.parseInt(in[2]);
                graphASD.addData(tmp1, tmp2);
            }
            graphASD.dijkstra(masuk.nextInt(), masuk.nextInt());
        }
    }
}
