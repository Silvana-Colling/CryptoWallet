public class Carteira {
    String dono;
    double saldoBitcoin;
    String senhaAcesso;

    public Carteira(String dono){
        this.dono = dono;
        this.saldoBitcoin = 1000000.0;
        this.senhaAcesso = "123456"; //inicializando a senhaAcesso
    }

    public void depositar(double qtde){
        this.saldoBitcoin += qtde;
    }
}

