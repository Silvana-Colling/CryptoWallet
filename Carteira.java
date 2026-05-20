public class Carteira {
    String dono;
    double saldoBitcoin;

    public Carteira(String dono){
        this.dono = dono;
        this.saldoBitcoin = 1000000.0;
    }

    public void depositar(double qtde){
        this.saldoBitcoin += qtde;
    }
}
