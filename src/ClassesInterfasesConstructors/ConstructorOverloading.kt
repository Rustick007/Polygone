package ClassesInterfasesConstructors


import java.time.Instant
import javax.lang.model.element.Name

class ConstructorOverloading {
}

class Person(val name: String, val registered: Instant = Instant.now())


class Person1(val name: String, val registered: Instant = Instant.now()){
    constructor(name: Name) :this(name.toString())

}