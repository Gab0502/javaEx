public class Cesar {
    String[] alfabeto = new String[]{" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] alfabetoCifraCesar = new String[]{" ", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"};
    String resolucao;
    public void criptografa(String fraseUser){
        for (int i = 0; i <= (fraseUser.length()-1); i++) {
            char ch = fraseUser.charAt(i);
            System.out.println(ch);
            for (int j = 0; j < (alfabeto.length-1); j++) {
                if (ch == alfabeto[j].charAt(0)) {
                    System.out.println("org "+ alfabeto[j]);
                    System.out.println("Cifra " + alfabetoCifraCesar[j]);

                    resolucao += alfabetoCifraCesar[j];
                }
            }
        }
        System.out.printf(resolucao);
    }
}
