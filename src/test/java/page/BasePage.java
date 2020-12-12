package page;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.After;
import org.junit.Before;

public class BasePage {
    protected RequestSpecification requestSpecification;

    @Before

    public void Init() {
        RestAssured.baseURI = "https://rickandmortyapi.com/api/";
    }

    @After
    public void Teardown() {

    }
}
