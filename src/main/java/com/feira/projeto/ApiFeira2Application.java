package com.feira.projeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.feira.projeto.domain.Barraca;
import com.feira.projeto.domain.Categoria;
import com.feira.projeto.domain.Produto;
import com.feira.projeto.repositories.BarracaRepository;
import com.feira.projeto.repositories.CategoriaRepository;
import com.feira.projeto.repositories.ProdutoRepository;

@SpringBootApplication
public class ApiFeira2Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private BarracaRepository barracaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFeira2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		Categoria cat1 = new Categoria(null, "Frutas");
		Categoria cat2 = new Categoria(null, "Legumes");
		Categoria cat3 = new Categoria(null, "Pasteis");
		
		Produto p1 = new Produto(null, "Uva", 4.50, 12);
		Produto p2 = new Produto(null, "Pastel de frango", 6.20, 15);
		Produto p3 = new Produto(null, "Maça", 4.80, 18);
		Produto p4 = new Produto(null, "Beterraba", 7.20, 22);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2));
		cat2.getProdutos().addAll(Arrays.asList(p4));
		cat3.getProdutos().addAll(Arrays.asList(p3)); 
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat3));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		
		
		Barraca bar1 = new Barraca(null, "Tia da feira");
		Barraca bar2 = new Barraca(null, "Seu Pastel");
		
		cat1.getBarracas().addAll(Arrays.asList(bar1));
		cat2.getBarracas().addAll(Arrays.asList(bar1));
		cat3.getBarracas().addAll(Arrays.asList(bar2));
		
		bar1.getCategorias().addAll(Arrays.asList(cat1, cat2));
		bar2.getCategorias().addAll(Arrays.asList(cat3));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		barracaRepository.saveAll(Arrays.asList(bar1, bar2));
		
	}

}
