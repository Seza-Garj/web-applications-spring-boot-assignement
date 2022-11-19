/*package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.util.Arrays;
import java.util.List;

import static javax.print.attribute.TextSyntax.verify;

public class UserControllerTest {

    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;

    @Test
    public void createUser_UserDetails_Success() throws Exception {
        User user = new User();
        user.setName("test");
        user.setEmail("test@test.com");

        when(userService.create(user)).thenReturn(user);

        mvc.perform(MockMvcRequestBuilders.post("/api/v1/users")
                .content(asJsonString(user))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
    }





    @Test
    public void getAllUsers_UserDetails_Success() throws Exception {
        List<User> list = Arrays.asList(
                new User("1L", "test1", "test1@test.com",1),
                new User("2L", "test2", "test2@test.com",2));

        when(userService.getAll()).thenReturn(list);

        mvc.perform(MockMvcRequestBuilders.get("/api/v1/users")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", equalTo(1)))
                .andExpect(jsonPath("$[0].name", equalTo("test1")))
                .andExpect(jsonPath("$[0].email", equalTo("test1@test.com")))
                .andExpect(jsonPath("$[1].id", equalTo(2)))
                .andExpect(jsonPath("$[1].name", equalTo("test2")))
                .andExpect(jsonPath("$[1].email", equalTo("test2@test.com")));

        verify(userService, times(1)).getAll();
        verifyNoMoreInteractions(userService);
    }

    @Test
    public void getAllUsers_UserDetails_Failure() throws Exception {
        List<User> list = Arrays.asList(
                new User("1L", "test1", "test1@test.com",1),
                new User("2L", "test2", "test2@test.com",2));

        when(userService.getAll()).thenReturn(null);

        mvc.perform(MockMvcRequestBuilders.get("/api/v1/users")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isInternalServerError());

        verify(userService, times(1)).getAll();
        verifyNoMoreInteractions(userService);
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}*/
