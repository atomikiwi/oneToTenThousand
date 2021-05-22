public class Main {

    public static void main(String[] args) {
        int retour = 0;
        for(int iter = 1; iter <= 10000; iter++) {
            if (iter%3 != 0) {
                String nombre = Integer.toString(iter);
                if( nombre.length() <= 2) {
                    retour += iter;
                } else {
                    int index = nombre.length() - 3;
                    int compare = Character.getNumericValue(nombre.charAt(index));
                    if (compare != 2 && compare != 3) {
                        retour += iter;
                    }
                }
            }
        }
        System.out.println("Le total est de : " + retour);
    }
}
