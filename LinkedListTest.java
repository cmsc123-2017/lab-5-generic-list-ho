import junit.framework.TestCase;


public class LinkedListTest extends TestCase {
  
  
  public void testLinkedList() {
    ListLinked link = new ListLinked();
    String a = new String("loL");
    Integer one = new Integer(12);
    String b = new String("Owow");
    
    assertEquals(true, link.add(a));
    assertEquals(true, link.add(b));
    assertEquals(true, link.add(one));
  }
  
  public void testLinkedListRemove() {
    ListLinked link = new ListLinked();
    String a = new String("loL");
    Integer one = new Integer(12);
    String b = new String("Owow");
    
    link.add(a);
    //link.add(b);
    link.add(one);
    
    assertEquals(true, link.remove(one));
    assertEquals(false, link.remove(b));
  }
  
  public void testLinkedListContains() {
    ListLinked link = new ListLinked();
    String a = new String("loL");
    Integer one = new Integer(12);
    String b = new String("Owow");
    
    link.add(a);
    //link.add(b);
    link.add(one);
    
    assertEquals(true, link.contains(a));
    assertEquals(true, link.contains(one));
    assertEquals(false, link.contains(b));
    
  }
  
}
