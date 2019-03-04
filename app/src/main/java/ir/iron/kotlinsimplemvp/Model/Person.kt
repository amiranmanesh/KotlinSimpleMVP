package ir.iron.kotlinsimplemvp.Model

class Person {
    var firstName: String? = null
    var lastName: String? = null

    val name: String
        get() = "$firstName $lastName"

    constructor() {}

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }
}