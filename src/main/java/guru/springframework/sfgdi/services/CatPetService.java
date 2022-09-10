package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile("cat")
@Service
public class CatPetService implements PetService {
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
