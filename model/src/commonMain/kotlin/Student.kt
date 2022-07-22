package ru.altmanea.edu.server.model

import kotlinx.serialization.*

@Serializable
class Student(
    val firstname: String,
    val surname: String,
    val group : String
) {
    val fullname: String
        get() = "$firstname $surname $group "
    val NewView : String
        get () = "$firstname $surname $group"
}