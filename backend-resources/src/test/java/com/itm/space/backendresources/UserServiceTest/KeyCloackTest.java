package com.itm.space.backendresources.UserServiceTest;

import com.github.database.rider.core.api.dataset.DataSet;
import com.itm.space.backendresources.BaseIntegrationTest;
import com.itm.space.backendresources.api.request.UserRequest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import java.net.URI;

//@WithMockUser(username = "admin", password = "admin", authorities = "ROLE_MODERATOR")
public class KeyCloackTest extends BaseIntegrationTest {
//    @Autowired
//    private UserService userService;



    @Test
    @DataSet(value = {"datasets/groups.yml",
            "datasets/roles.yml"},
            cleanAfter = true, cleanBefore = true)
    public void createUserTest() throws Exception {
        UserRequest userRequest = new UserRequest("user", "asdfgh@mail.com", "12345", "John", "Doe");
//        userService.createUser(userRequest);

        Response response = Response.status(Response.Status.CREATED).location(new URI("user_id")).build();

    }

}