import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        int numAleatorio = 0;
        int c = 0;
        int cColumnas = 0; 
        int sumaValores = 0;
        int sumaImpares = 0;
        while(c<n || numAleatorio == 0){
            numAleatorio = -1000 + generador.nextInt(5001);
            System.out.printf("%12d%5d",numAleatorio,obtenerNumeroSinCeros(numAleatorio));
            sumaValores= sumaValores +  numAleatorio + obtenerNumeroSinCeros(numAleatorio);
            if (esImpar(numAleatorio) || esImpar (obtenerNumeroSinCeros(numAleatorio))){
                sumaImpares = sumaImpares + numAleatorio + obtenerNumeroSinCeros(numAleatorio);
            }
            cColumnas++;
            while(cColumnas>4){
                System.out.println();
                cColumnas = 0;
            }
            c++;
        }
        double media = sumaValores / n*2;
        System.out.println(sumaImpares);
        String med = "media: ";
        String sImpares = "suma impares: ";
        System.out.printf("%25s%10.2f",med,media);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int resultado = 0;
        int exponente = 0;
        while(numero!=0){
            int nAparte = numero % 10;
            if (nAparte ==0){
                numero /= 10;
            }
            else{
                resultado = resultado + nAparte * (int)Math.pow(10,exponente);
                numero /= 10;
                exponente ++;
            }

        }
        return resultado;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
        //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        //TODO

    }
}
