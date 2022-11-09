package dev.smarthomelab.minhas.listas.transportlayers.api

import dev.smarthomelab.minhas.listas.entities.utils.logger

class ListaApi {

    private val logger = logger<ListaApi>()

    public fun buscarListaPorNome(nome : String) {
        logger.info("Buscando lista '{}'", nome)
    }

}