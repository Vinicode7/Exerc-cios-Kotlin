//31 - [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura).

import kotlin.random.Random

fun main() {
    // Opções do jogo
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    println("Escolha uma opção:")
    println("1 - Pedra")
    println("2 - Papel")
    println("3 - Tesoura")

    val escolhaJogador = readLine()?.toIntOrNull()

    if (escolhaJogador == null || escolhaJogador !in 1..3) {
        println("Escolha inválida. Digite um número de 1 a 3.")
        return
    }

    val escolhaJogadorString = opcoes[escolhaJogador - 1]

    val escolhaComputador = opcoes[Random.nextInt(0, 3)]

    println("Você escolheu: $escolhaJogadorString")
    println("O computador escolheu: $escolhaComputador")

    when {
        escolhaJogadorString == escolhaComputador -> println("Empate!")
        (escolhaJogadorString == "Pedra" && escolhaComputador == "Tesoura") ||
                (escolhaJogadorString == "Papel" && escolhaComputador == "Pedra") ||
                (escolhaJogadorString == "Tesoura" && escolhaComputador == "Papel") -> println("Você venceu!")
        else -> println("O computador venceu!")
    }
}


//32 - [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5, e o jogador vai tentar descobrir qual foi o valor sorteado.

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)

    println("Tente adivinhar o número sorteado entre 1 e 5:")

    val tentativa = readLine()?.toIntOrNull()

    if (tentativa == null || tentativa !in 1..5) {
        println("Por favor, digite um número entre 1 e 5.")
        return
    }

    if (tentativa == numeroSorteado) {
        println("Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
    } else {
        println("Você errou. O número sorteado foi $numeroSorteado. Tente novamente!")
    }
}

// 33 - Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
//O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
//Calcule o valor da prestação mensal.
//A prestação não pode exceder 30% do salário, ou o empréstimo será negado.

fun main() {
    println("Digite o valor da casa (R$):")
    val valorCasa = readLine()!!.toDouble()

    println("Digite o salário do comprador (R$):")
    val salario = readLine()!!.toDouble()

    println("Digite em quantos anos o comprador vai pagar a casa:")
    val anos = readLine()!!.toInt()

    val numeroParcelas = anos * 12

    val prestacaoMensal = valorCasa / numeroParcelas

    val limitePrestacao = salario * 0.30

    if (prestacaoMensal <= limitePrestacao) {
        println("Empréstimo aprovado!")
        println("Valor da prestação mensal: R$ %.2f".format(prestacaoMensal))
    } else {
        println("Empréstimo negado!")
        println("A prestação mensal de R$ %.2f excede o limite de 30% do seu salário.".format(prestacaoMensal))
    }
}

// 34 - Calcule o Índice de Massa Corpórea (IMC) de uma pessoa e classifique conforme a tabela:
//Abaixo de 18.5 → Abaixo do peso
//Entre 18.5 e 25 → Peso ideal
//Entre 25 e 30 → Sobrepeso
//Entre 30 e 40 → Obesidade
//Acima de 40 → Obesidade mórbida

fun main() {
    println("Digite o seu peso (kg):")
    val peso = readLine()!!.toDouble()

    println("Digite a sua altura (m):")
    val altura = readLine()!!.toDouble()

    val imc = peso / (altura * altura)

    println("Seu IMC é: %.2f".format(imc))

    when {
        imc < 18.5 -> println("Classificação: Abaixo do peso")
        imc in 18.5..24.9 -> println("Classificação: Peso ideal")
        imc in 25.0..29.9 -> println("Classificação: Sobrepeso")
        imc in 30.0..39.9 -> println("Classificação: Obesidade")
        imc >= 40 -> println("Classificação: Obesidade mórbida")
    }
}

// 35 - Uma empresa de aluguel de carros cobra preços diferenciados para carros populares e de luxo.
//Carros populares (R$90/dia):
//Até 100Km percorridos → R$0,20 por Km
//Acima de 100Km percorridos → R$0,10 por Km
//Carros de luxo (R$150/dia):
//Até 200Km percorridos → R$0,30 por Km
//Acima de 200Km percorridos → R$0,25 por Km

fun main() {
    println("Escolha o tipo de carro:")
    println("1 - Carro Popular")
    println("2 - Carro de Luxo")
    val tipoCarro = readLine()?.toIntOrNull()

    if (tipoCarro == null || tipoCarro !in 1..2) {
        println("Opção inválida. Digite 1 para Carro Popular ou 2 para Carro de Luxo.")
        return
    }

    println("Digite o número de dias de aluguel:")
    val dias = readLine()!!.toInt()

    println("Digite a quantidade de km percorridos:")
    val kmPercorridos = readLine()!!.toInt()

    var precoDiario = 0.0
    var custoKm = 0.0

    if (tipoCarro == 1) {
        precoDiario = 90.0
        custoKm = if (kmPercorridos <= 100) {
            kmPercorridos * 0.20
        } else {
            (100 * 0.20) + ((kmPercorridos - 100) * 0.10)
        }
    } else if (tipoCarro == 2) {
        precoDiario = 150.0
        custoKm = if (kmPercorridos <= 200) {
            kmPercorridos * 0.30
        } else {
            (200 * 0.30) + ((kmPercorridos - 200) * 0.25)
        }
    }

    val valorTotal = (precoDiario * dias) + custoKm

    println("O valor total do aluguel será: R$ %.2f".format(valorTotal))
}

//36 - Um programa de vida saudável quer dar pontos por atividades físicas. O sistema funciona assim:
//Até 10h de atividade no mês → 2 pontos por hora
//De 10h até 20h → 5 pontos por hora
//Acima de 20h → 10 pontos por hora
//Cada ponto vale R$0,05

fun main() {
    println("Digite o número de horas de atividade física no mês:")
    val horasAtividade = readLine()!!.toInt()

    var pontos = 0

    when {
        horasAtividade <= 10 -> pontos = horasAtividade * 2
        horasAtividade in 11..20 -> pontos = horasAtividade * 5
        horasAtividade > 20 -> pontos = horasAtividade * 10
    }

    val valorEmReais = pontos * 0.05

    println("Você acumulou $pontos pontos.")
    println("O valor correspondente é R$ %.2f".format(valorEmReais))
}

//37 - Uma empresa precisa reajustar o salário dos funcionários conforme gênero e tempo de empresa:
//
//Mulheres:
//Menos de 15 anos → +5%
//De 15 até 20 anos → +12%
//Mais de 20 anos → +23%
//Homens:
//Menos de 20 anos → +3%
//De 20 até 30 anos → +13%
//Mais de 30 anos → +25%

fun main() {
    println("Digite o gênero do funcionário (M para Masculino ou F para Feminino):")
    val genero = readLine()?.uppercase()

    if (genero != "M" && genero != "F") {
        println("Gênero inválido. Digite 'M' para Masculino ou 'F' para Feminino.")
        return
    }

    println("Digite o tempo de empresa em anos:")
    val tempoDeEmpresa = readLine()!!.toInt()

    println("Digite o salário atual (R$):")
    val salarioAtual = readLine()!!.toDouble()

    var percentualReajuste = 0.0

    if (genero == "F") {
        percentualReajuste = when {
            tempoDeEmpresa < 15 -> 5.0
            tempoDeEmpresa in 15..20 -> 12.0
            else -> { 23.0 }
        }
    } else if (genero == "M") {
        percentualReajuste = when {
            tempoDeEmpresa < 20 -> 3.0
            tempoDeEmpresa in 20..30 -> 13.0
            else -> {25.0}
        }
    }

    val reajuste = salarioAtual * (percentualReajuste / 100)
    val salarioReajustado = salarioAtual + reajuste

    println("Percentual de reajuste: $percentualReajuste%")
    println("Valor do reajuste: R$ %.2f".format(reajuste))
    println("Salário reajustado: R$ %.2f".format(salarioReajustado))
}

//38 Escreva um programa que mostre na tela a seguinte contagem:
// 6 7 8 9 10 11 Acabou!

fun main (){
    var i = 6
    while (i <= 11){
        println(i)
        i ++
    }
    println("Acabou!")
}

//39 faça um algoritmo que mostre na tela a seguinte contagem:
//10 9 8 7 6 5 4 3 Acabou!

fun main (){
    var i = 10
    while (i >= 3){
        println(i)
        i --
    }
    print("Acabou!")
}

//40 Crie um aplicativo que mostre na tela a seguinte contagem:
//0 3 6 9 12 15 18 Acabou!//

fun main(){
    var i = 3
    while (i <= 18){
        println(i)
        i += 3
    }
    print("Acabou!")
}