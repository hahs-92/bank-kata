import java.util.ArrayList;
import java.util.List;

public class ListMovimientsFinancial {
    List<MovimientFinancial> movimientsFinancial;

    public ListMovimientsFinancial() {
        this.movimientsFinancial = new ArrayList<>();
    }

    public void addMovimientFinancial(MovimientFinancial financial) {
        this.movimientsFinancial.add(financial);
    }

    public List<MovimientFinancial> showMovimientsFinancial() {
        return this.movimientsFinancial;
    }
}
