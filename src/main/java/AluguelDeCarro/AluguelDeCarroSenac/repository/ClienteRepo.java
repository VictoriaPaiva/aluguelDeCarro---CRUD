/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluguelDeCarro.AluguelDeCarroSenac.repository;

import AluguelDeCarro.AluguelDeCarroSenac.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vickp
 */
public interface ClienteRepo extends JpaRepository<Cliente, Integer>{
    Cliente findById(int id);
}
