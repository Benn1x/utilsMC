package com.daskju.utilsMC.logger

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class Logger {
    private val LOGGER: Logger? = LogManager.getLogger()
    fun LoggingWarning(msg:String){
        LOGGER?.log(Level.WARN, msg)
    }
    fun LoggingInfo(msg: String){
        LOGGER?.log(Level.INFO, msg)
    }
    fun LoggingError(msg: String){
        LOGGER?.log(Level.ERROR, msg)
    }
    fun LoggingDebug(msg: String){
        LOGGER?.log(Level.DEBUG, msg)
    }
    fun Log(level: Level, msg: String){
        LOGGER?.log(level,msg)
    }
}