import io.ktor.application.*
import io.ktor.routing.*
import io.ktor.server.cio.*
import org.kodein.di.generic.instance
import org.kodein.di.ktor.kodein
import route.V1

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module(testing: Boolean = false) {
    println(testing)

    install(Routing) {
        val routingV1 by kodein().instance<V1>()
        routingV1.setup(this)
    }
}