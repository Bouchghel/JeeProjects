package ma.emsi.patientsmvc;

import ma.emsi.patientsmvc.entities.Patient;
import ma.emsi.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null, "ayoub", new Date(), false,27));
            patientRepository.save(new Patient(null, "aymen", new Date(), true,300));
            patientRepository.save(new Patient(null, "Lamia", new Date(), false,125));
            patientRepository.save(new Patient(null, "kamal", new Date(), true,200));

            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
}
