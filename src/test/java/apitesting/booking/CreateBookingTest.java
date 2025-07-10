package apitesting.booking;

import booking.pojo.BookingDates;
import booking.pojo.CreateBooking;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class CreateBookingTest {
    RequestSpecification specification;
    @BeforeTest
    public void setup() throws URISyntaxException {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RequestSpecBuilder specBuilder = new RequestSpecBuilder();
//        specBuilder.setAccept(ContentType.JSON);
        specBuilder.setContentType(ContentType.JSON);
        specification = specBuilder.build();
    }

    @Test(description = "Positive Scenarios")
    public void createBooking(){
        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2018-01-01");
        bookingDates.setCheckout("2019-01-01");
        CreateBooking createBooking = new CreateBooking();
        createBooking.setFirstname("Jim");
        createBooking.setLastname("Brown");
        createBooking.setTotalprice(111);
        createBooking.setDepositpaid(true);
        createBooking.setBookingdates(bookingDates);
        createBooking.setAdditionalneeds("Breakfast");
        RestAssured.given().log().all().spec(specification).body(createBooking)
                .when().post("/booking").then().log().all().assertThat().statusCode(200);


    }


}
