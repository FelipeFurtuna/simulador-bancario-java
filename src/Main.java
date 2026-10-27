void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int escolha = 1;
    double saldo = 0;
    do {
        MostrarMenu();
        if (sc.hasNextInt()){
        } else {
            System.out.println("Voce nao digitou um numero!");
            sc.next();
            continue;
        }
        escolha = sc.nextInt();

        if (escolha == 1) {
        consultarSaldo(saldo);
        } else if (escolha == 2) {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = sc.nextDouble();
            saldo = depositar(saldo, valor);

        } else if (escolha == 3) {
            System.out.println("Digite o valor a ser Sacado: ");
            double valor = sc.nextDouble();
            saldo = sacar(saldo, valor);
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

} public static double depositar (double saldo, double valor){
    if (valor > 0) {
        saldo = valor + saldo;
    } else {
        System.out.println(" Não é possivel Depositar um valor NEGATIVO ou ZERO!");
    }
    return saldo;
} public static double sacar (double saldo, double valor){
    if (valor <= saldo && valor > 0) {
        saldo = saldo - valor;
    } else {
        System.out.println("Não foi possivel sacar");
        System.out.println("seu saldo atual é de R$" + saldo);
    }
    return saldo;
} public static void consultarSaldo(double saldo){
    System.out.println("seu saldo atual é R$ " + saldo + " Reais");
}

