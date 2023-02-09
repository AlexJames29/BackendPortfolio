package backendportfolio.example.backendfortfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String greetings;
    @Column
    private String name;
    @Column
    private String occupation;
    @Column
    private String achievements;
    @Column
    private String launch;

}
