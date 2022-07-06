package ru.cchgeu.assistant.astcore.repository.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cchgeu.assistant.astcore.model.entity.event.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
