package ru.cchgeu.assistant.astcore.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cchgeu.assistant.astcore.model.entity.structure.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}
