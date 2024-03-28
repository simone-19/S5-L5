package exeptions;

@Component
public class ReservationRunner implements CommandLineRunner {
    @Autowired
    private BuildingDao buildingDao;

    @Override
    public void run(String... args) throws Exception {
        Building building = Building.builder().build();
        buildingDao.save(building);
    }
}
