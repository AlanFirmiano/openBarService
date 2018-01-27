package open.bar.demo.service;

import open.bar.demo.model.Cliente;
import open.bar.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;
    public ResponseEntity<String> save(Cliente cliente){
        repository.save(cliente);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Cliente cliente){
        repository.save(cliente);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Cliente> get(Integer id){
        return new ResponseEntity<Cliente>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Cliente>> get(){
        return new ResponseEntity<List<Cliente>>(this.repository.findAll(), HttpStatus.OK);
    }
}
