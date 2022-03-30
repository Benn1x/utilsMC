package com.daskju.utilsMC.AuthAPI

import com.daskju.utilsMC.logger.Logger

class Main {
    fun Main(){
        ServicesOnline()
    }
    fun ServicesOnline(){
        val online: Boolean = OnlineCheck().Main()
        if(online == true){
            val msg = "Mojang Auth Services Are Online"
            Logger().LoggingInfo(msg)
            println(msg)
        }
        if(online == false){
            val msg = "The Mojang Auth Servers Are Offline"
            Logger().LoggingWarning(msg)
            println(msg)
        }
    }
}