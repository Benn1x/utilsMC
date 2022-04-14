package com.daskju.utilsMC.commands

class Version {
    /**
     * gibt die Aktuelle Version des Minecraft Servers wieder
     */
    val version = command {
        this.command = "Version"
        this.aliases = "v"
        this.description = "Zeigt einem die Version an"
        this.perm = "*"
        this.version = "1.18.2"
        this.executor {
            print("Version 0.0.1")
        }
    }
    fun set(){
        version.register()
    }
    fun disable(){
        version.unregister()
    }
}
class plugins{
    /**
     * gibt die Aktiven Plugins wieder
     */
    val plugins = command{
        this.command = "plugins"
        this.aliases = "p"
        this.description = "Zeigt alle Commands"
        this.perm = "*"
        this.version = "1.18.2"
        this.executor {
            print("Der Plugin Manager ist noch nicht integriert!")
        }
    }
    fun set(){
        plugins.register()
    }
    fun disable(){
        plugins.unregister()
    }
}
