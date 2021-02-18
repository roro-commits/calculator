
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Test.*;

public class calculatorTest {
  @Test
    void sum (){
        calculator  calc = new calculator();
        int result = calc.add(30,30);
        assertEquals(60,result,0);
    }

    @Test
    void sub (){
        calculator  calc = new calculator();
        int result = calc.subtract(30,30);
        assertEquals(0,result,0);
    }

    @Test
    void div (){
        calculator  calc = new calculator();
        int result = calc.divide(60,30);
        assertEquals(2,result,0);
    }

    @Test
    void mul (){
        calculator  calc = new calculator();
        int result = calc.multiply(30,2);
        assertEquals(60,result,0);
    }

}
