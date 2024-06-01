import com.pluralsight.spring3.repository.MockSpeakerRepositoryImpl;
import com.pluralsight.spring3.repository.SpeakerRespository;
import com.pluralsight.spring3.service.SpeakerService;
import com.pluralsight.spring3.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name="speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
//        return new SpeakerServiceImpl(getSpeakerRepository());
        return new SpeakerServiceImpl();
    }
     */

    /*
    @Bean(name="speakerRepository")
    public SpeakerRespository getSpeakerRepository() {
        return new MockSpeakerRepositoryImpl();
    }*/
}
