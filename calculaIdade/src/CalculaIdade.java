import java.time.LocalDate;
import java.time.Period;

public class CalculaIdade{
    private static final int year = 0;

    public static void main(String[] args) {
        int actualAge = Period.between(LocalDate.of(dayOfmain: 28, month: 05, year: 1993;), LocalDate.now()).getYears();
        System.out.println(actualAge);
    }
    
}
