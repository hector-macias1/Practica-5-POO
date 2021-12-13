import java.util.Scanner;

public class Angry_Birds {

    public static void main(String[] args) {
        int opcion = 1;

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        Red red = new Red();
        Blues blues = new Blues();
        Chuck chuck = new Chuck();

        Pajaro[] ListaPajaros = new Pajaro[3];

        ListaPajaros[0] = new Red("Red", "Rojo");
        ListaPajaros[1] = new Blues("Blues", "Azul");
        ListaPajaros[2] = new Chuck("Chuck", "Amarillo");

        while(opcion != 4) {
            menu.ImprimirMenu();
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    ListaPajaros[0].Volar(); 
                    red.Gritar();
                    break;
                case 2:
                    ListaPajaros[1].Volar();
                    blues.Division();
                    break;
                case 3:
                    ListaPajaros[2].Volar();
                    chuck.Acelerar();
                    break;
                case 4:
                    break;
            }

        }

    }
    
}