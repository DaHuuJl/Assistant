package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "EVN_EVENT_ORGANIZER")
@NoArgsConstructor
@AllArgsConstructor
public class EventOrganizer {
    @Id
    @Column(name = "EVENT_ORGANIZER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_EVENT_ORGANIZER_EVENT_ORGANIZER_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_EVENT_ORGANIZER_EVENT_ORGANIZER_ID_SEQ_GEN",
            sequenceName = "EVN_EVENT_ORGANIZER_EVENT_ORGANIZER_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = true)
    private String title;

    @Column(name = "PREVIEW", nullable = true)
    private String preview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event event;
}
