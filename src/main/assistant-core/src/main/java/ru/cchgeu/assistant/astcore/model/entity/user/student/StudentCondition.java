package ru.cchgeu.assistant.astcore.model.entity.user.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "STR_STUDENT_CONDITION")
@NoArgsConstructor
@AllArgsConstructor
public class StudentCondition {
    @Id
    @Column(name = "STUDENT_CONDITION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "STR_STUDENT_CONDITION_STUDENT_CONDITION_ID_SEQ_GEN")
    @SequenceGenerator(name = "STR_STUDENT_CONDITION_STUDENT_CONDITION_ID_SEQ_GEN",
            sequenceName = "STR_STUDENT_CONDITION_STUDENT_CONDITION_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @OneToMany(mappedBy = "studentCondition", fetch = FetchType.LAZY)
    private List<Student> studentList;
}

/*
    IS_STUDENT,                                     //Является студентом
    IS_APPLICANT,                                   //Является соискателем
    IS_LISTENER,                                    //Является слушателем
    IS_DOCTORAL_STUDENT,                            //Является докторантом
    IS_GRADUATE,                                    //Является выпускником
    IS_GRADUATE_STUDENT,                            //Является аспирантом
    IS_ACADEMIC_LEAVE,                              //Находится в академическом отпуске
    EXPELLED,                                       //Отчислен
    DEBTOR,                                         //Задолжник
    GRADEBOOK_IS_CLOSED                             //Зачётная книжка закрыта
 */
