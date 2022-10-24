import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl  {
    public int plus(Integer a, Integer b) {
        return a + b;
    }
    public int minus(Integer a, Integer b) { return a - b;
    }
    public int multiple(Integer a, Integer b) {
        return a * b;
    }
    public double divide(Integer a, Integer b) {
        if(b==0) {
            throw new DivideByZeroException ("делить на 0 нельзя");
        }
        return a.doubleValue () / b;
    }
}
