import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos un scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos un Map 'paginas'
        Map<String, Integer> paginas = new HashMap<>();
        //Declaramos un boolean continuar para controlar el bucle
        boolean continuar = true;
        //En un bucle while y le pedimos al usuario introducir paginas web 
        //hasta que el escriba "fin"
        while (continuar) {
            System.out.println("Introduce una pagina: ");
            String pagina = sc.nextLine().toLowerCase();
            if (paginas.containsKey(pagina)) {
                paginas.put(pagina, paginas.get(pagina) + 1);
            }else if (pagina.equalsIgnoreCase("fin")) {
                continuar = false;
            }else {
                paginas.put(pagina, 1);
            }
        }
        //Se recorre la coleccion y se muestra por pantalla
        System.out.println("Visitas de las paginas: ");
        paginas.forEach((llave, valor) -> {
            System.out.println(llave + ": " + valor);
        });
    }
}
