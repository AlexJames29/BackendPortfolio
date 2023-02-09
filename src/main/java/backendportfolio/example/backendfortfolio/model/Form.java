package backendportfolio.example.backendfortfolio.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "forms")
public class Form {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String email;
    @Column
    private String number;
    @Column
    private String details;
    @Column
    private String submit;




}
