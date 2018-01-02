package open.bar.demo.service;

import open.bar.demo.model.Venda;
import open.bar.demo.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    VendaRepository repository;
    public ResponseEntity<String> save(Venda venda){
        repository.save(venda);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Venda venda){
        repository.save(venda);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Venda> get(Integer id){
        return new ResponseEntity<Venda>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Venda>> get(){
        return new ResponseEntity<List<Venda>>(this.repository.findAll(), HttpStatus.OK);
    }
}
