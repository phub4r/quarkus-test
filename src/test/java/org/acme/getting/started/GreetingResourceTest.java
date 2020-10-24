package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    private Point point;

    @Test
    public void testHelloEndpoint() {
        point = Point.builder()
                .x(42)
                .y(1337)
                .build();

        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("FAILED hello my friend, x: " + point.getX() ));
    }

}
