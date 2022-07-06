package ru.cchgeu.assistant.astcore.model.entity.study;

/*
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.electronicassistantbackend.model.entity.user.Student;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "STD_GRADEBOOK")
@NoArgsConstructor*/
public class Gradebook {
/*    @Id
    @Column(name = "GRADEBOOK_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "STD_GRADEBOOK_GRADEBOOK_ID_SEQ_GEN")
    @SequenceGenerator(name = "STD_GRADEBOOK_GRADEBOOK_ID_SEQ_GEN",
            sequenceName = "STD_GRADEBOOK_GRADEBOOK_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "GRADEBOOK_NUMBER", nullable = false)
    private String gradebookNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID", nullable = false)
    private Student student;

    @OneToMany(mappedBy ="gradebook", fetch = FetchType.LAZY)
    private List<SemesterInformation> semesterInformationList;*/
}
