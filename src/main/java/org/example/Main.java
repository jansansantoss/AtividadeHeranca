public class Main {
    public static void main(String[] args) {
        Aluna aluna = new Aluna();
        aluna.nome = "Joana";
        aluna.idade = 27;
        aluna.curso = "Análise de Sistemas";

        aluna.apresentar();
        aluna.estudar();
    }
}