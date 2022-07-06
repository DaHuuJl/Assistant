package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.assistant.astcore.model.entity.user.User;


import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "EVN_EVENT")
@NoArgsConstructor
public class Event {
    @Id
    @Column(name = "EVENT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_EVENT_EVENT_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_EVENT_EVENT_ID_SEQ_GEN",
            sequenceName = "EVN_EVENT_EVENT_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "PREVIEW", nullable = true)
    private String preview;

    @Column(name = "IS_ONLINE", nullable = false)
    private boolean isOnline;

    @Column(name = "EVENT_ACCESS_OPEN", nullable = false)
    private boolean eventAccessOpen;

    //TODO: Даты

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CREATOR_ID", nullable = false)
    private User creator;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<EventLecturer> eventLecturerList;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<EventOrganizer> eventOrganizerList;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<EventTopic> eventTopicList;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<EventUserRegistration> eventUserRegistrationList;
}
