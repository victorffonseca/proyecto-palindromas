public class Palindromo {

    public Palindromo() {
    }

    public void validarPalindromos(String[] palabras) {
        StringBuilder palindromas = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            String palabraMinusculas = palabras[i].toLowerCase();
            if (palabraMinusculas.equals(new StringBuilder().append(palabraMinusculas).reverse().toString())) {
                if(i == palabras.length - 1) {
                    palindromas.append(palabraMinusculas);
                } else {
                    palindromas.append(palabraMinusculas).append(", ");
                }
            }
        }
        System.out.println(palindromas);
    }
}
