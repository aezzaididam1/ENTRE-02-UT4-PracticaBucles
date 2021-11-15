import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class TestPracticaBucles
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);
        PracticaBucles pracBuc = new PracticaBucles();
        System.out.println("Escribe la cantidad maxima de numeros aleatorios a generar");
        int opcion = teclado.nextInt();
        while(opcion<=0){
            System.out.println("No es una opcion valida");
            System.out.println("Escribe la cantidad maxima de numeros aleatorios a generar");
            opcion = teclado.nextInt();
        }
        pracBuc.generarNumeros(opcion);
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();

        
    }
}

