import java.util.GregorianCalendar;

public class Fecha extends GregorianCalendar{

    public Fecha(){
        super();
    }

    public Fecha(int day, int month, int year){
        super(year, month,day);
    }

    public Fecha(int day, int month, int year, int hora, int min){
        super(year, month, day,hora,min);
    }

    public String toString() {
        return this.getTime().toString();
    }
}
