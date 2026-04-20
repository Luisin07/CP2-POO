# CP2 - Refatoração FiapDelivery

**Aluno:** Luis Otavio Santini Feitosa  
**RM:** 563556  
**Disciplina:** Object-Oriented Programming  
**Instituição:** FIAP  

---

## Sobre o Projeto

Atividade prática de refatoração de um sistema legado de logística chamado FiapDelivery. O objetivo foi diagnosticar falhas arquitetônicas e de segurança no código original, aplicando corretamente os princípios de Orientação a Objetos para construir uma solução escalável e manutenível.

---

## Problemas identificados no código legado

- Atributos públicos expondo dados sensíveis diretamente
- Nomes de variáveis e classes sem significado semântico
- Duplicação de código entre as classes `caminhao` e `moto`
- Associação engessada na classe `Rota`, aceitando apenas `caminhao`
- Ausência de construtores, validações e documentação
- Violação dos princípios de Clean Code

---

## Soluções aplicadas

- **Encapsulamento:** todos os atributos foram declarados como `private`, com acesso controlado via getters
- **Herança:** criação da classe abstrata `Veiculo` como pai de `Caminhao` e `Moto`, eliminando duplicação
- **Associação flexível:** a classe `Rota` passou a referenciar `Veiculo` (tipo pai), aceitando qualquer veículo presente ou futuro
- **Construtores:** objetos instanciados já com estado válido, com validação de dados na criação
- **Clean Code:** nomes descritivos em classes, atributos e métodos
- **Documentação:** Javadoc aplicado em todas as classes e métodos públicos

---

## Estrutura do Projeto
├── Veiculo.java                  # Classe abstrata pai dos veículos
├── Caminhao.java                 # Estende Veiculo, representa caminhão
├── Moto.java                     # Estende Veiculo, representa moto
├── Pacote.java                   # Representa o pacote a ser entregue
├── Rota.java                     # Associa um Pacote a um Veiculo
├── Principal.java                # Classe principal de execução
└── diagrama-fiapdelivery.png     # Diagrama UML de classes

---

## Como executar

Compilar:
```bash
javac *.java
```

Executar:
```bash
java Principal
```

Saída esperada:
Entregando pacote [BR999] no veículo [ABC1234]
Entregando pacote [BR000] no veículo [XYZ9876]