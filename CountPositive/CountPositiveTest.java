import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   @Test public void nonPositiveElementZero() 
   {
      int arr[] = {0, 4, 1};
      assertEquals("Element 0 is not positive", 2, CountPositive.countPositive(arr));
   }
   
   @Test public void nonPositiveElements() 
   {
      int arr[] = {-1, -2, -3};
      assertEquals("There are not positive elements", 0, CountPositive.countPositive(arr));
   }
}


