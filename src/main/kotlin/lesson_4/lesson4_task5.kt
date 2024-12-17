package org.example.lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISIONS_MIN = 50

fun main() {
    while (true) {
        println("Корабль имеет повреждения? Введите true или false:")
        val isDamage = readlnOrNull()?.toBooleanStrictOrNull()

        println("Введите количество людей в экипаже:")
        val currentCrew = readlnOrNull()?.toIntOrNull()

        println("Введите количество ящиков с провизией на борту:")
        val countOfProvisions = readlnOrNull()?.toIntOrNull()

        println("Погода благоприятна? Введите true или false:")
        val isFavorableWeather = readlnOrNull()?.toBooleanStrictOrNull()

        if (isDamage == null || currentCrew == null || countOfProvisions == null || isFavorableWeather == null) {
            println("Данные введены не корректно!\n")
        } else {
            if (shipOverview(
                    isDamage,
                    currentCrew,
                    countOfProvisions,
                    isFavorableWeather
                )
            ) println("Корабль может отправиться в плавание.\n")
            else println("Корабль не может отправиться в плавание.\n")
        }
    }
}

fun shipOverview(isDamage: Boolean, crew: Int, provisions: Int, isFavorableWeather: Boolean) = when (isDamage) {
    false -> crew in CREW_MIN..CREW_MAX && provisions > PROVISIONS_MIN
    true -> crew == CREW_MAX && provisions >= PROVISIONS_MIN && isFavorableWeather
}
