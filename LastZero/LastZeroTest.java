import org.junit.Test;
import static org.junit.Assert.*;

public class LastZeroTest
{
   @Test public void nonLastElementZero() 
   {
      int arr[] = {0, 4, 0};
      assertEquals("The element 0 found is not the correct one", 2, LastZero.lastZero(arr));
   }
}

