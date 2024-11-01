public class Elevador {
    private int andarAtual;
    private final int maximoAndares;
    private final int maximoPeso;
    private final int maximoPessoas;
    private int pessoasPresentes;

    public Elevador(int maximoPeso, int maximoAndares, int maximoPessoas) {
        this.maximoPeso = maximoPeso;
        this.maximoAndares = maximoAndares;
        this.maximoPessoas = maximoPessoas;
    }

    // TODO: Método para acrescentar uma pessoa no elevador, se houver espaço
    public String entra() {
        if (pessoasPresentes < maximoPessoas) {
            pessoasPresentes++;
            return "Uma pessoa entrou no elevador. Pessoas presentes: " + pessoasPresentes;
        } else {
            return "Elevador lotado! Não é possível adicionar mais pessoas.";
        }
    }

    // TODO: Método para remover uma pessoa do elevador, se houver alguém dentro
    public String sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return "Uma pessoa saiu do elevador. Pessoas presentes: " + pessoasPresentes;
        } else {
            return "O elevador está vazio! Não há ninguém para sair.";
        }
    }

    // TODO: Método para subir um andar, se não estiver no último andar
    public String sobe() {
        if (andarAtual < maximoAndares) {
            andarAtual++;
            return "O elevador subiu para o andar " + andarAtual;
        } else {
            return "O elevador já está no último andar.";
        }
    }

    // TODO: Método para descer um andar, se não estiver no térreo
    public String desce() {
        if (andarAtual > 0) {
            andarAtual--;
            return "O elevador desceu para o andar " + andarAtual;
        } else {
            return "O elevador já está no térreo.";
        }
    }

    public String toString() {
        return String.format("\nElevador está funcionando.\n" +
                        "O elevador irá suportar %d kg de peso e o máximo de pessoas será %d.\n" +
                        "O prédio terá %d andares.\n" +
                        "O elevador está no andar %d.\n",
                maximoPeso, maximoPessoas, maximoAndares, andarAtual);
    }
}
