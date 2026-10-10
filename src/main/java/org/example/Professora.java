import java.util.Locale;

public class Professora extends Pessoa {
    String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf(Locale.US, "%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }
}