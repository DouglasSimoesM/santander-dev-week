package santander.santander_dev_week.service;

import org.springframework.stereotype.Service;
import santander.santander_dev_week.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
