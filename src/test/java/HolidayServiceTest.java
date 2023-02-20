import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/holiday.csv")
    public void shouldCalculate1(int expected, int income, int expenses, int threshold) {
        HolidayService service = new HolidayService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}