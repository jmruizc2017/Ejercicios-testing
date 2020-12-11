import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class FindLastTest
{
   @Test public void nonLastElementFound() 
   {
      int arr[] = {3, 4, 2};
      assertEquals("The program does not enter in last position", 2, FindLast.findLast(arr, 2));
   }
}


