package br.com.ifpe.oxefood.modelo.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    @Query(value= "SELECT c FROM Cliente c WHERE c.nome ilike %:nome% ORDER BY c.nome")
    List<Cliente> consultarPorNome(String nome);

    @Query(value= "SELECT c FROM Cliente c Where c.cpf = :cpf")
    List<Cliente> consultarPorCPF(String cpf);

    @Query(value="SELECT c FROM Cliente c WHERE c.nome ILIKE %:nome% AND c.cpf = :cpf")
    List<Cliente> consultarPorNomeECPF(String nome, String cpf);
}
