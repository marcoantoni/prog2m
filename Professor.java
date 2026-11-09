/*
 * Classe Professor
 *
 * A palavra-chave extends indica que Professor herda de Pessoa.
 *
 * Isso significa que Professor é uma classe filha (subclasse)
 * e Pessoa é sua classe pai (superclasse).
 *
 * Assim, Professor herda os atributos e métodos acessíveis
 * da classe Pessoa.
 */
class Professor extends Pessoa {

    // Atributos específicos da classe Professor.
    // Eles não existem na classe Pessoa.
    private float salario;
    private int siape;

    /*
     * Construtor da classe Professor.
     *
     * Além dos dados comuns a uma pessoa, recebemos também
     * o salário e o número de matrícula (SIAPE).
     */
    public Professor(String nome, Data nasc, String email, String cpf,
                     float salario, int siape) {

        /*
         * A palavra-chave super é utilizada para chamar
         * o construtor da classe pai (Pessoa).
         *
         * Estamos passando os dados comuns a qualquer pessoa
         * para que a própria classe Pessoa seja responsável
         * por inicializar seus atributos.
         *
         * Dessa forma, não precisamos repetir aqui:
         *
         * this.nome = nome;
         * this.nascimento = nasc;
         * this.email = email;
         * this.cpf = cpf;
         *
         * IMPORTANTE: a chamada super() deve ser a primeira
         * instrução do construtor.
         */
        super(nome, nasc, email, cpf);

        // Inicializando os atributos específicos da classe Professor.

        // Verifica se o salário atende ao valor mínimo estabelecido.
        if (salario >= 5000) {
            this.salario = salario;
        } else {
            System.out.printf("Salário inválido. Não pode ser menor que o piso nacional do magistério \n");
        }

        // Verifica se o número de matrícula (SIAPE) é válido.
        if (siape > 0) {
            this.siape = siape;
        } else {
            System.out.printf("Número de matrícula (SIAPE) é inválido \n");
        }
    }

    /*
     * Método mostrar()
     *
     * Aqui estamos sobrescrevendo (override) o método mostrar()
     * que já existe na classe Pessoa.
     *
     * Observe que estamos criando uma nova implementação.
     * Em vez de aproveitar o método da classe pai, estamos
     * escrevendo novamente as informações que queremos exibir.
     */
    public String mostrar() {

        return "Nome: " + nome +
               "\nNascimento: " + nascimento.escreverPorExtenso() +
               "\nEmail: " + email +
               "\nSalário: R$: " + salario +
               "\nSIAPE: " + siape;
    }

    /*
     * Método mostrar2()
     *
     * Aqui temos outra possibilidade!
     *
     * Em vez de reescrever todo o código para apresentar
     * os dados da pessoa, podemos aproveitar o método mostrar()
     * que já foi implementado na superclasse Pessoa.
     */
    public String mostrar2() {

        /*
         * super.mostrar() chama especificamente o método mostrar()
         * da classe pai (Pessoa).
         *
         * Assim, a variável msg recebe todas as informações
         * que já são apresentadas pela superclasse.
         */
        String msg = super.mostrar();

        /*
         * Utilizamos o operador += para acrescentar à mensagem
         * os atributos específicos da classe Professor.
         *
         * Ou seja, aproveitamos o que já existe e adicionamos
         * apenas as informações que são próprias do Professor.
         */
        msg += "\nSalário: R$ " + salario +
               "\nSIAPE: " + siape + "\n";

        // Retorna a mensagem completa.
        return msg;
    }
}
