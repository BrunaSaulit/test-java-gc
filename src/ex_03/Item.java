public class ex_03 {
    String nome;
    int quantidade;
    public ex_03(String nome){
        this.nome = nome;
        this.quantidade = 1;
    }

    public ex_03(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args){
        ex_03 x = new ex_03("Caderno");
        ex_03 y = new ex_03("Caneta",3);
        System.out.println(x.quantidade + y.quantidade);
    }
}
