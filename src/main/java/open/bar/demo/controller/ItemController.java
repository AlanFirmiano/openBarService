package open.bar.demo.controller;


import open.bar.demo.model.Item;
import open.bar.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Item item){
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Item item){
        return service.update(item);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Item>> get(){ return service.get(); }
}
