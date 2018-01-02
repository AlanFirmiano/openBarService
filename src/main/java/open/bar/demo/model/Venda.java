package open.bar.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Venda {

    @Id
    @GeneratedValue
    private int id;
    private Date data;
    private ArrayList<Item> itens;
    private double valorItens;
    private double desconto;
    private double total;

    public Venda(){
        itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValorItens() {
        return valorItens;
    }

    public void setValorItens(double valorItens) {
        this.valorItens = valorItens;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
