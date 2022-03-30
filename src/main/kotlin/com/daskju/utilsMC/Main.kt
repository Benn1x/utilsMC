package com.daskju.utilsMC

import com.daskju.utilsMC.Socket.StartServerSocket
import com.daskju.utilsMC.AuthAPI.Main

fun main(args: Array<String>){
    StartServerSocket().Main()
    Main().ServicesOnline()
}
