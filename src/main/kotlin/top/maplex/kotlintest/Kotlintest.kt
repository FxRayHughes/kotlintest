package top.maplex.kotlintest

import ink.ptms.chemdah.api.ChemdahAPI
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object Kotlintest : Plugin() {


    override fun onEnable() {
        info("Successfully running kotlintest!")

        ChemdahAPI.questTemplate.forEach{ template->

        }
    }
}