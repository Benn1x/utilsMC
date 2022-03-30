package com.daskju.utilsMC.AuthAPI

import java.net.InetAddress
import java.net.URL

class OnlineCheck {
    fun Main(): Boolean {
        //val Host = URL("authserver.mojang.com").host
        val addr : InetAddress = InetAddress.getByName("authserver.mojang.com")
        val reachTimeout = 10000
        return addr.isReachable(reachTimeout)
    }
}