public class ex_07 {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if(emprestado){
            return "Indisponível";
        }
        return "Disponível";
    }
}
