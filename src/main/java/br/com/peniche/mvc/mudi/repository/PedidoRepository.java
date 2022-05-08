package br.com.peniche.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.peniche.mvc.mudi.model.Pedido;
import br.com.peniche.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido status);

}
