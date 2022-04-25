package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.LivreRepository;
import com.example.demo.entities.Livre;

@SpringBootApplication
public class ControleApplication implements CommandLineRunner {
    @Autowired
    private LivreRepository livreRepository ;
	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		DateFormat df1=new SimpleDateFormat("dd/MM/yyyy");
		livreRepository.save(new Livre(true,"wissal", df.parse("12/14/1998"),df1.parse("15/12/1998"), "fffff","maison1",14,"titre"));
		livreRepository.findAll().forEach(c->{
			System.out.print(c.getAuteur());
		});
		
	}

}
