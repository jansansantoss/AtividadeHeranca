public class Main {
    public static void main(String[] args) {
        Aluna ana = new Aluna();
        ana.nome = "Aline";
        ana.idade = 20;
        ana.curso = "Engenharia de Software";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 40;
        flora.disciplina = "Programação";

        ana.apresentar();
        ana.estudar();

        flora.apresentar();
        flora.lancarNota("Ana", 9.5);
    }
}