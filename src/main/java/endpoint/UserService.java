package endpoint;

import org.springframework.stereotype.Service;
import ws.User;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    static {

        User peter = new User();
        peter.setEmpId(111);
        peter.setName("Peter");
        peter.setSalary(12000);

        User sam = new User();
        sam.setEmpId(1112);
        sam.setName("sam");
        sam.setSalary(1400);

        User ion = new User();
        ion.setEmpId(1112);
        ion.setName("ion");
        ion.setSalary(13000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ion.getName(), ion);


    }

    public User getUser(String name) {
        return users.get(name);

    }

}
