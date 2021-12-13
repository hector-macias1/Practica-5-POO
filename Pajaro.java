public class Pajaro {
    String nombre;
    String color;

    public Pajaro(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public Pajaro() {
    }

    public void Volar(){
        System.out.println("Estoy volando");
    }

    public void Destruir() {
        System.out.println("Tumbe a los puercos");
    }

}
