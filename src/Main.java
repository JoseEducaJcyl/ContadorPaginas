import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos un scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos un Map 'paginas'
        Map<String, Integer> paginas = new HashMap<>();
        //Declaramos 
        boolean continuar = true;
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
        System.out.println("Visitas de las paginas: ");
        paginas.forEach((llave, valor) -> {
            System.out.println(llave + ": " + valor);
        });
    }
}