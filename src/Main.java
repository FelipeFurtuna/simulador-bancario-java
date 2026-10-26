void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int escolha = 1;
    double saldo = 0;
    do {
        MostrarMenu();
        escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("seu saldo atual é R$ " + saldo + " Reais");
        } else if (escolha == 2) {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = sc.nextDouble();
            //inicio do if dentro do if de escolha, nao confundir
            if (valor >= 0) {
                saldo = valor + saldo;
            } else {
                System.out.println(" Não é possivel Depositar um valor NEGATIVO!");
            }
            //if dentro do if de escolha FIM
        } else if (escolha == 3) {
            System.out.println("Digite o valor a ser Sacado: ");
            double valor = sc.nextDouble();
            if (valor<=saldo) {
                saldo = saldo - valor;
            } else {
                System.out.println("Não foi possivel sacar");
                System.out.println("seu saldo atual é de R$" + saldo);
            }
        } else if (escolha == 0) {
            break;
        } else {
            System.out.println("OPCAO INVALIDA!");
            System.out.println("TENTE NOVAMENTE");
        }
    } while (escolha != 0);
    System.out.println("Obrigado por usar o meu banco!");
    System.out.println("Finalizando....");

    //metodos abaixo
}

public static void MostrarMenu() {
    System.out.println("====== BANCO JAVA ======");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Depositar dinheiro");
    System.out.println("3 - Sacar dinheiro");
    System.out.println("0 - Sair");
    System.out.println("---------------");
    System.out.println("escolha uma opcao: ");

}

