package ru.cchgeu.assistant.astcore.model.entity.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.assistant.astcore.model.entity.event.Event;
import ru.cchgeu.assistant.astcore.model.entity.event.EventUserRegistration;
import ru.cchgeu.assistant.astcore.model.entity.user.employee.Employee;
import ru.cchgeu.assistant.astcore.model.entity.user.student.Student;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "SEC_USER")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "USER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SEC_USER_USER_ID_SEQ_GEN")
    @SequenceGenerator(name = "SEC_USER_USER_ID_SEQ_GEN",
            sequenceName = "SEC_USER_USER_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "PATRONYMIC", nullable = true)
    private String patronymic;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    private Employee employeeVersion;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    private Student studentVersion;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<Event> eventList;

    @OneToMany(mappedBy = "participant", fetch = FetchType.LAZY)
    private List<EventUserRegistration> eventUserRegistrationList;
}
