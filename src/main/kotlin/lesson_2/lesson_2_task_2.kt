package lesson_2

fun main() {
    val salaryWorkers = 30000
    val salaryTrainees = 20000
    val workers = 50
    val trainees = 30
    val expensesWorkers = salaryWorkers * workers
    val expensesTrainees = salaryTrainees * trainees
    val generalExpenses = expensesTrainees + expensesWorkers
    val averageSalary = generalExpenses / 80
    println("Расходы на выплату постоянных сотрудников: $expensesWorkers rub")
    println("Общие расходы по ЗП после прихода стажеров: $generalExpenses rub")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary rub в месяц")
}
