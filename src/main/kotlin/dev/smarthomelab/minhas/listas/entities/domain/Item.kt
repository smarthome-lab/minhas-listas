package dev.smarthomelab.minhas.listas.entities.domain

import java.util.UUID
import javax.persistence.Entity

@Entity(name = "item")
class Item (
    val conteudo: String,
) {

    var id: UUID? = null

    constructor(
        id: UUID,
        conteudo: String
    ) : this(conteudo) {
        this.id = id
    }

}