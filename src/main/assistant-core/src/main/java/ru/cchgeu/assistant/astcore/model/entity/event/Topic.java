package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "EVN_TOPIC")
@NoArgsConstructor
public class Topic {
    @Id
    @Column(name = "TOPIC_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_TOPIC_TOPIC_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_TOPIC_TOPIC_ID_SEQ_GEN",
            sequenceName = "EVN_TOPIC_TOPIC_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = true)
    private String title;

    @OneToMany(mappedBy = "topic", fetch = FetchType.LAZY)
    private List<EventTopic> eventTopicList;
}
