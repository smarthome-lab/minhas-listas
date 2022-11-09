package dev.smarthomelab.minhas.listas.entities.domain

import java.util.UUID

data class Lista (
    val nome: String,
    val itens: MutableList<Item> = mutableListOf()
) {

    var id: UUID? = null

    constructor(
        id: UUID,
        nome: String,
        itens: MutableList<Item>
    ) : this(nome, itens) {
        this.id = id
    }

}