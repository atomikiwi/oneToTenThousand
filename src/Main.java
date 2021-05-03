public class Main {

    public static void main(String[] args) {
        int retour = 0;
        for(int iter = 1; iter <= 10000; iter++) {
            if (iter%3 != 0) {
                System.out.println(iter + " n'est pas divisible par 3.");
                if( Integer.toString(iter).length() <= 2) {
                    System.out.print(retour + " + " + iter);
                    retour += iter;
                    System.out.println(" = " + retour);
                } else {
                    String nombre = Integer.toString(iter);
                    int index = nombre.length() - 3;
                    if (Character.getNumericValue(nombre.charAt(index)) != 2 && Character.getNumericValue(nombre.charAt(index)) != 3) {
                        System.out.print(retour + " + " + iter);
                        retour += iter;
                        System.out.println(" = " + retour);
                    } else {
                        System.out.println("Le nombre " + nombre + " ne sera pas additionné.");
                    }
                }
            }
        }
        System.out.println("Le total est de :");
        System.out.println(retour);
    }
}
