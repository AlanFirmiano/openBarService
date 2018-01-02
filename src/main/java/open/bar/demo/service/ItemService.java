package open.bar.demo.service;

import open.bar.demo.model.Item;
import open.bar.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository repository;
    public ResponseEntity<String> save(Item item){
        repository.save(item);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Item item){
        repository.save(item);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Item> get(Integer id){
        return new ResponseEntity<Item>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Item>> get(){
        return new ResponseEntity<List<Item>>(this.repository.findAll(), HttpStatus.OK);
    }
}
