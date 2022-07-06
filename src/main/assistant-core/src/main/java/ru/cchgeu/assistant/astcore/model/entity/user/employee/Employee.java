package ru.cchgeu.assistant.astcore.model.entity.user.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.assistant.astcore.model.entity.structure.Department;
import ru.cchgeu.assistant.astcore.model.entity.user.User;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "SEC_EMPLOYEE")
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SEC_EMPLOYEE_EMPLOYEE_ID_SEQ_GEN")
    @SequenceGenerator(name = "SEC_EMPLOYEE_EMPLOYEE_ID_SEQ_GEN",
            sequenceName = "SEC_EMPLOYEE_EMPLOYEE_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "POST", nullable = false)
    private String post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = true)
    private User user;
}
