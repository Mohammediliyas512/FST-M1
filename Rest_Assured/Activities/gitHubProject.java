package Projects;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class gitHubProject {
    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAII1E7FvKP69uwhMPFnJ9RG1jMbkIobq18pePDhY5hd5C";
    int sshKeyId;
    //Request Specification
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com/user/keys")
                .addHeader("Authorization", "token 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")
                .addHeader("Content-Type", "application/json")
                .build();
        //Response Specification
        ResponseSpecification responseSpec = new ResponseSpecBuilder()
                .expectResponseTime(lessThan(500L))
                .expectBody("key", equalTo(sshKey))
                .expectBody("title", equalTo("TestKey"))
                .build();

    @Test(priority = 1)
    public void postRequestTest() {
        //Request body
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key",sshKey );
        //Generate Response
        Response response = given().spec(requestSpec).body(reqBody).when().post();
        //Extract the ID
        sshKeyId = response.then().extract().path("id");
        System.out.println(sshKeyId);
        response.then().statusCode(201).spec(responseSpec);
    }
    @Test(priority = 2)
    public void getTest(){
        //path:https://api.github.com/user/keys/{keyId}
        //Generate response and assert
        given().spec(requestSpec).pathParams("keyId",sshKeyId)
                .when().get("/{keyId}")
                .then().statusCode(200).spec(responseSpec);

    }
    @Test(priority = 3)
    public void delete(){
        //path:https://api.github.com/user/keys/{keyId}
        //Generate response and assert
        given().spec(requestSpec).pathParams("keyId",sshKeyId)
                .when().delete("/{keyId}")
                .then().statusCode(anyOf(is(200),is(204))).time(lessThan(300L));
    }

}
