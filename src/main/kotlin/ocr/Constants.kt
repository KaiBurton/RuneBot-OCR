package ocr

object Constants {

    //Set Enabled Events
    const val trainCombatEventEnabled : Boolean = true
    const val triviaEventEnabled : Boolean = true
    const val mineEventEnabled : Boolean = false
    const val buryEventEnabled : Boolean = false

    //Used in all Events & OCR.kt
    const val discordName = "kai"

    //Used in TrainCombatEvent.kt
    const val combatType = "melee" //NumPad1 = Melee, NumPad2 = Magic, NumPad3 = Ranged
    const val monster = "rock crab"

    //Used in MineEvent.kt
    const val rock = "coal"

    //Used in BuryEvent.kt
    const val bones = "bones"
}