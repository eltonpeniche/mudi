package br.com.peniche.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.peniche.mvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
