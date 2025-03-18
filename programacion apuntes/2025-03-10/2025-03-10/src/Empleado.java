import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Empleado implements Serializable {
        private String nombre;
        private double dAltura;
        private LocalDate fecha;

        public Empleado(String nombre, double dAltura, int iAnno, int iMes, int iDia) {
            this.nombre = nombre;
            this.dAltura = dAltura;
            try {
                fecha = LocalDate.of(iAnno, iMes, iDia);
            } catch (DateTimeException e) {}
        }
}
