package starter.Mentutor.loginAdmin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class AdminAPI {

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

    @Step("Post Login User")
    public void postLoginUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get all users with authorization")
    public void getAllUserWithAuthorization(){
        SerenityRest.given().headers("Authorization",BEARER_TOKEN);
    }
//    @Step("Update user with valid data and authorization")
//    public void updateUserWithValidDataAndAuthorization(){
//        SerenityRest.given().multiPart("name", "Ahmad Lutfi acbde")
//                .multiPart("email", "ahmad.mentee@gmail.com")
//                .multiPart("password", "Riza123$")
//                .multiPart("images", new File(ATTACHMENTS+"/download.png"))
//                .multiPart("id_class", 25)
//                .headers("Authorization", BEARER_TOKEN);
}
