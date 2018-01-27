package open.bar.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private List<Item> itens;
    @OneToOne
    private Cliente cliente;

    public Carrinho(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
