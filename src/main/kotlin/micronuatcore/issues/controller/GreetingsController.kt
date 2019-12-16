package micronuatcore.issues.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import micronuatcore.issues.api.Greeting

@Controller("/greeting")
class GreetingsController {

    @Post
    fun index(): Greeting {
        return Greeting(1, "Hello World", null)
    }
}