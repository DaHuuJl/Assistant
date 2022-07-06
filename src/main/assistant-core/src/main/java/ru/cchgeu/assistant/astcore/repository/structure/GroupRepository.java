package ru.cchgeu.assistant.astcore.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cchgeu.assistant.astcore.model.entity.structure.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
