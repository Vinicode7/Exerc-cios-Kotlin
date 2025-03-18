//51 Faça um aplicativo que leia o preço de 8 produtos. No final,
//mostre na tela qual foi o maior e qual foi o menor preço
//digitados.

fun main (){
    var maiorPreco: Int? = null
    var menorPreco: Int? = null
    var qtd = 1
    while (qtd < 9){
        print("Digite o preço do produto $qtd: ")
        val preço =  readLine()!!.toInt()

        if(maiorPreco == null || preço > maiorPreco){
            maiorPreco = preço
        }

        if(menorPreco == null || preço < menorPreco){
            menorPreco  = preço
        }
        qtd ++
    }
    println("Maior preço : $maiorPreco")
    println("Menor preço : $menorPreco")
}

//52 Crie um algoritmo que leia a idade de 10 pessoas, mostrando no
//final:
//• Qual é a média de idade do grupo
//• Quantas pessoas tem mais de 18 anos
//• Quantas pessoas tem menos de 5 anos
//• Qual foi a maior idade lida

fun main(){
    var mais18 = 0
    var menos5 = 0
    var somaIdade = 0
    var maiorDeIdade = 0
    var qtd = 0

    while(qtd <= 10){
        print("Digite sua idade: ")
        val idade = readln()!!.toInt()
        somaIdade  += idade

        if(idade >= 18){
            mais18 ++
        }

        if(idade < 5){
            menos5 ++
        }

        if(idade > maiorDeIdade){
            maiorDeIdade = idade
        }
        qtd++
    }
    val media = somaIdade.toDouble() / qtd
    println("Media de idade do grupo de pessoas: $media")
    println("Quantidade de pessoas com maior de 18 anos: $mais18")
    println("Quantidade de pessoas menores de 5 anos: $menos5")
    println("Maior idade citada: $maiorDeIdade")
}

//53 Faça um programa que leia a idade e o sexo de 5 pessoas,
//mostrando no final:
//• Quantos homens foram cadastrados
//• Quantas mulheres foram cadastradas
//• A média de idade do grupo
//• A média de idade dos homens
//• Quantas mulheres tem mais de 20 anos

fun main() {
    var Homen = 0
    var Mulher= 0
    var somaIdades = 0
    var somaIdadeHomens = 0
    var qtdMulheresMais20 = 0
    var qtd = 0

    while (qtd < 5) {
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!

        somaIdades += idade

        if (sexo == "M" || sexo == "m") {
            Homen++
            somaIdadeHomens += idade
        } else if (sexo == "F" || sexo == "f") {
            Mulher++
            if (idade > 20) {
                qtdMulheresMais20++
            }
        }
        qtd++
    }
    val mediaIdadeGrupo = somaIdades / 5.0
    val mediaIdadeHomens = if (Homen > 0) somaIdadeHomens / Homen.toDouble() else 0.0

    println("Total de homens cadastrados: $Homen")
    println("Total de mulheres cadastradas: $Mulher")
    println("Média de idade do grupo: %.2f".format(mediaIdadeGrupo))
    println("Média de idade dos homens: %.2f".format(mediaIdadeHomens))
    println("Mulheres com mais de 20 anos: $qtdMulheresMais20")
}

//54 Desenvolva um aplicativo que leia o peso e a altura de 7
//pessoas, mostrando no final:
//• Qual foi a média de altura do grupo
//• Quantas pessoas pesam mais de 90Kg
//• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//• Quantas pessoas que medem mais de 1.90m pesam mais de
//100Kg.

fun main() {
    var somaAltura = 0
    var pessoasMais90kg = 0
    var pessoasMenos50kgMenos160cm = 0
    var pessoasMais190cmMais100kg = 0
    var qtd = 0

    while (qtd < 7) {
        print("Digite o peso da pessoa ${qtd + 1} (Kg): ")
        val peso = readLine()!!.toDouble()

        print("Digite a altura da pessoa ${qtd + 1} (m): ")
        val altura = readLine()!!.toInt()

        somaAltura += altura

        if (peso > 90) {
            pessoasMais90kg++
        }
        if (peso < 50 && altura < 1.60) {
            pessoasMenos50kgMenos160cm++
        }
        if (altura > 1.90 && peso > 100) {
            pessoasMais190cmMais100kg++
        }

        qtd++
    }

    val mediaAltura = somaAltura / 7

    println("Média de altura do grupo: %.2f m".format(mediaAltura))
    println("Pessoas com mais de 90Kg: $pessoasMais90kg")
    println("Pessoas com menos de 50Kg e menos de 1.60m: $pessoasMenos50kgMenos160cm")
    println("Pessoas com mais de 1.90m e mais de 100Kg: $pessoasMais190cmMais100kg")
}

//55 [DESAFIO] Vamos melhorar o jogo que fizemos no exercício
//32. A partir de agora, o computador vai sortear um número entre
//1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

import kotlin.random.Random

fun main() {
    val Sorteado = Random.nextInt(1, 11)
    var tentativas = 4

    while (tentativas > 0) {
        print("Digite um número entre 1 e 10: ")
        val palpite = readLine()!!.toInt()

        if (palpite == Sorteado) {
            println("Parabéns! Você acertou.")
            return
        }

        tentativas--
        println("Errado! Tentativas restantes: $tentativas")
    }

    println("Acabaram as tentativas! O número era $Sorteado.")
}

//56 - Enunciado:
// Crie um programa que, ao ser executado, pergunte ao usuário se ele deseja somar números.
// Caso a resposta seja afirmativa, o programa deve solicitar que o usuário insira números,
// um de cada vez. Os números inseridos serão somados, e a soma será exibida após o usuário
// digitar o número 1111, que será utilizado para encerrar o processo de soma.
// Se a resposta inicial do usuário for negativa, o programa deve imprimir "OK" e finalizar
// sem realizar nenhuma operação.

fun soma() {
    var soma = 0
    var flag = true
    while (flag) {
        print("Digite um número:")
        var num = readln()!!.toInt()
        if(num != 1111){
            soma += num
        } else{
            print("Soma encerrada!")
            flag = false
        }
    }
}

fun main(){
    print("Deseja somar números?")
    var resposta = readln()
    var respostatratada = resposta.lowercase()
    if (respostatratada == "sim") {
        soma()
    } else{
        println("OK")
    }
}

//57- 
// O programa deve solicitar o salário e o sexo (M ou F) de funcionários em um sistema.
// Ele deve continuar perguntando até que o usuário opte por não adicionar mais funcionários.
// O programa, ao final, deve exibir a soma dos salários dos funcionários masculinos e femininos.

fun main(){
    var salarioMas: Double = 0.0
    var salarioFem: Double = 0.0
    var numFun = 1
    var flag = true
    while (flag){
        print("Qual o salario do funcionário $numFun?")
        var salario = readln()!!.toDouble()
        print("Qual o sexo do funcionário $numFun? (M)/(F)")
        var sex = readln()
        if (sex == "M"){
            salarioMas += salario
        } else if(sex == "F"){
            salarioFem += salario
        } else {
            print("Digite apenas 'M' ou 'F'.")
        }
        print("Quer adicionar mais?")
        var resposta = readln()
        if (resposta == "sim"){
            numFun += 1
            continue
        } else {
            flag = false
        }
    }
    println("Salário Masculino: $salarioMas")
    println("Salário Feminino: $salarioFem")
}

//58 Faça um algoritmo que leia a idade de vários alunos de uma
//turma. O programa vai parar quando for digitada a idade 999. No
//final, mostre quantos alunos existem na turma e qual é a média de
//idade do grupo.
fun somaidade(): Int{
    var soma = 0
    var numAlu = 0
    var flag = true
    while (flag) {
        print("Digite a idade do aluno ${numAlu+1}:")
        var num = readln()!!.toInt()
        if(num != 999) {
            soma += num
            numAlu += 1
        } else{
            println("Operação encerrada!")
            flag = false
        }
    }
    var media = soma/numAlu
    return media
}
fun main(){
    print("Deseja fazer a média das idades dos seus alunos?")
    var resposta = readln()
    var respostatratada = resposta.lowercase()
    if (respostatratada == "sim") {
        var media = somaidade()
        println("A Média das idades é: $media")
    } else{
        println("OK")
    }
}

//59 Enunciado:
// O programa deve solicitar o sexo e a idade de várias pessoas. Ele deve continuar perguntando até que o usuário opte por parar.
// Ao final, o programa deve exibir:
// 1. A maior idade lida.
// 2. O total de homens cadastrados.
// 3. A idade da mulher mais jovem cadastrada (caso tenha mulheres cadastradas).
// 4. A média de idade dos homens cadastrados (caso tenha homens cadastrados).

fun main() {
    var maiorIdade = 0
    var totalHomens = 0
    var idadeMulherMaisJovem: Int? = null
    var somaIdadesHomens = 0
    var totalIdadesHomens = 0
    var flag = true

    while (flag) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        if (idade > maiorIdade) {
            maiorIdade = idade
        }

        if (sexo == "M") {
            totalHomens+=1
            somaIdadesHomens += idade
            totalIdadesHomens+=1
        } else if (sexo == "F") {
            if (idadeMulherMaisJovem == null) {
                idadeMulherMaisJovem = idade
            } else if (idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
            }
        }

        print("Deseja continuar? (S/N): ")
        val resposta = readLine()
        if (resposta == "S"){
            continue
        } else {
            flag = false
        }
    }

    println("\nMaior idade lida: $maiorIdade")
    println("Total de homens cadastrados: $totalHomens")
    if (idadeMulherMaisJovem != null) {
        println("Idade da mulher mais jovem: ${idadeMulherMaisJovem!!}")
    } else {
        println("Nenhuma mulher cadastrada.")
    }
    if (totalIdadesHomens > 0) {
        var mediaIdadeHomens = somaIdadesHomens.toDouble() / totalIdadesHomens
        println("Média de idade dos homens: $mediaIdadeHomens")
    } else {
        println("Nenhum homem cadastrado.")
    }
}

//60-  Enunciado:
// O programa solicita o nome, idade e sexo de várias pessoas e continua perguntando até que o usuário opte por parar.
// Ao final, o programa deve exibir:
// 1. O nome da pessoa mais velha.
// 2. O nome da mulher mais jovem cadastrada (caso tenha mulheres cadastradas).
// 3. A média de idade do grupo.
// 4. O número de homens com mais de 30 anos.
// 5. O número de mulheres com menos de 18 anos.

fun main() {
    var nomePessoaMaisVelha = ""
    var idadePessoaMaisVelha = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem: Int? = null
    var somaIdades = 0
    var totalPessoas = 0
    var homensMais30 = 0
    var mulheresMenos18 = 0
    var flag = true

    while (flag) {
        print("Digite o nome: ")
        val nome = readLine()!!

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()

        if (idade > idadePessoaMaisVelha) {
            idadePessoaMaisVelha = idade
            nomePessoaMaisVelha = nome
        }

        if (sexo == "F") {
            if (idadeMulherMaisJovem == null) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            } else if (idade < idadeMulherMaisJovem!!) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }
        }

        somaIdades += idade
        totalPessoas++

        if (sexo == "M" && idade > 30) {
            homensMais30++
        }

        if (sexo == "F" && idade < 18) {
            mulheresMenos18++
        }

        print("Deseja continuar? (S/N): ")
        val resposta = readLine()!!.trim().uppercase()
        if (resposta == "S"){
            continue
        } else {
            flag = false
        }
    }

    println("\nNome da pessoa mais velha: $nomePessoaMaisVelha")
    if (nomeMulherMaisJovem.isNotEmpty()) {
        println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    } else {
        println("Nenhuma mulher cadastrada.")
    }
    val mediaIdade = somaIdades.toDouble() / totalPessoas
    println("Média de idade do grupo: $mediaIdade")
    println("Homens com mais de 30 anos: $homensMais30")
    println("Mulheres com menos de 18 anos: $mulheresMenos18")
}
