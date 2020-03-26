import com.ab.model.Speaker;
import com.ab.repository.HibernateSpeakerRepositoryImpl;
import com.ab.repository.SpeakerRepository;
import com.ab.service.SpeakerService;
import com.ab.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Arpit Bhardwaj
 *
 * In this Spring Java Based Configuration, you will be learning about some Java-based annotations which will help you configure Spring Beans.
 * Using Java based configuration allows you to write your Spring configuration without using XML
 *
 * Beans are singleton by default
 *
 * @Configuration annotation indicates that Spring IoC container can use it as a source of Beans definitions
 * @Bean tells Spring that method will return an object which should be registered as a bean in Spring application context.
 *
 */


@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        //constructor injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //setter injection
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
