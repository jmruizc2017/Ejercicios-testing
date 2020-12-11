import org.junit.Test;
import static org.junit.Assert.*;

public class OddOrPosTest
{
   @Test public void NegAndOddnonCount() 
   {
      int arr[] = {-3, -4, -2};
      assertEquals("Negative and odd elements does not count", 1, OddOrPos.oddOrPos(arr));
   }
   
   @Test public void PositiveElements() 
   {
      int arr[] = {3, 4, 2};
      assertEquals("All elements are positive", 3, OddOrPos.oddOrPos(arr));
   }
}
