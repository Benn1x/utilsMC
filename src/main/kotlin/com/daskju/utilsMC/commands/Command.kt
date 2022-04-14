package com.daskju.utilsMC.commands

import java.util.Collections.list


class COMMAND() {
    /**
     * Die Defenierung
     * von den einzehlen Commands
     * Command Name:
     */
        var command: String = "*"

    /**
     * Beschreibung
     */
    var description: String = "Ein Nix Command"

    /**
     * ein anderen namen den man eingeben kann um den befehl zu starten
     */
    var aliases: String = "nix"

    /**
     * Das Perm Level was man braucht um den Befehl zu benutzen * ist für alle User
     */
    var perm: String = "*"

    /**
     * Die Minecraft Version in der Der Befehl Verwendbar seien Soll
     */
    var version: String = "1.18.2"

    /**
     * Hier rein soll der Code welcher von dem Command ausgeführt werden soll
     */
    inline fun executor(command: () -> Unit){

    }

    /**
     * die Registrierung eines Commands
     */
    fun register() {
        print("Command wurde gestezt")
    }

    /**
     * Damit wird der Befehl wieder entfehrnt
     */
    fun unregister() {
        print("Der Command wurde entfährnt")
    }
}

/**
 * das Lambda zu COMMAND() Welches dem Coder Ermöglicht seinen Code zu schreiben Befehl
 */
fun command(init: COMMAND.() -> Unit): COMMAND {
    val command = COMMAND()  // create the receiver object
    command.init() // pass the receiver object to the lambda
    return command
}


