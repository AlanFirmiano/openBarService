package open.bar.demo.service;

import open.bar.demo.model.Carrinho;
import open.bar.demo.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {
    @Autowired
    CarrinhoRepository repository;
    public ResponseEntity<String> save(Carrinho carrinho){
        repository.save(carrinho);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Carrinho carrinho){
        repository.save(carrinho);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Carrinho> get(Integer id){
        return new ResponseEntity<Carrinho>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Carrinho>> get(){
        return new ResponseEntity<List<Carrinho>>(this.repository.findAll(), HttpStatus.OK);
    }
}
