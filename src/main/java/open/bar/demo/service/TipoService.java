package open.bar.demo.service;

import open.bar.demo.model.Tipo;
import open.bar.demo.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoService {
    @Autowired
    TipoRepository repository;
    public ResponseEntity<String> save(Tipo tipo){
        repository.save(tipo);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Tipo tipo){
        repository.save(tipo);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Tipo> get(Integer id){
        return new ResponseEntity<Tipo>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Tipo>> get(){
        return new ResponseEntity<List<Tipo>>(this.repository.findAll(), HttpStatus.OK);
    }
}
