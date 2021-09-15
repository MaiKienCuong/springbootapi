package maikiencuong.springbootapi;

import maikiencuong.springbootapi.entity.Student;
import maikiencuong.springbootapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootapiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootapiApplication.class, args);
    }

    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        studentService.save(Student.builder()
                .firstName("Mai Kiên")
                .lastName("Cường")
                .maLop("DHKTPM14")
                .diemTb(9.0f)
                .dateOfBirth(LocalDate.of(2000, 2, 15))
                .build());

        studentService.save(Student.builder()
                .firstName("Mai Kiên")
                .lastName("Huy")
                .maLop("DHKTPM14")
                .diemTb(8.0f)
                .dateOfBirth(LocalDate.of(2000, 2, 16))
                .build());

        studentService.save(Student.builder()
                .firstName("Mai Kiên")
                .lastName("Dương")
                .maLop("DHKTPM15")
                .diemTb(7.0f)
                .dateOfBirth(LocalDate.of(2000, 2, 17))
                .build());
    }
}
