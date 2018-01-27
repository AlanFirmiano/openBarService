package open.bar.demo.controller;

import open.bar.demo.model.Carrinho;
import open.bar.demo.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
@CrossOrigin(origins = "*")
public class CarrinhoController {
    @Autowired
    private CarrinhoService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Carrinho carrinho){
        return service.save(carrinho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Carrinho carrinho){
        return service.update(carrinho);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrinho> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Carrinho>> get(){ return service.get(); }

}
