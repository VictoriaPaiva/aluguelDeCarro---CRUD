/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluguelDeCarro.AluguelDeCarroSenac.repository;

import AluguelDeCarro.AluguelDeCarroSenac.models.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vickp
 */
public interface AluguelRepo extends JpaRepository<Aluguel, Integer>{
    Aluguel findById(int id);
}
