void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int escolha = 1;
    double saldo = 0;
    do {
        MostrarMenu();
        escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("seu saldo atual é = " + saldo);
        } else if (escolha == 2) {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = sc.nextDouble();
            saldo = valor + saldo;
        }
    }while (escolha!=0);

    System.out.println("Finalizando!");


        //metodos abaixo
    } public static void MostrarMenu () {
        System.out.println("====== BANCO JAVA ======");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("0 - Sair");
        System.out.println("---------------");
        System.out.println("escolha uma opcao: ");

    }  /*public static double Deposito (double valor){
     double deposito = valor;
     return deposito;*/

