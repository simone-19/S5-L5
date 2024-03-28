package entities;


import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "buildings")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "BuildingBuilder")
public class Building {
    @OneToMany(mappedBy = "building")
    List<Station> stations;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;
    private String name;
    private String address;
    private String city;
}
