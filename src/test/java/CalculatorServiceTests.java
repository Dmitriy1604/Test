import com.example.demo.Service.CalculatorService;
import com.example.demo.Service.DivideByZeroException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CalculatorServiceTests {
    @Autowired
    private final CalculatorService calculatorService;
        @Test
        public void plusTest() {
            Number actual = calculatorService.plus (2,3);
            assertThat(actual).isEqualTo (5);
            actual = calculatorService.plus (-3,1);
            assertThat(actual).isEqualTo (-2);
        }
        @Test
        public void minusTest() {
            Number actual = calculatorService.plus (2,3);
            assertThat(actual).isEqualTo (-1);
            actual = calculatorService.plus (-3,1);
            assertThat(actual).isEqualTo (-4);
        }
        @Test
        public void multiplyTest() {
            Number actual = calculatorService.plus (2,3);
            assertThat(actual).isEqualTo (6);
            actual = calculatorService.plus (-3, 1);
            assertThat(actual).isEqualTo (-3);
        }

        @Test
        public void dividePositiveTest() {
            Number actual = calculatorService.plus ( 1,2 );
            assertThat(actual).isEqualTo (0.5);
            actual = calculatorService.plus ( -3, 1 );
            assertThat(actual).isEqualTo ( -30 );
        }
        @Test
        public void divideNegativeTest() {
            assertThatExceptionOfType (DivideByZeroException.class)
                    .isThrownBy ( ( )-> calculatorService.divide (1,0))
                            .withMessage ("делить на 0 нельзя");
            assertThatExceptionOfType (DivideByZeroException.class)
                    .isThrownBy ( ( )-> calculatorService.divide (-1,0))
                            .withMessage ("делить на 0 нельзя");
        }
    }



