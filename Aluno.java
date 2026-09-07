package pratica1;

public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    public Aluno(String nome, int idade, double coragem, double inteligencia,
            double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = "Ainda nao definida";
    }

    public void calcularCasa() {
        double pontuacaoGrifinoria = (2 * coragem) + lealdade;
        double pontuacaoSonserina = (2 * ambicao) + estrategia;
        double pontuacaoCorvinal = (2 * inteligencia) + criatividade;
        double pontuacaoLufaLufa = ((2 * lealdade) + coragem) / 3;

        casa = "Grifinoria";
        double maiorPontuacao = pontuacaoGrifinoria;

        if (pontuacaoSonserina > maiorPontuacao) {
            casa = "Sonserina";
            maiorPontuacao = pontuacaoSonserina;
        }
        if (pontuacaoCorvinal > maiorPontuacao) {
            casa = "Corvinal";
            maiorPontuacao = pontuacaoCorvinal;
        }
        if (pontuacaoLufaLufa > maiorPontuacao) {
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Ambicao: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Estrategia: " + estrategia);
        System.out.println("Criatividade: " + criatividade);
        System.out.println("Casa: " + casa);
    }
}
