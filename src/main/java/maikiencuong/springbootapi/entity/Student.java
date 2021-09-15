package maikiencuong.springbootapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String maLop;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate dateOfBirth;
    private float diemTb;

}
