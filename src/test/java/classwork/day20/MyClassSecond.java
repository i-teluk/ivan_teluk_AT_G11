package classwork.day20;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MyClassSecond {
    public static void main(String[] args) {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46:8001/app/ws/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        String str = RestAssured
                .given()
                .spec(requestSpec)
                .body(new Search("", true))
                .when()
                .post()
                .then()
                //.extract().body().as(Search.class)
                .extract().body().asString();
                //.statusCode(300);

        System.out.println(str);
    }
}
