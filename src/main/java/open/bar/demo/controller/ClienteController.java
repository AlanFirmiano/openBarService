package open.bar.demo.controller;

import open.bar.demo.model.Cliente;
import open.bar.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Cliente cliente){
        return service.save(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Cliente cliente){
        return service.update(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> get(){ return service.get(); }

}
