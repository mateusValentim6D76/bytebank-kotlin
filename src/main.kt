fun main() {
    println("Bem vindo ao Bytebank:")
    println()

    val mateus = Funcionario(
        cpf = "233.222.765.42",
        nome = "Mateus Valentim",
        salario = 1000.0
    )

    val helena = Gerente(
        cpf = "111.111.111-11",
        nome = "Helena Regina Valentim",
        salario = 5000.0,
        senha = 1111
    )

    val valentim = Diretor(
        cpf = "431.444.222.11",
        nome = "Mateus Valentim de Oliveira Silva Santos Conceição",
        salario = 10000.0,
        senha = 1234,
        plr = 500.0
    )

    println("nome: ${mateus.nome}")
    println("cpf: ${mateus.cpf}")
    println("salario: ${mateus.salario}")
    println("bonificação: ${mateus.bonificacao()}")

    println()

    println("nome: ${helena.nome}")
    println("cpf: ${helena.cpf}")
    println("salario: ${helena.salario}")
    println("bonificação: ${helena.bonificacao()}")

    println()

    println("nome: ${valentim.nome}")
    println("cpf: ${valentim.cpf}")
    println("salario: ${valentim.salario}")
    println("bonificação: ${valentim.bonificacao()}")
    println("plr: ${valentim.plr}")

    if (helena.autentica(1111)){
        println("Autenticado com sucesso")
    } else{
        println("Falha na autenticação")
    }


    if (valentim.autentica(1234)){
        println("Autenticado com sucesso")
    } else{
        println("Falha na autenticação")
    }
}







