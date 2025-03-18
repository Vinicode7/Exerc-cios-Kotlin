/*61 Crie um programa que mostre na tela a seguinte contagem,
usando a estrutura “faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */

fun tabuada3(a: Int): Unit{
    for (i in 0..10){
        var mult = a*i
        println("3 x $i = $mult")
    };
}

fun main(){
    tabuada3(3)
}

/*62 • Faça um programa usando a estrutura “faça enquanto” que leia a
idade de várias pessoas. A cada laço, você deverá perguntar para o
usuário se ele quer ou não continuar a digitar dados. No final,
quando o usuário decidir parar, mostre na tela:
• Quantas idades foram digitadas
• Qual é a média entre as idades digitadas
• Quantas pessoas tem 21 anos ou mais.
 */

fun main(){
    var totalIdades = 0
    var somaIdades = 0
    var maiores21 = 0
    var continuar: String

    do {
        print("Digite uma idade: ")
        val idade = readln().toInt()

        somaIdades += idade
        totalIdades++

        if (idade >= 21){
            maiores21++
        }

        print("Deseja Continuar? S/N: ");
        continuar = readln().trim().lowercase()

    } while (continuar == "s")

    if (totalIdades > 0) {
        val mediaIdades = somaIdades.toDouble() / totalIdades
        println("\nResultados")
        println("Total de idades digitadas: $totalIdades")
        println("Média das idades: %.2f" .format(mediaIdades))
        println("Pessoas com 21 anos ou mais: $maiores21")
    } else{
        println("Nenhuma Idade foi digitada")
    }


}

/*63 Crie um programa usando a estrutura “faça enquanto” que leia
vários números. A cada laço, pergunte se o usuário quer continuar
ou não. No final, mostre na tela:
• O somatório entre todos os valores
• Qual foi o menor valor digitado
• A média entre todos os valores
• Quantos valores são pares*/

fun main() {
    var totalNumeros = 0
    var somaNumeros = 0
    var menor: Int? = null
    var pares = 0
    var continuar: String

    do {
        print("Digite uma numero: ")
        val numero = readln().toInt()

        somaNumeros += numero
        totalNumeros++


        if (numero % 2 == 0) {
            pares++
        }

        if (menor == null || numero < menor) {
            menor = numero
        }

        print("Deseja Continuar? S/N: ");
        continuar = readln().trim().lowercase()

    } while (continuar == "s")

    if (totalNumeros > 0) {
        val mediaIdades = somaNumeros.toDouble() / totalNumeros
        println("\nResultados")
        println("Total de somatoria do numeros digitadas: $somaNumeros")
        println("O menor valor digitado foi: $menor")
        println("Média dos numeros: %.2f".format(mediaIdades))
        println("quantidade de numeros pares digitado: $pares")
    } else {
        println("Nenhuma numero foi digitada")
    }

}

/*64 Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

0 5 10 15 20 25 30 35 40 Acabou!*/

fun main(){
    var numero = 0
    for (i in 1..19) {
        println("$numero")
        numero += 5
    }
}

/*65 Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

100 90 80 70 60 50 40 30 20 10 0 Acabou!*/

fun main(){
    for (i in 100 downTo 0 step 10){
        println("$i")
    }
}

/*66 Escreva um programa que leia um número qualquer e mostre a
tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5*/

fun main(){
    print("Digite um numero: ")
    val numero = readln().toInt()
    for (i in 1..10){
        val mult = i * numero
        println("$i * $numero = $mult")
    }
}

/*67 Faça um programa usando a estrutura “para” que leia um
número inteiro positivo e mostre na tela uma contagem de 0
até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/

fun main(){
    print("Digite um numero: ")
    val numero = readln().toInt()
    for (i in 1..numero){
        println("$i")
    }
}

/*68 Crie um programa que leia sexo e peso de 8 pessoas,
usando a estrutura “para”. No final, mostre na tela:
• Quantas mulheres foram cadastradas
• Quantos homens pesam mais de 100Kg
• A média de peso entre as mulheres
• O maior peso entre os homens*/

fun main() {
    var mulheres = 0
    var homensAcima100kg = 0
    var somaPesoMulheres = 0.0
    var totalMulheres = 0
    var maiorPesoHomem = 0.0

    for (i in 1..8) {
        print("Pessoa $i - Digite o sexo (M/F): ")
        val sexo = readln().trim().uppercase()

        print("Pessoa $i - Digite o peso (kg): ")
        val peso = readln().toDoubleOrNull()

        if (peso == null || (sexo != "M" && sexo != "F")) {
            println("Entrada inválida. Tente novamente.")
            continue // Se houver entrada inválida, repete a iteração
        }

        if (sexo == "F") {
            mulheres++
            somaPesoMulheres += peso
            totalMulheres++
        } else if (sexo == "M") {
            if (peso > 100) {
                homensAcima100kg++
            }
            if (peso > maiorPesoHomem) {
                maiorPesoHomem = peso
            }
        }
    }

    val mediaPesoMulheres = if (totalMulheres > 0) somaPesoMulheres / totalMulheres else 0.0

    println("\nResultados:")
    println("🔹 Quantidade de mulheres cadastradas: $mulheres")
    println("🔹 Homens com mais de 100kg: $homensAcima100kg")
    println("🔹 Média de peso entre as mulheres: %.2f kg".format(mediaPesoMulheres))
    println("🔹 Maior peso entre os homens: %.2f kg".format(maiorPesoHomem))
}

/* 69 Desenvolva um programa que leia o primeiro termo e a
razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da
sequência.*/

fun ProgressaoAritmetica(primeiroTermo: Int, razao: Int) {
    var termo = primeiroTermo
    var soma = 0

    print("PA: ")
    for (i in 1..10) {
        print("$termo >> ")
        soma += termo
        termo += razao
    }
    print("FIM")
    println("\nSoma dos termos: $soma")
}

fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    ProgressaoAritmetica(primeiroTermo, razao)
}

/*70 Faça um programa que mostre os 10 primeiros elementos
da Sequência de Fibonacci*/

fun FibonacciList() {
    var primeiro = 1
    var segundo = 1

    print("Sequência de Fibonacci: ")
    print("$primeiro $segundo")

    for (i in 3..10) {
        val proximo = primeiro + segundo
        print(" $proximo")
        primeiro = segundo
        segundo = proximo
    }
    println()
}

fun main() {
    FibonacciList()
}