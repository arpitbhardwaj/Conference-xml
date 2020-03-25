import com.ab.service.SpeakerService;
import com.ab.service.SpeakerServiceImpl;

/**
 * @author Arpit Bhardwaj
 */
public class Application {

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
