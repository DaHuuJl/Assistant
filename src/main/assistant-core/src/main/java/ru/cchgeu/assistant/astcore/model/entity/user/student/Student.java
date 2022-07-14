package ru.cchgeu.assistant.astcore.model.entity.user.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.assistant.astcore.model.entity.structure.Group;
import ru.cchgeu.assistant.astcore.model.entity.user.User;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity(name = "SEC_STUDENT")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "STUDENT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SEC_STUDENT_STUDENT_ID_SEQ_GEN")
    @SequenceGenerator(name = "SEC_STUDENT_STUDENT_ID_SEQ_GEN",
            sequenceName = "SEC_STUDENT_STUDENT_ID_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID", nullable = false)
    private Group group;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TUITION_TYPE_ID", nullable = false)
    private TuitionType tuitionType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TUITION_FORM_ID", nullable = false)
    private TuitionForm tuitionForm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TRAINING_LEVEL_ID", nullable = false)
    private TrainingLevel trainingLevel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "STUDENT_CONDITION_ID", nullable = false)
    private StudentCondition studentCondition;

    @Column(name = "START_DATE", nullable = false)
    private Date startDate;

    @Column(name = "END_DATE", nullable = false)
    private Date endDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = true)
    private User user;
}
