package entities;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    List<Reservation> reservations;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String userName;
    private String email;


}