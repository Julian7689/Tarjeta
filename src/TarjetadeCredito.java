import java.util.ArrayList;
import java.util.List;

//Creo la clase tarjeta y agrego sus atributos
public class TarjetadeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDecompras;

     //Creo un constructor que reconozca al atributo limite dentro de saldo y limite
    public TarjetadeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDecompras = new ArrayList<Compra>();
    }

    public boolean lanzarcompra(Compra compra){
        // Valido que el saldo sea mayor o igual a la compra
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDecompras.add(compra);
            return true;
        }
        return false;
    }


    //Agrego los getters

    public List<Compra> getListaDecompras() {
        return listaDecompras;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
