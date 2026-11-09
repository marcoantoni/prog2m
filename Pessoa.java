
/*
 * Classe Pessoa
 *
 * Esta é uma classe genérica que representa uma pessoa.
 * Ela será utilizada como classe pai (superclasse) em exemplos
 * de herança.
 */
class Pessoa {

    /*
     * Os atributos foram declarados como protected.
     *
     * O modificador protected permite que os atributos sejam
     * acessados diretamente pelas classes que herdam de Pessoa,
     * mesmo que estejam em outro pacote.
     *
     * Também permite o acesso por outras classes do mesmo pacote.
     *
     * Diferentemente de private, que restringe o acesso direto
     * ao interior da própria classe.
     */
    protected String nome;
    protected Data nascimento;
    protected String email;
    protected String cpf;

    /*
     * Construtor da classe Pessoa.
     *
     */
    public Pessoa(String nome, Data nascimento, String email, String cpf) {

        // Neste exemplo, não estamos realizando validações dos dados,
        // para manter o código mais simples e focar no conceito de herança.
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.cpf = cpf;
    }

    /*
     * Não estamos criando os métodos getters e setters neste exemplo,
     * para simplificar o código e concentrar a explicação no conceito
     * de herança e no modificador protected.
     */

    /*
     * Método mostrar()
     *
     * Retorna uma String contendo as informações da pessoa.
     *
     * Observe que os atributos podem ser acessados diretamente
     * dentro da própria classe.
     */
    public String mostrar() {

        return "Nome civil: " + nome +
               "\nData de nascimento: " + nascimento.escreverPorExtenso() +
               "\nEmail: " + email +
               "\nCPF: " + cpf;
    }
}
