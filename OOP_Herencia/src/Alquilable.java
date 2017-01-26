

public interface Alquilable {//Los atributos de una interfaz siempre seran static y final
public static final double MAX_PRECIO=100;
public static final double MIN_PRECIO=10;
public abstract double getPrecioHora();
public abstract void setPrecioHora(double precio);

}
