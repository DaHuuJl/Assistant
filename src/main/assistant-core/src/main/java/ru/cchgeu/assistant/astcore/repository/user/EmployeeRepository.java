package ru.cchgeu.assistant.astcore.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cchgeu.assistant.astcore.model.entity.user.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
