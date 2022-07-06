package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "EVN_EVENT_LECTURER")
@NoArgsConstructor
@AllArgsConstructor
public class EventLecturer {
    @Id
    @Column(name = "EVENT_LECTURER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_EVENT_LECTURER_EVENT_LECTURER_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_EVENT_LECTURER_EVENT_LECTURER_ID_SEQ_GEN",
            sequenceName = "EVN_EVENT_LECTURER_EVENT_LECTURER_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @Column(name = "POST", nullable = true)
    private String post;

    @Column(name = "PREVIEW", nullable = true)
    private String preview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event event;
}
