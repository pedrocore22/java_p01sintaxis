public class c04valoresdefecto {
    // Para variables de clase o instancia
    // Java establece valores por defecto
    // Numéricos será 0 según el tipo
    // Boolean será false
    // Char será caracter vacío
    static byte variable1;
    static float variable3;
    static boolean variable4;
    static char variable5;

    public static void main(String[] args) {
        System.out.println(variable1);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        // Si la variable es local a un método
        // o estructura no tiene valor por defecto
        byte variable2;
        // System.out.println(variable2);, error
    }


}