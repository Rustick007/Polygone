package Variants


// ниже использованияе ковариантности
open class  MyClassParent

class MyClass: MyClassParent()

interface Bag<out T>{
    fun get(): T
}

class BagImpl : Bag<MyClass>{
    override fun get(): MyClass = MyClass()

}

val bag: Bag<MyClassParent> = BagImpl()

//ниже использование контрвариантности

open class MyClassParent1

class MyClass1: MyClassParent1()

interface Bag1<in T>{
    fun use(t: T): Boolean
}

class Bag1Impl : Bag1<MyClassParent1> {
    override fun use(t: MyClassParent1): Boolean = true
}

val bag1: Bag1<MyClass1> = Bag1Impl()




