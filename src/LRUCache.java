import java.util.*;
class LRUCache {

    Map<Integer, Node> lruCache = new HashMap<Integer, Node>();
    int size = 0;
    int cap = 0;
    Node head, tail ;
    
    public LRUCache(int capacity) {
        cap = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    private void removeNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    private void addNode(Node node){
        Node temp = head.next;
        
        head.next = node;
        temp.prev = node;
        
        node.prev = head;
        node.next = temp;
        
    }
    
    public int get(int key) {
        Node node = lruCache.get(key);
        
        if(node != null){
            removeNode(node);
            addNode(node);
            return node.val;
        }else{
            return -1;
        }
        
        
    }

    
    public void put(int key, int value) {
        if(lruCache.containsKey(key)){
            Node node = lruCache.get(key);
            node.val = value;
            removeNode(node);
            addNode(node);
            
            return;
        }
        
        Node node = new Node();
        node.val = value;
        node.key = key;
        addNode(node);
        lruCache.put(key, node);
        size++;
   
        if(size > cap){
            Node lastNode = tail.prev;

           
                lruCache.remove(lastNode.key);
            
                removeNode(lastNode);
                size--;
               
        }
    }
}


public class Node{
    public Integer key;
    public int val;
    public Node next;
    public Node prev;
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
