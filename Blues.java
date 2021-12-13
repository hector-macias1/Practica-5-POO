public class Blues extends Pajaro {

    public Blues(String nombre, String color) {
        super(nombre, color);
    }

    public Blues() {
    }

    public void Division() {
        System.out.println("Estamos dividiendonos");
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}