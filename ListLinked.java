
class ListLinked<E> implements IList<E>{
  ListNode<E> head = null;
  int size = 0;
  

  /* TEMPLATE
       Fields:
         this.head            -- ListNode<E>
         this.size            -- int

       Methods:
         this.add()               -- boolean
         this.remove()            -- boolean
         this.contains()          -- boolean
         this.display()           -- void
  */

  // E -> boolean
  // Returns true if a given items has been successfully added
  public boolean add(E item) {
      ListNode<E> newNode = new ListNode<E>(item, head);
      head = newNode;
      size++;
      return true;
    
  }
  
  // E -> boolean
  // Returns true if a given item has been removed successfully
  public boolean remove(E item) {
    if (this.size == 0){
      return false;
    }
    
    ListNode<E> previous = head;
    ListNode<E> current = head.next;
    
    if (previous.data.equals(item)) {
      
      previous = null;
      head = current;
      this.size--;
      return true;
      
    }
    
    while (current != null) {
      if (current.data.equals(item)) {
        
        current = current.next;
        previous.next = current;
        
        this.size--;
        return true;
      }
      
      previous = current;
      current = current.next;

    }
    return false;
  }
  
  // E -> boolean
  // Returns true if a given item is in the ListLinked
  public boolean contains(E item) {
    ListNode<E> current = head;
    while (current != null) {
      if (current.data.equals(item)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }
  
  // -> void
  // Displays the ListArray
  public void display() {
    ListNode<E> current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }
  
}

class ListNode<E> {
  E data;
  ListNode<E> next;
  
  ListNode(E data, ListNode<E> next) {
    this.data = data;
    this.next = next;
  }
}
