class ListArray<E> implements IList<E>{
  int max = 10;
  private Object[] items;
  
  int size = 0;
 
  
  public ListArray() {
    items = new Object[max];
  }
  
  /* TEMPLATE
       Fields:
         this.items[]             -- Object
         this.max                 -- int
         this.size                -- int

       Methods:
         this.add()               -- boolean
         this.remove()            -- boolean
         this.contains()          -- boolean
         this.display()           -- void
  */

  // E -> boolean
  // Returns true if a given items has been successfully added
  public boolean add(E item) {
    
    Object[] newItems;
    
    if (size == max) {
      max += 10;
      newItems = new Object[max];
      for (int i = 0; i < this.size; i++) {
        newItems[i] = items[i];
      }
      items = newItems;
      
      return false; // don't return instead
    }
      this.items[size] = item;
      this.size++;
      return true;
    }
  
  // -> void
  // Displays the ListArray
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
  
  // E -> boolean
  // Returns true if a given item has been removed successfully
  public boolean remove(E item) {
    for (int i = 0; i < this.size; i++){
      if (this.items[i].equals(item)) {
        this.items[i] = this.items[i + 1];
        this.size -= 1;
        return true;
      }
    }
    return false;
  }
  
  // E -> boolean
  // Returns true if a given item is in the ListArray
  public boolean contains(E item) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(item)) {
        return true;
      }
    }
    return false;
  }
}

