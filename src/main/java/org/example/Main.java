public class Main {
    public static void main(String[] args) {
        // Aluna: preenchendo todos os atributos
        Aluna ana = new Aluna();
        ana.nome = "Aline";
        ana.idade = 20;
        ana.curso = "Engenharia de Software";

        // Professora: preenchendo todos os atributos
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 40;
        flora.disciplina = "Programação";

        // Métodos da aluna
        ana.apresentar();
        ana.estudar();

        // Métodos da professora
        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);
    }
}