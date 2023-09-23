// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// Enum com os níveis
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

// Definindo a classe Aluno
data class Aluno(val nome: String)

// Definindo a classe Conteudo Educacional
data class ConteudoEducacional(val nome: String, val duracaoMin: Int)

// Definindo a classe Formacao com a capacidade de matricular alunos
data class Formacao(val nome: String, val nivel: Nivel, var conteudosEducacionais: List<ConteudoEducacional>) {
    
    val matriculados = mutableListOf<Aluno>()
  
    fun matricular(aluno: Aluno) {
        matriculados.add(aluno)
    }
}

fun main() {
  // Criação de alunos
  val aluno1 = Aluno("Alice Ramone")
  val aluno2 = Aluno("Dom Casmurro")
  
  // Criação de conteúdos
  val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
  val conteudo2 = ConteudoEducacional("Programação Orientada a Objeto", 90)
  
  // Criação de formação
  val formacao = Formacao("Desenvolvimento Android", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))
  
  // Matricular os alunos na formação
  formacao.matricular(aluno1)
  formacao.matricular(aluno2)
  
  // Verificar lista de matriculados na formação
  println("Alunos matriculados na formação ${formacao.nome}:")
  for (aluno in formacao.matriculados){
      println(aluno.nome)
  }
}
