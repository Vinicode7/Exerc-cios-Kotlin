//11- Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
//equação do segundo grau e mostre o valor de Delta. (formula Δ = b
//2 – 4ac)

fun main() {
    print("Digite o Valor de A ")
    val A = readln().toDouble()
    print("Digite o Valor de B ")
    val B = readln().toDouble()
    print("Digite o Valor de C ")
    val C = readln().toDouble()

    val delta = (B*B)-(4*A*C)

    println("O Valor de Delta é $delta")

}

//12 Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
//seu PREÇO PROMOCIONAL, com 5% de desconto.

fun main() {
    print("Qual o produto: ");
    val produto = readln();
    print("Digite o valor do produto: ");
    val valor = readln().toDouble();
    val desconto = valor * 0.95;
    println("O $produto no valor total de: $valor R$ recebeu um desconto de 5% e ficara: $desconto R$ Com o desconto aplicado")
}

//13 Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

fun main() {
    print("Digite seu salario: ");
    val salario = readln().toDouble();
    print("porcentagem de bonus: ");
    val bonus = readln().toDouble();
    val salario_novo = salario+ (salario * (bonus/100));
    println("O valor do salario apos o aumento é de $salario_novo R$")
}

//14 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
//programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
//e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

fun main() {
    print("Modelo do Carro: ")
    val modelo = readln()
    print("KM do Carro: ");
    val km = readln().toInt()
    print("Quantidade de Dias: ");
    val dias = readln().toInt()
    val preco_diaria = 90.00 * dias
    val preco_km = 0.20 * km
    val preco_total = preco_diaria + preco_km
    println("O valor total do aluguel sera: $preco_total ")

}

//15 Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
//hora trabalhada.

fun main() {
    print("Numero de dias trabalhados: ");
    val dias_trabalhados = readLine()!!.toInt();
    val horas_trabalhados = dias_trabalhados * 8;
    val salario = horas_trabalhados * 25;

    println("salario: $salario");
}

//16 [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
//de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
//ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.

fun main() {
    print("Quantidade de cigarros por dia: ");
    val quantidade = readln().toDouble();
    print("Quantos anos vc ficou fumando: ");
    val anos = readln().toDouble();

    val dias_perdidos = (((365 * anos) * quantidade) * 10) / 1440

    println("Você perdeu $dias_perdidos da sua vida");
}

//17 Escreva um programa que pergunte a velocidade de um carro.
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
//cada Km acima da velocidade permitida.



fun main() {
    print("Digite a velocidade do carro (Km/h): ")
    val velocidade = readLine()?.toIntOrNull() ?: 0
    val limiteVelocidade = 80
    val valorMultaPorKm = 5

    if (velocidade > limiteVelocidade) {
        val excesso = velocidade - limiteVelocidade
        val multa = excesso * valorMultaPorKm
        println("Você foi multado! Excedeu o limite de $limiteVelocidade Km/h.")
        println("Valor da multa: R$$multa,00")
    } else {
        println("Velocidade dentro do limite permitido. Dirija com segurança!")
    }
}

//18 Faça um programa que leia o ano de nascimento de uma pessoa,
//calcule a idade dela e depois mostre se ela pode ou não votar.

import java.time.LocalDate
import java.time.Period

fun calcularIdade(dataNascimento: LocalDate): Int {
    val dataAtual = LocalDate.now()
    val periodo = Period.between(dataNascimento, dataAtual)
    return periodo.years
}

fun main() {
    print("Digite seu ano de nascimento: ")
    val ano = readln().toInt()
    print("Digite seu mes de nascimento: ")
    val mes = readln().toInt()
    print("Digite seu dia de nascimento: ")
    val dia = readln().toInt()

    val dataNascimento = LocalDate.of(ano, mes, dia)
    val idade = calcularIdade(dataNascimento)
    println("A idade é: $idade anos")

    if (idade >= 18) {
        println("Você esta elegivel a poder votar")
    }
    else {
        val aguarde = 18 - idade
        println("Aguarde: $aguarde anos ate poder votar")
    }
}

//19 Crie um algoritmo que leia o nome e as duas notas de um aluno,
//calcule a sua média e mostre na tela. No final, analise a média e
//mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
//da média 7.0).

fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine() ?: ""

    print("Digite a primeira nota: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a segunda nota: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

    val media = (nota1 + nota2) / 2

    println("Aluno: $nome")
    println("Média: $media")
    
    if (media >= 7.0) {
        println("Parabéns! Você teve um bom aproveitamento.")
    } else {
        println("Você precisa melhorar.")
    }
}

//20 Crie um algoritmo em Kotlin que leia um número 
//inteiro digitado pelo usuário e verifique se ele 
//é par ou ímpar. Em seguida, exiba a mensagem correspondente na tela.

fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
        println("O número é PAR.")
    } else {
        println("O número é ÍMPAR.")
    }
}