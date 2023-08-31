package lesson_11

class Rooms(
    val cover: String,
    val name: String,
    val listOfParticipants: List<String>,
    val numberRoom: Int,
    var microphone: Boolean = false
) {


    fun backlight() {
        println("Включаем подсветку $listOfParticipants")
    }

    fun information() {
        println(" Комната №$numberRoom:\n1.Обложка: $cover\n2.Название комнаты: $name\n3.Список участников: $listOfParticipants\n4.Микрофон: $microphone")
    }

    fun microphoneOn() {
        println("Микрофон включен")
        microphone = true
    }

    fun microphoneOff() {
        println("Микрофон выключен")
        microphone = false
    }
}

fun main() {

    val oneRoom = Rooms(
        cover = "Img.jpg",
        name = "Знакомства",
        listOfParticipants = listOf("User-1", "User-2", "User-3"),
        numberRoom = 1
    )
    val twoRoom = Rooms(
        cover = "Img.jpg",
        name = "Беседа",
        listOfParticipants = listOf("User-4", "User-5", "User-6"),
        numberRoom = 2
    )
    oneRoom.microphoneOn()
    oneRoom.backlight()
    println()
    oneRoom.information()
    println()

    twoRoom.microphoneOff()
    twoRoom.information()


}