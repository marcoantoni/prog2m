// Importa a classe Scanner, utilizada para ler dados digitados pelo usuário.
import java.util.Scanner;

class Calculadora {

    /*
     * OBJETIVO DESTE EXEMPLO
     *
     * Demonstrar a diferença entre métodos com retorno e métodos sem retorno.
     *
     * Métodos sem retorno executam alguma tarefa, mas não devolvem
     * nenhuma informação para quem os chamou. Por isso utilizam a
     * palavra-chave "void".
     *
     * Métodos com retorno executam uma tarefa e devolvem um valor
     * ao final da execução. O tipo desse valor deve ser informado
     * na declaração do método (int, float, String, etc.).
     *
     * Neste exemplo:
     * - mostrarMenu() e lerTeclado() são métodos sem retorno (void);
     * - calcular() é um método com retorno (float).
     */

    // Atributos da classe.
    // Armazenam os números e a operação escolhida pelo usuário.
    float n1;
    float n2;
    String operacao;

    // O tipo "void" indica que este método não retorna nenhum valor.
    // Sua única função é exibir o menu de opções na tela.
    public void mostrarMenu() {
        System.out.printf("Exibindo as opções da calculadora\n");
        System.out.printf("+ - para somar\n");
        System.out.printf("- - para subtrair\n");
        System.out.printf("* - para multiplicar\n");
        System.out.printf("/ - para dividir\n");
        System.out.printf("s - para sair\n");
    }

    // Este método também é do tipo void porque apenas realiza leituras
    // do teclado e armazena os valores nos atributos da classe.
    // Nenhum valor é devolvido para quem chamou o método.
    public void lerTeclado() {

        // Cria um objeto Scanner para realizar leituras do teclado.
        Scanner sc = new Scanner(System.in);

        // Lê a operação desejada (+, -, *, /).
        System.out.printf("Qual operação você deseja?\n");
        operacao = sc.nextLine();

        // Lê o primeiro número e armazena no atributo n1.
        System.out.printf("Digite o número 1: ");
        n1 = sc.nextFloat();

        // Lê o segundo número e armazena no atributo n2.
        System.out.printf("Digite o número 2: ");
        n2 = sc.nextFloat();
    }

    // Diferentemente dos métodos anteriores, este método possui retorno.
    // O tipo float indica que o valor devolvido será um número decimal.
    //
    // Quando um método possui retorno, normalmente existe uma instrução
    // return ao final para devolver o resultado para quem chamou o método.
    public float calcular() {

        // Variáveis locais devem receber um valor inicial antes de serem utilizadas.
        float resultado = 0;

        // Verifica qual operação foi escolhida e executa o cálculo correspondente.
        if (operacao.equals("+")) {

            resultado = n1 + n2;

        } else if (operacao.equals("-")) {

            resultado = n1 - n2;

        } else if (operacao.equals("*")) {

            resultado = n1 * n2;

        } else if (operacao.equals("/")) {

            resultado = n1 / n2;

        } else {

            // Executado caso o usuário informe uma operação inválida.
            System.out.printf("A operação escolhida é inválida\n");
        }

        // O comando return devolve o conteúdo da variável resultado
        // para quem chamou o método.
        return resultado;
    }

    public static void main(String args[]) {

        // Cria um objeto da classe Calculadora.
        Calculadora c1 = new Calculadora();

        // Chama um método sem retorno.
        // Observe que não é necessário armazenar nada em uma variável.
        c1.mostrarMenu();

        // Chama outro método sem retorno.
        c1.lerTeclado();

        // Chama um método com retorno.
        // Como o método devolve um float, normalmente armazenamos
        // o valor retornado em uma variável.
        float resposta = c1.calcular();

        // Exibe o resultado retornado pelo método calcular().
        System.out.printf("O resultado da operação é %f\n", resposta);

        /*
         * TAREFA PARA A AULA
         *
         * Criar um método construtor para receber os valores de n1,
         * n2 e operacao.
         *
         * Depois, testar o método calcular() sem utilizar o teclado,
         * preenchendo os atributos diretamente pelo construtor.
         *
         * Exemplo:
         *
         * Calculadora c1 = new Calculadora(10, 5, "+");
         * System.out.println(c1.calcular());
         *
         * Dessa forma será possível perceber que o método calcular()
         * depende apenas dos atributos da classe e não necessariamente
         * da leitura realizada pelo método lerTeclado().
         */
    }
}
