package devsuperior.example.clientes.repository;

import devsuperior.example.clientes.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {
}
