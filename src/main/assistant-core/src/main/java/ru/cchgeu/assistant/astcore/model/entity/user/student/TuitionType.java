package ru.cchgeu.assistant.astcore.model.entity.user.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "STR_TUITION_TYPE")
@NoArgsConstructor
@AllArgsConstructor
public class TuitionType {
    @Id
    @Column(name = "TUITION_TYPE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "STR_TUITION_TYPE_TUITION_TYPE_ID_SEQ_GEN")
    @SequenceGenerator(name = "STR_TUITION_TYPE_TUITION_TYPE_ID_SEQ_GEN",
            sequenceName = "STR_TUITION_TYPE_TUITION_TYPE_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @OneToMany(mappedBy = "tuitionType", fetch = FetchType.LAZY)
    private List<Student> studentList;
}
/*
    BUDGET,                                         //Бюджет
    COMMERCE,                                       //Контракт (полное возмещение затрат)
    TARGET,                                         //Целевое
    INTERNATIONAL_AGREEMENT                         //Международный договор
 */
