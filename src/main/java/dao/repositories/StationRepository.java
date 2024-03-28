package dao.repositories;

@Repository
public interface StationRepository extends JpaRepository<Station, UUID> {
    @Query("SELECT s FROM Station s WHERE s.type = :type AND s.building.city = :city")
    List<Station> findByTypeAndCity(@Param("type") StationType type, @Param("city") String city);


    List<Station> findAll();
}
