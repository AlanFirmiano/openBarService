package open.bar.demo.controller;

import open.bar.demo.model.Tipo;
import open.bar.demo.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
@CrossOrigin(origins = "*")
public class TipoController {
    @Autowired
    private TipoService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Tipo tipo){
        return service.save(tipo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Tipo tipo){
        return service.update(tipo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipo> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Tipo>> get(){ return service.get(); }
}
