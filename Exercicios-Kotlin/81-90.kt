//81 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 8, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor' para armazenar as idades.
// 3. Solicite ao usuário que digite as idades de 8 pessoas, armazenando cada idade no vetor 'idades'.
// 4. Calcule a soma de todas as idades e, em seguida, calcule a média das idades.
// 5. Encontre a maior idade no vetor.
// 6. Imprima a média das idades.
// 7. Imprima as posições e idades das pessoas com mais de 25 anos.
// 8. Imprima a maior idade digitada e as posições em que ela aparece no vetor.

package Passo_8

fun main() {
    val tamanhoVetor = 8
    val idades = IntArray(tamanhoVetor)

    var somaIdades = 0
    for (i in 0 until tamanhoVetor) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]
    }

    val mediaIdade = somaIdades.toDouble() / tamanhoVetor

    var maiorIdade = idades[0]
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("\nMédia de idade: $mediaIdade")

    println("\nPosições com pessoas com mais de 25 anos:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}: ${idades[i]} anos")
        }
    }

    println("\nMaior idade digitada: $maiorIdade")

    println("\nPosições da maior idade:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] == maiorIdade) {
            println("Posição ${i + 1}")
        }
    }
}

//82 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de números decimais (Double) de tamanho 'tamanhoVetor' para armazenar as notas dos alunos.
// 3. Solicite ao usuário que digite as notas de 10 alunos, armazenando cada nota no vetor 'notas'.
// 4. Calcule a soma das notas e, em seguida, calcule a média das notas da turma.
// 5. Encontre a maior nota entre as notas dos alunos.
// 6. Imprima a média da turma.
// 7. Imprima os alunos que estão acima da média, junto com suas notas.
// 8. Imprima o total de alunos que estão acima da média.
// 9. Imprima a maior nota digitada e as posições onde ela foi registrada.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val notas = DoubleArray(tamanhoVetor)

    var somaNotas = 0.0
    for (i in 0 until tamanhoVetor) {
        print("Digite a nota do ${i + 1}º aluno: ")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]
    }

    val mediaTurma = somaNotas / tamanhoVetor

    var maiorNota = notas[0]
    for (nota in notas) {
        if (nota > maiorNota) {
            maiorNota = nota
        }
    }

    println("\nMédia da turma: $mediaTurma")

    var alunosAcimaMedia = 0
    println("\nAlunos acima da média:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] > mediaTurma) {
            println("Aluno ${i + 1}: Nota ${notas[i]}")
            alunosAcimaMedia++
        }
    }
    println("Total de alunos acima da média: $alunosAcimaMedia")

    println("\nMaior nota digitada: $maiorNota")

    println("\nPosições da maior nota:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] == maiorNota) {
            println("Posição ${i + 1}")
        }
    }
}

//83 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 20, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Preencha o vetor com números aleatórios entre 0 e 100.
// 4. Imprima os números gerados no vetor.
// 5. Ordene os números do vetor em ordem crescente.
// 6. Imprima os números do vetor após a ordenação.

package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 20
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println("Números gerados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()

    vetor.sort()

    println("\nNúmeros ordenados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()
}
