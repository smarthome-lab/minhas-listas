package dev.smarthomelab.minhas.listas.datasources.services.data.model

import java.util.*

class ItemDB (
    id: UUID? = null
): AssignedIdBaseEntity(id) {

    lateinit var conteudo: String

}