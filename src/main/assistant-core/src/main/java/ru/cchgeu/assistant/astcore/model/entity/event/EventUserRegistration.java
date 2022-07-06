package ru.cchgeu.assistant.astcore.model.entity.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.cchgeu.assistant.astcore.model.entity.user.User;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "EVN_EVENT_USER_REGISTRATION")
@NoArgsConstructor
@AllArgsConstructor
public class EventUserRegistration {
    @Id
    @Column(name = "EVENT_USER_REGISTRATION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "EVN_EVENT_USER_REGISTRATION_EVENT_USER_REGISTRATION_ID_SEQ_GEN")
    @SequenceGenerator(name = "EVN_EVENT_USER_REGISTRATION_EVENT_USER_REGISTRATION_ID_SEQ_GEN",
            sequenceName = "EVN_EVENT_USER_REGISTRATION_EVENT_USER_REGISTRATION_ID_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTICIPANT_ID", nullable = false)
    private User participant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID", nullable = false)
    private Event event;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventUserRequestStatus eventUserRequestStatus;
}
