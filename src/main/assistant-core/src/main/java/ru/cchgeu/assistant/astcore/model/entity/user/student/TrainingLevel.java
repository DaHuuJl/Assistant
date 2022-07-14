package ru.cchgeu.assistant.astcore.model.entity.user.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "STR_TRAINING_LEVEL")
@NoArgsConstructor
@AllArgsConstructor
public class TrainingLevel {
    @Id
    @Column(name = "TRAINING_LEVEL_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "STR_TRAINING_LEVEL_TRAINING_LEVEL_ID_SEQ_GEN")
    @SequenceGenerator(name = "STR_TRAINING_LEVEL_TRAINING_LEVEL_ID_SEQ_GEN",
            sequenceName = "STR_TRAINING_LEVEL_TRAINING_LEVEL_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @OneToMany(mappedBy = "trainingLevel", fetch = FetchType.LAZY)
    private List<Student> studentList;
}
/*
    ACADEMIC_MASTER_DEGREE,                         //Академическая магистратура
    ACADEMIC_BACHELOR_DEGREE,                       //Академический бакалавр
    POSTGRADUATE_STUDY,                             //Аспирантура
    BACHELOR,                                       //Бакалавр
    ADDITIONAL_EDUCATION,                           //Дополнительное образование
    INTERNSHIP,                                     //Интернатура
    MASTER,                                         //Магистр
    RESIDENCY,                                      //Ординатура
    APPLIED_MASTER_DEGREE,                          //Прикладная магистратура
    APPLIED_BACHELOR_DEGREE,                        //Прикладной бакалавр
    SPECIALIST,                                     //Специалист
    SECONDARY_VOCATIONAL                            //Среднее профессиональное
 */
