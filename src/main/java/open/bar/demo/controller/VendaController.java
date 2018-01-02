package open.bar.demo.controller;

import open.bar.demo.model.Venda;
import open.bar.demo.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
@CrossOrigin(origins = "*")
public class VendaController {
    @Autowired
    private VendaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Venda venda){
        return service.save(venda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Venda venda){
        return service.update(venda);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Venda>> get(){ return service.get(); }
}
