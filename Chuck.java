public class Chuck extends Pajaro {

    public Chuck(String nombre, String color) {
        super(nombre, color);
    }

    public Chuck() {
    }

    public void Acelerar() {
        System.out.println("Estoy acelerando");
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    
}