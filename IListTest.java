import junit.framework.TestCase;


public class IListTest extends TestCase {
  
 
  public void testListArrayAdd() {
    ListArray l = new ListArray();
    String day = new String("Day");
    Integer one = new Integer(1);
    
    assertEquals(true, l.add(day));
    assertEquals(true, l.add(one));
  }
  
  public void testListArrayRemove() {
    ListArray l = new ListArray();
    String day = new String("Day");
    Integer one = new Integer(1);
    String none = new String("none");
    
    l.add(day);
    l.add(one);
    
    assertEquals(true, l.remove(1));
    assertEquals(true, l.remove("Day"));
    assertEquals(false, l.remove(none));
  }
  
  public void testListArrayContains() {
    ListArray l = new ListArray();
    String day = new String("Day");
    Integer one = new Integer(1);
    String none = new String("none");
    
    l.add(day);
    l.add(one);
    
    assertEquals(true, l.remove(1));
    assertEquals(true, l.remove("Day"));
    assertEquals(false, l.remove(none));
  }
  
}
