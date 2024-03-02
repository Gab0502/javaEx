// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        exercicio1 ex1 = new exercicio1();
        //ex1.executarLoop();
        //ex1.inteirosFor();
        //2a) i não foi declarado corretamente, while não abre a chave, ++i é incorreto, certo é i++
        //2b) k não foi declarado, não foi aberto e fechado chaves do for, ele não consegue parar exatamente no 1.0 então fica infinito
        //2c)n não foi declarado, não tem um break no case 1
        //2d) n declarado errado, while não abriu chaves, loop vai para no 9, deve ser <=, n++ deve ser fora para não ser loop infinito e print apenas n
        //ex1.corrigirErros();
        ex1.paresAteCem();
        //4a)True
        //b)False
        //c)true
        //d)erro
        //e)true
        //
    }
}