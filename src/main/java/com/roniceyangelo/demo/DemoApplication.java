package com.roniceyangelo.demo;

import com.roniceyangelo.demo.domain.Livro;
import com.roniceyangelo.demo.domain.Mouse;
import com.roniceyangelo.demo.domain.Produto;
import com.roniceyangelo.demo.domain.Teclado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		List<Produto> carrinho = new ArrayList<>();

		Produto produto = new Produto();
		produto.setDescricao("Produto de informática");
		carrinho.add(produto);

		Teclado teclado = new Teclado("Teclado Mecânico switch blue","Redragon");
		teclado.setPreco(350);
		teclado.setNomeLoja("Brasil info");
		teclado.getDescricao();
		carrinho.add(teclado);

		Mouse mouse = new Mouse("Mouse ótico 2500 dpi", "Mouse Gamer Redragon");
		mouse.setPreco(1500);
		mouse.setNomeLoja("Brasil Info");
		carrinho.add(mouse);

		Livro livro = new Livro("A arte de ter Razão"," Arthur");
		livro.setNomeLoja("Livro Brasa");
		livro.setPreco(65);
		carrinho.add(livro);

		System.out.println(produto.getDescricao());
		System.out.println("---------------------------------------------------");
		System.out.println(mouse.getDescricao() + ", Preço: " + mouse.getPreco());
		System.out.println(teclado.getDescricao() + ", Preço: " + teclado.getPreco());
		System.out.println(livro.getDescricao() + ", Preco: " + livro.getPreco());
		System.out.println(carrinho);
		SpringApplication.run(DemoApplication.class, args);
	}

}
