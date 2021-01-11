package gradle.basics.web.app.service;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GreeterService {

    private static final List<String> GREETS = Arrays.asList("Hello", "Hoi", "Hola", "Welcome!", "Nice to see you", "Enjoy", "Hoe gaat het?", "Have a nice life");
    private static final RandomDataGenerator RANDOM_DATA_GENERATOR = new RandomDataGenerator();

    public String getGreet() {
        int randomIndex = RANDOM_DATA_GENERATOR.nextInt(0, GREETS.size() - 1);
        return GREETS.get(randomIndex);
    }

}
