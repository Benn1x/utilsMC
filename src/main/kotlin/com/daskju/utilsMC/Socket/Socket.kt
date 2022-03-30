package com.daskju.utilsMC.Socket

import java.net.ServerSocket
import javax.sql.ConnectionEvent
import com.daskju.utilsMC.AuthAPI.Main

class Socket {
    fun server() {
        val server = ServerSocket(9999)
        val client = server.accept()
        Main().Main()

    }
    fun Connection( event: ConnectionEvent){

    }
}