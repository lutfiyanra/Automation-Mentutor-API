package starter.Mentutor.loginMentee;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class MenteeAPI {

    public static final String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR + "/src/test/resources/JSON/RequestBody";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema";
    public static String ATTACHMENTS = DIR+"/src/test/resources/Attachment";

    public static final String BEARER_TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZENsYXNzIjoyNSwiYXV0aG9yaXplZCI6dHJ1ZSwiZXhwIjoxNjcwMDY0MTMzLCJyb2xlIjoibWVudGVlIiwidXNlcklkIjo2Mn0.FOF3OBrC0gtNjfdf6kD0g23EAjrpBt0tqx71MF8TWmE";
    public static String LOGIN = URL + "/login";

    public static String GET_ALL_USER = URL +"/admin/users";
    //    public static String ID = "data.id";
    public static String ADMIN_MANAGE_USERS = URL+"/admin/users";
    public static String ADMIN_MANAGE_CLASSES = URL+"/admin/classes";
    public static String ADMIN_MANAGE_USERS_PROFILE = URL + "/admin/users/{id_user}";
    public static String ADMIN_MANAGE_CLASS = URL + "/admin/classes/{id_class}";

    public static String MENTOR_UPDATE_USER = URL + "/users";
    public static String MANAGE_TASK=URL+"/mentors/task";
    public static String MANAGE_SPECIFIC_TASK_ID = URL+"/mentors/task/{id_task}";
    public static String MENTOR_MANAGE_TASK_SCORE = URL+"/mentors/submission/{id_submission}";
    public static String MENTOR_ADD_COMMENT=URL+"/forum/{id_status}";

    public static String MENTEE_UPDATE_PROFILE = URL+"/users";
    public static String MENTEE_GET_ALL_TASK = URL+"/mentees/tasks";
    public static String MENTEE_POST_SUBMIT_TASK = URL+"/mentees/submission/{id_task}";
    public static String MENTEE_POST_COMMENT_FORUM = URL+"/forum/{id_status}";

    public static String MANAGE_FORUM = URL+"/forum";

    @Step("Post Login Mentee")
    public void postLoginMentee(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
