package AluguelDeCarro.AluguelDeCarroSenac;

import AluguelDeCarro.AluguelDeCarroSenac.models.Aluguel;
import AluguelDeCarro.AluguelDeCarroSenac.models.Carro;
import AluguelDeCarro.AluguelDeCarroSenac.models.Cliente;
import AluguelDeCarro.AluguelDeCarroSenac.repository.AluguelRepo;
import AluguelDeCarro.AluguelDeCarroSenac.repository.CarroRepo;
import AluguelDeCarro.AluguelDeCarroSenac.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class AluguelDeCarroSenacApplication {

	
    @Autowired
    private CarroRepo carroRepo;
    @Autowired
    private ClienteRepo clienteRepo;
    @Autowired
    private AluguelRepo aluguelRepo;

    @EventListener
    public void createAllRolesOnInit(ContextRefreshedEvent ctx) {
        Cliente cliente = new Cliente("claudinha","123456789",22,"25897463");
        Carro carro = new Carro("volks","abc123",4,15000.00,"roxo","luxo");
        Aluguel aluguel = new Aluguel(carroRepo.save(carro),clienteRepo.save(cliente),2500.00,"01/01/2010","01/03/2010","31/02/2010",0.0);
        aluguelRepo.save(aluguel);
    }
	public static void main(String[] args) {
		SpringApplication.run(AluguelDeCarroSenacApplication.class, args);
                
	}
}
