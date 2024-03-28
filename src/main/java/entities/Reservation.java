package entities;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table (name="reservations")
@Getter
@Setter
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate date;

}
