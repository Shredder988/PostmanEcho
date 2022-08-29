import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostmanEchoTest1 {
    @Test
    void shouldReturnBody(){
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body"))
        ;
    }
}