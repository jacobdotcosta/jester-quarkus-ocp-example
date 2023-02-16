package org.acme;

import io.jester.api.Jester;
import io.jester.api.Quarkus;
import io.jester.api.RestService;
import io.jester.api.RunOnOpenShift;
import org.apache.http.HttpStatus;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

@Jester
public class GreetingResourceIT  {
    // Execute the same tests but in packaged mode.

    @Quarkus
    static final RestService app = new RestService();

    @Test
    public void shouldPortForHttpBeExposed() {
        app.given().get("/hello").then().statusCode(HttpStatus.SC_OK).body(is(CoreMatchers.is("Hello from RESTEasy Reactive")));
    }

}
