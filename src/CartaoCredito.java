import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private String titular;
    private int numeroDoCartao;
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(String titular, int numeroDoCartao, double limite) {
        this.titular = titular;
        this.numeroDoCartao = numeroDoCartao;
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
      if(this.saldo > compra.getValor()) {
          this.saldo -= compra.getValor();
          this.compras.add(compra);
          return true;
      }
      return false;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
