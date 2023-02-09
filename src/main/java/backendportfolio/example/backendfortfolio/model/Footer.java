package backendportfolio.example.backendfortfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "footers")
public class Footer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String phonenumber;

    @Column
    private String email;

    @Column
    private String aboutme;

    @Column
    private String sentenceaboutme;



}


