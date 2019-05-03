package br.edu.uniopet.springfilme;

import br.edu.uniopet.springfilme.domain.Filme;
import br.edu.uniopet.springfilme.reppository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringFilmeApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringFilmeApplication.class, args);
    }


    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public void run(String... args) throws Exception {

        Filme filme1 = new Filme("Vingadores Ultimato", "180", "2019");
        Filme filme2 = new Filme("Pantera Negra", "90", "2018");
        Filme filme3 = new Filme("Vingadores Ultimato", "180", "2019");

        filmeRepository.saveAll(Arrays.asList(filme1, filme2, filme3));

    }
}
