package apitesting;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class UploadFile {

    RequestSpecification specification;
    String token;
    @BeforeTest
    public void setup(){
        RequestSpecBuilder specBuilder = new RequestSpecBuilder();
        specBuilder.setBaseUri("https://upload.uploadcare.com");
//        specBuilder.setContentType(ContentType.MULTIPART);
        specification = specBuilder.build();
    }

    @Test
    public void getAuth(){

         RestAssured.given().spec(specification).multiPart("UPLOADCARE_PUB_KEY", "eb8561aec90a79db99fc")
                .multiPart("UPLOADCARE_STORE", "auto")
                .multiPart("file", new File("/home/user/Pictures/Screenshot from 2025-07-01 12-23-24.png"))
                .when().post("/base/").then().log().all().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""));
//        System.out.println(response.asString());
    }
}
