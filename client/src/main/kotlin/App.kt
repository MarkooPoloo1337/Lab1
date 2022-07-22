import kotlinx.browser.document
import react.dom.h1
import react.dom.render
import ru.altmanea.edu.server.model.Student

val student  = Student("Sheldon", "Cooper", "29m")

fun main() {
    render(document.getElementById("root")!!){
        h1 { +"Hello, ${student.NewView}" }
    }
}

 