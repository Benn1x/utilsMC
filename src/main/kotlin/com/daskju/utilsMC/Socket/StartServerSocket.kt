package com.daskju.utilsMC.Socket

class StartServerSocket {
    fun Main(){
        Thread{ Socket().server() }.start()
        println("utilsMC Version 0.0.0 Startet")
    }
}