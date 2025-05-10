package br.edu.iftm.crud_produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.edu.iftm.crud_produtos.repository")
public class CrudProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProdutosApplication.class, args);
	}

}
