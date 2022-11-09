package dev.smarthomelab.minhas.listas.entities.utils

import org.slf4j.Logger
import org.slf4j.LoggerFactory

public inline fun <reified T> logger(): Logger = LoggerFactory.getLogger(T::class.java.name)