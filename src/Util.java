//Vamos importar duas classes static
//A primeira é para utilizar as janelas gráficas sem precisar escrever JOptionPane.(alguma coisa) toda hora - assim só escrevemos o método desejado
import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;

//Fazemos a mesma coisa com a classe Integer, mas dessa vez importamos somente o método parseInt
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

//Utilizamos o static na hora de importar para indicar que os métodos pertencem à classe, e não a um objeto!

public class Util {
    static final int N = 2; ;
    private Bilhete[] bilhetes = new Bilhete[N];
    private int i = 0;

    public void MainMenu() {
        int op;
        String textMenu = "1. Administrador\n2. Usuário\n3. Finalizar\n";

        do {
            op = parseInt(showInputDialog(textMenu));

            if (op < 1 || op > 3) {
                //Atrbuimos o valor null no primeiro parâmetro pois ele pede um Componente pai, e como não temos, colocamos null

                //LEMBRETE: Podemos ter métodos com o mesmo NOME desde que os PARÂMETROS sejam diferentes -> chamamos de
                //Sobrecarga ou Overload

                showMessageDialog(null, "Opção Inválida!");
            }

            switch (op) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    menuUser();
                    break;
            }
        } while(op != 3);
    }

    //Colocamos esse método privado pois não é todo mundo que vai acessar -
    //Para o menuAdmin ser acessado, somente através do mainMenu
    private void menuAdmin() {
        int op;
        String opcoesAdmin = "1. Emitir bilhete\n2. Listar bilhetes\n3. Remover\n4. Sair";

        do {
            op = parseInt(showInputDialog(opcoesAdmin));

            if (op < 1 || op > 4) {
                showMessageDialog(null ,"Opção inválida");
            }
            switch (op) {
                case 1:
                  emitirBilhete();
                  break;
                case 2:
                    listarBilhetes();
                    break;
            }
        } while(op != 4);


    }

    private void emitirBilhete() {
        if (i >= bilhetes.length) {
            showMessageDialog(null, "Número execedido de bilhetes!");
        } else {
            String nome, ocupacao;
            long cpf;

            nome = showInputDialog("Insira o nome do dono do bilhete");
            cpf = parseLong(showInputDialog("Insira o CPF do dono do bilhete"));
            ocupacao = showInputDialog("Insira a ocupação do dono do bilhete (Professor ou Estudante ou Comum)");

            Usuario user1 = new Usuario(nome, cpf, ocupacao);
            bilhetes[i] = new Bilhete(user1);
            i++;
        }
    }

    private void listarBilhetes() {
        DecimalFormat mask = new DecimalFormat("0.00");
        String aux = "";
        for(int j = 0; j < i; j++) {
            aux += "\nBilhete " + (j + 1) + ": \n";
            aux += "N° bilhete: " + bilhetes[j].getNum() + "\n";
            aux += "Dono: " + bilhetes[j].usuario.nome + "\n";
            aux += "CPF: " + bilhetes[j].usuario.cpf + "\n";
            aux += "Ocupação: " + bilhetes[j].usuario.perfil + "\n";
            aux += "Saldo: R$" + mask.format(bilhetes[j].saldo)  + "\n";

        }
        showMessageDialog(null, aux);
    }

    private void menuUser() {
        int op;
        String textoMenuUsuario = "1. Consultar saldo\n2. Carregar bilhete\n3. Passar na catraca\n4. Sair";
        do {
            op = parseInt(showInputDialog(textoMenuUsuario));

            if (op < 1 || op > 4) {
                showMessageDialog(null, "Opção inválida");
            }

            switch (op) {
                case 1:
                    consultar();
                    break;
                case 2:
                    carregar();
                    break;
                case 3:
                    passarNaCatraca();
                    break;

            }

        } while (op != 4);
    }

    private int pesquisarBilhete() {
        long cpf = parseLong(showInputDialog("Insira o CPF que deseja pesquisar"));
        for (int j = 0; j < i; j++) {
            if (bilhetes[j].usuario.cpf == cpf) {
                return j;
            }
        }
        showMessageDialog(null, "CPF " + cpf + " não encontrado!");
        return -1;
    }

    //Método para carregar o bilhete -- com valor informado pelo usuário
    private void carregar() {
        int posicao = pesquisarBilhete();
        if (posicao != -1) {
            double saldo = parseDouble(showInputDialog("Insira o valor de recarga"));
            bilhetes[posicao].carregarBilhete(saldo);
        }
    }

    //Método para consultar o saldo do bilhete -- com o valor informado pelo usuário
    private void consultar() {
        int posicao = pesquisarBilhete();
        if (posicao != -1) {
           showMessageDialog(null, "Saldo: R$" + String.format("%.2f", bilhetes[posicao].consultarSaldo()));
        }
    }

    //Método para passar na catraca -- Simulação
    private void passarNaCatraca(){
        int posicao = pesquisarBilhete();
        if (posicao != -1) {
            showMessageDialog(null, bilhetes[posicao].passarNaCatraca());
        }
    }
}
