public class Cat {
    String nome;

    float peso;
    boolean ehArisco;
    String cor;

    public void dormir(){
        System.out.println("ZZzz a dormir");
    }
    public void comer(){
        System.out.println("nhom nhom nhom");
    }
    public void fazerManha(){
        System.out.println("miau miau miau");
    }
    public void fazerBagunca(){
        System.out.println("hahahaha, vo destruir vc");
    }

    public Cat(String nome, float peso, boolean ehArisco, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.ehArisco = ehArisco;
        this.cor = cor;
    }
    public Cat(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
        ehArisco = false;
        peso = 4.0f;
    }



    public String toString() {
        return "nome: " + this.nome + " peso: " + this.peso+ " cor: " + this.cor + " é arisco: " + this.ehArisco;
    }

    public static void main(String[] args) {
        Cat nik = new Cat("Nik", 5f, false, "siames");
        Cat nina = new Cat("Nina", 3f, false, "siames");
        Cat faisca = new Cat("Faisca",2f, true, "frajola");
        Cat abc = new Cat("abc", "azul");


        System.out.println(nik);

    }
}
