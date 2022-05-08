package br.com.peniche.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.peniche.mvc.mudi.dto.RequisicaoNovoPedido;
import br.com.peniche.mvc.mudi.model.Pedido;
import br.com.peniche.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String Formulario(RequisicaoNovoPedido requisicao) {
		return "pedido/formulario";
	}
	
	
	@PostMapping("novo")
	public String novo( @Valid RequisicaoNovoPedido requisicaoNovoPedido, BindingResult result) {
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = requisicaoNovoPedido.toPedido();
		pedidoRepository.save(pedido);
		requisicaoNovoPedido = new RequisicaoNovoPedido();
		return "redirect:/home";
		
	}
}
