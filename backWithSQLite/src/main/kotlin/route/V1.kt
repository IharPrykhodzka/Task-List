package route

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import service.UserService

fun Routing.v1() {
    
    route("/get-all-users") { 
        //       val repo by kodein().instance<PostRepository>()
        
        get {
            val response = UserService.getAll()
            call.respond(response)
        }
    }
}