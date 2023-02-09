package backendportfolio.example.backendfortfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "achievements")
public class Achievements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String avatar;

//    @Column
//    private String bestinthesis;
//    @Column
//    private String thesisdescription;
//    @Column
//    private String ciscocertified;
//    @Column
//    private String ciscodescription;

}
