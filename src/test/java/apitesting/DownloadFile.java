package apitesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class DownloadFile {

    public static void main(String ... args) throws IOException {
        String fileUrl = RestAssured.given().multiPart("file", new File("/home/user/Pictures/jd.png"))
                .when().post("https://api.escuelajs.co/api/v1/files/upload")
                .then().assertThat().statusCode(201)
                .extract().response().path("location");
        System.out.println(fileUrl);
        Response response = RestAssured.given().contentType(ContentType.MULTIPART).when().get(fileUrl)
                .then().assertThat().statusCode(200).extract().response();

        // ✅ Convert byte array to image
        byte[] imageBytes = response.asByteArray();
        InputStream inputStream = new ByteArrayInputStream(imageBytes);

        // ✅ Save the image (optional)
        File outputFile = new File("downloaded_image.png");
        OutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(imageBytes);
        outputStream.close();
        System.out.println("✅ Image saved.");

        // ✅ Validate image dimensions
        BufferedImage image = ImageIO.read(inputStream);
        int width = image.getWidth();
        int height = image.getHeight();

        System.out.println("📐 Image Width: " + width);
        System.out.println("📏 Image Height: " + height);

        // Example assertion
        if (width > 0 && height > 0) {
            System.out.println("✅ Image is valid with proper dimensions.");
        } else {
            System.out.println("❌ Invalid image content.");
        }

        }

}
