public class exercicio1 {
    int i = 1;
    int soma = 0;
    public void executarLoop(){
        for(i =0;i<=100;i++){
            if(i%2!=0){
                soma = soma + i;
                System.out.println(soma);
            }
        }
    }
    public void inteirosWhile(){
        while(i<=20){
            System.out.print(i);
            if(i%5==0){
                System.out.print("\n");
            }
            i++;
        }
    }
    public void inteirosFor(){
        for(i=1;i<=20;i++){
            System.out.print(i);
            if(i%5==0){
                System.out.print("\n");
            }
        }
    }
    public void corrigirErros(){
        System.out.println("primeiro erro a)");
        for(i=100;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("segundo erro erro b)");

        for(i=19;i>=1;i-=2){
            System.out.println(i);
        }
    }

    public void paresAteCem(){
        int counter = 2;
        do{
            System.out.println(counter);
            counter+=2;
        }while(counter<=100);
    }

    }
