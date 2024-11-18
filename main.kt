//---------------------------------1-------------------------------
//Faça um programa que acompanhe um set de uma partida de vôlei. O
//programa deve ler o código da equipe (A ou B) que ganhou o ponto e
//responder quem ganha a partida. O set chega ao final se uma das equipes
//chega a 25 pontos e a diferença de pontos entre elas é maior ou igual //a dois.
//A equipe que conseguir isso é a vencedora do set.

/*fun main() {
    var pontosEquipeA = 0
    var pontosEquipeB = 0
    var vencedor = ""

    println("Acompanhe o set de vôlei!")
    println("Informe o código da equipe que marcou o ponto (A ou B):")

    while (true) {
        print("Equipe que marcou o ponto: ")
        val entrada = readLine()?.uppercase()

        if (entrada == "A") {
            pontosEquipeA++
        } else if (entrada == "B") {
            pontosEquipeB++
        } else {
            println("Entrada inválida. Digite 'A' ou 'B'.")
            continue
        }

        println("Placar: A $pontosEquipeA x $pontosEquipeB B")

        if ((pontosEquipeA >= 25 || pontosEquipeB >= 25) && 
            kotlin.math.abs(pontosEquipeA - pontosEquipeB) >= 2) {
            vencedor = if (pontosEquipeA > pontosEquipeB) "Equipe A" else "Equipe B"
            break
        }
    }

    println("Fim do set! $vencedor venceu!")
} */

//-------------------------------2---------------------------------
/*Uma certa empresa pretende verificar se os seus empregados estarão
qualificados ou não para aposentadoria em 2025.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
• Ter no mínimo 65 anos de idade; ou
• Ter trabalhado no mínimo 30 anos; ou
• Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa para:
• Ler o nome do empregado, o ano de nascimento e o ano de seu ingresso
na empresa.
• Calcular e exibir a idade e o tempo de trabalho do empregado (estimado
ao final de 2024)
• Exibir a mensagem “Pode Requerer Aposentadoria” se atender aos
requisitos ou “Não Pode Requerer Aposentadoria” caso contrário.
Ao final de cada execução, o programa deverá perguntar se o usuário deseja
fazer nova verificação. Se sim, o programa deverá repetir tudo novamente,
caso contrário deverá encerrar.
*/
/*
fun main() {
    var continuar = true

    while (continuar) {
        // Leitura dos dados do empregado
        println("Verificação de Aposentadoria - 2025")
        print("Digite o nome do empregado: ")
        val nome = readLine() ?: ""
        print("Digite o ano de nascimento: ")
        val anoNascimento = readLine()?.toIntOrNull() ?: 0
        print("Digite o ano de ingresso na empresa: ")
        val anoIngresso = readLine()?.toIntOrNull() ?: 0

        // Cálculo da idade e tempo de trabalho ao final de 2024
        val idade = 2024 - anoNascimento
        val tempoTrabalho = 2024 - anoIngresso

        // Exibição dos dados calculados
        println("Empregado: $nome")
        println("Idade em 2024: $idade anos")
        println("Tempo de trabalho em 2024: $tempoTrabalho anos")

        // Verificação das condições de aposentadoria
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            println("Pode Requerer Aposentadoria")
        } else {
            println("Não Pode Requerer Aposentadoria")
        }

        // Perguntar se o usuário deseja realizar nova verificação
        print("Deseja realizar outra verificação? (S/N): ")
        val resposta = readLine()?.uppercase() ?: "N"
        continuar = resposta == "S"
    }

    println("Programa encerrado.")
}
*/
