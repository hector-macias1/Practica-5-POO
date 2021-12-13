public class Red extends Pajaro {

    public Red(String nombre, String color) {
        super(nombre, color);
    }

    public Red() {
    }

    public void Gritar() {
        System.out.println("Estoy gritando");
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}