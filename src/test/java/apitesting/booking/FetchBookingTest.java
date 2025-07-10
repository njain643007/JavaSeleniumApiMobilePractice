package apitesting.booking;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

public class FetchBookingTest {
    RequestSpecification specification;
    @BeforeTest
    public void setup() throws URISyntaxException {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RequestSpecBuilder specBuilder = new RequestSpecBuilder();
//        specBuilder.setAccept(ContentType.JSON);
        specBuilder.setContentType(ContentType.JSON);
        specification = specBuilder.build();
    }

    @Test
    public void getBookingWithCorrectId(){
        Response response = RestAssured.given().log().all().spec(specification)
                .when().get("/booking/1").then().assertThat().statusCode(200).extract().response();
        System.out.println(response.asString());
    }
}
