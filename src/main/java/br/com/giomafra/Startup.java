package br.com.giomafra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Marca a classe como a configuração do Spring, habilita a configuração automatica e
//ativa a varredura de componentes no pacote e sub pacote onde esxtá localizada
@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		//inicializa o contexto da aplicação, configura automaticamente os compónentes necessários ou sobe um servidor como o tomcat
		SpringApplication.run(Startup.class, args);
	}

}
