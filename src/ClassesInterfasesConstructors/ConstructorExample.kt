package ClassesInterfasesConstructors

class ConstructorExample constructor(name: String){
    val name: String

    init{
        this.name=name
    }
}

class ConstructorExample1 constructor(name: String){
    val name: String = name
}

class ConstructorExample2 constructor(val name: String){
    
}

class constructorExample3 (val name: String)