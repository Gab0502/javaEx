public class Palindromo {
    public boolean validarPalindromo(String frase) {
        boolean resultado = false;
        String aux = new String();
        frase = frase.replace(" ","");

        for(int i= frase.length() -1; i>=0 ;i--){
            aux = aux.concat(String.valueOf(frase.charAt(i)));
        }
        if(frase.compareToIgnoreCase(aux)==0){
            resultado = true;
            System.out.println("é um palindromo");
        }else{
            System.out.println("não é um palindromo");
        }

        return resultado;
    }
}
