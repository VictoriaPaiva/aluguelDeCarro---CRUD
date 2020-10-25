/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluguelDeCarro.AluguelDeCarroSenac.resources;

import AluguelDeCarro.AluguelDeCarroSenac.models.Aluguel;
import AluguelDeCarro.AluguelDeCarroSenac.models.Carro;
import AluguelDeCarro.AluguelDeCarroSenac.models.Cliente;
import AluguelDeCarro.AluguelDeCarroSenac.repository.AluguelRepo;
import AluguelDeCarro.AluguelDeCarroSenac.repository.CarroRepo;
import AluguelDeCarro.AluguelDeCarroSenac.repository.ClienteRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vickp
 */
@RestController
@RequestMapping("/api")
public class Resource {
    @Autowired
    AluguelRepo aluguelRepo;
    
    @GetMapping("/alugueis")
    public List<Aluguel> listaAlugueis(){
        return aluguelRepo.findAll();
    }
    @GetMapping("/aluguel/{id}")
    public Aluguel pegaAluguel(@PathVariable(value="id")int id){
     return aluguelRepo.findById(id);
    }
    @PostMapping("/aluguel/novo")
    public Aluguel novoAluguel (@RequestBody Aluguel aluguelNovo) {
        return aluguelRepo.save(aluguelNovo);
    }
    @DeleteMapping("excluiAluguel")
    public void excluiAluguel(@RequestBody Aluguel aluguelExcluido){
        aluguelRepo.save(aluguelExcluido);
    }
    @PutMapping("/atualizaAluguel")
    public Aluguel atualizaAluguel (@RequestBody Aluguel aluguel){
        return aluguelRepo.save(aluguel);
    }
     @Autowired
    ClienteRepo clienteRepo;
    
    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteRepo.findAll();
    }
    @GetMapping("/cliente/{id}")
    public Cliente pegaCliente(@PathVariable(value="id")int id){
     return clienteRepo.findById(id);
    }
    @PostMapping("/cliente/novo")
    public Cliente novoCliente (@RequestBody Cliente clienteNovo) {
        return clienteRepo.save(clienteNovo);
    }
    @DeleteMapping("excluiCliente")
    public void excluiCliente(@RequestBody Cliente clienteExcluido){
        clienteRepo.save(clienteExcluido);
    }
    @PutMapping("/atualizaCliente")
    public Cliente atualizaCliente(@RequestBody Cliente cliente){
        return clienteRepo.save(cliente);
    }
     @Autowired
    CarroRepo carroRepo;
    
    @GetMapping("/carros")
    public List<Carro> listaCarros(){
        return carroRepo.findAll();
    }
    @GetMapping("/carro/{id}")
    public Carro pegaCarro(@PathVariable(value="id")int id){
     return carroRepo.findById(id);
    }
    @PostMapping("/carro/novo")
    public Carro novoCarro (@RequestBody Carro carroNovo) {
        return carroRepo.save(carroNovo);
    }
    @DeleteMapping("excluiCarro")
    public void excluiCarro(@RequestBody Carro carroExcluido){
        carroRepo.save(carroExcluido);
    }
    @PutMapping("/atualizaACarro")
    public Carro atualizaACarro (@RequestBody Carro carro){
        return carroRepo.save(carro);
    }
    
    
}
