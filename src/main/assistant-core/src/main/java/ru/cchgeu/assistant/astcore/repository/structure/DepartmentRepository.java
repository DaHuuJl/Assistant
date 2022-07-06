package ru.cchgeu.assistant.astcore.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cchgeu.assistant.astcore.model.entity.structure.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
