package methods;

import io.restassured.response.Response;
import model.CharacterModel.AllCharacter;
import model.CharacterModel.Character;
import page.BasePage;

import static io.restassured.RestAssured.*;

public class CharacterMethods extends BasePage
{
    public Character getSpesificCharacter(int characterNumber){
        Response response = when()
                .get("character/"+characterNumber)
                .then()
                .statusCode(200)
                .extract()
                .response();

        Character responseBody = response.getBody().as(Character.class);
        return responseBody;
    }

    public AllCharacter getAllCharacter(){

        Response response = when()
                .get("character")
                .then()
                .statusCode(200)
                .extract()
                .response();

        AllCharacter responseBody = response.getBody().as(AllCharacter.class);
        return responseBody;
    }

    public Character getMultipleCharacter(String characterNumber){
        Response response = when()
                .get("character/"+characterNumber)
                .then()
                .statusCode(200)
                .extract()
                .response();

        Character responseBody = response.getBody().as(Character.class);
        return responseBody;
    }

    public AllCharacter searchCharacterWithParameter(String name,String status, String species,String type,String gender){
        Response response =
                given()
                        .queryParam("name",name)
                        .queryParam("status",status)
                        .queryParam("species",species)
                        .queryParam("type",type)
                        .queryParam("gender",gender)
                .when()
                .get("character")
                .then()
                .statusCode(200)
                .extract()
                .response();

        AllCharacter responseBody = response.getBody().as(AllCharacter.class);
        return responseBody;
    }

}
