package dev.smarthomelab.minhas.listas.datasources.services.data.model

import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity(name = "lista")
class ListaDB (
    id: UUID? = null
): AssignedIdBaseEntity(id) {

    lateinit var nome: String

    @OneToMany
    lateinit var itens: MutableList<ItemDB>

    val dataCriado: LocalDateTime = LocalDateTime.now()

    var dataAtualizado: LocalDateTime = LocalDateTime.now()

}