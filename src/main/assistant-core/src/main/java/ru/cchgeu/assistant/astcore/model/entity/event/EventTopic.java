package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "EVN_EVENT_TOPIC")
@NoArgsConstructor
public class EventTopic {

    @Id
    @Column(name = "EVENT_TOPIC_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_EVENT_TOPIC_EVENT_TOPIC_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_EVENT_TOPIC_EVENT_TOPIC_ID_SEQ_GEN",
            sequenceName = "EVN_EVENT_TOPIC_EVENT_TOPIC_ID_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOPIC_ID", nullable = false)
    private Topic topic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event event;
}
