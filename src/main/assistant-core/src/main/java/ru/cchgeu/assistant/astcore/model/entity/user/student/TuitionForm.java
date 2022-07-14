package ru.cchgeu.assistant.astcore.model.entity.user.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "STR_TUITION_FORM")
@NoArgsConstructor
@AllArgsConstructor
public class TuitionForm {
    @Id
    @Column(name = "TUITION_FORM_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "STR_TUITION_FORM_TUITION_FORM_ID_SEQ_GEN")
    @SequenceGenerator(name = "STR_TUITION_FORM_TUITION_FORM_ID_SEQ_GEN",
            sequenceName = "STR_TUITION_FORM_TUITION_FORM_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @OneToMany(mappedBy = "tuitionForm", fetch = FetchType.LAZY)
    private List<Student> studentList;
}
/*
    FULL_TIME_TUITION,                              //Очное обучение
    DISTANCE_TUITION,                               //Заочное обучение
    MIXED_TUITION                                   //Очно-заочное обучение
 */
