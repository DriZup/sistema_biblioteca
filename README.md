
# Sistema de Gerenciamento de Biblioteca

## Descrição
Este é um sistema simples de gerenciamento de livros e usuários para uma biblioteca. Ele permite:
- Cadastrar livros.
- Cadastrar usuários.
- Realizar empréstimos e devoluções de livros.
- Exibir os livros disponíveis para empréstimo.

O sistema foi desenvolvido em **Java** utilizando conceitos de **Programação Orientada a Objetos (POO)**.

---

## Requisitos do Sistema

### Classes e Objetos
O sistema é composto pelas seguintes classes:
- **Livro**: Representa os livros disponíveis na biblioteca.
- **Usuario**: Representa os usuários que podem pegar livros emprestados.
- **Biblioteca**: Gerencia os livros e usuários, além de controlar os empréstimos e devoluções.

### Atributos e Métodos

#### Classe `Livro`
```java
// Atributos
private String titulo;       // Título do livro
private String autor;        // Autor do livro
private String isbn;         // Código único do livro
private boolean disponivel;  // Indica se o livro está disponível para empréstimo

// Métodos
public void exibirDetalhes(); // Exibe as informações do livro
public void emprestar();      // Marca o livro como indisponível
public void devolver();       // Marca o livro como disponível
```

#### Classe `Usuario`
```java
// Atributos
private String nome;                     // Nome do usuário
private int id;                          // Identificador único do usuário
private ArrayList<Livro> livrosEmprestados; // Lista de livros emprestados

// Métodos
public void exibirDetalhes();            // Exibe as informações do usuário
public void adicionarLivro(Livro livro); // Adiciona um livro à lista de livros emprestados
public void removerLivro(Livro livro);   // Remove um livro da lista de livros emprestados
```

#### Classe `Biblioteca`
```java
// Atributos
private ArrayList<Livro> livros;   // Lista de livros disponíveis na biblioteca
private ArrayList<Usuario> usuarios; // Lista de usuários cadastrados

// Métodos
public void cadastrarLivro(Livro livro);          // Adiciona um livro à lista de livros
public void cadastrarUsuario(Usuario usuario);    // Adiciona um usuário à lista de usuários
public void realizarEmprestimo(String isbn, int idUsuario); // Realiza o empréstimo de um livro
public void realizarDevolucao(String isbn, int idUsuario);  // Realiza a devolução de um livro
public void exibirLivrosDisponiveis();            // Exibe todos os livros disponíveis para empréstimo
```

---

## Regras de Negócio
1. Um livro só pode ser emprestado se estiver disponível.
2. Um usuário pode pegar no máximo **3 livros emprestados** ao mesmo tempo.
3. Ao devolver um livro, ele deve ser marcado como disponível novamente.

---

## Como Usar

### Pré-requisitos
- **Java Development Kit (JDK)** 8 ou superior.
- Um editor de texto ou IDE (como IntelliJ IDEA, Eclipse ou VS Code).

### Passos para Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-biblioteca.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd sistema-biblioteca
   ```
3. Compile o código:
   ```bash
   javac Main.java
   ```
4. Execute o programa:
   ```bash
   java Main
   ```

---

## Exemplo de Menu
Ao executar o programa, você verá o seguinte menu no console:
```plaintext
Bem-vindo ao Sistema de Gerenciamento de Biblioteca!
Escolha uma opção:
1. Cadastrar livro
2. Cadastrar usuário
3. Realizar empréstimo
4. Realizar devolução
5. Exibir livros disponíveis
6. Sair
```

---

## Exemplos de Código

### Cadastro de Livro
```java
Livro livro = new Livro("1984", "George Orwell", "123456789");
biblioteca.cadastrarLivro(livro);
```

### Cadastro de Usuário
```java
Usuario usuario = new Usuario("Alice", 1);
biblioteca.cadastrarUsuario(usuario);
```

### Realizar Empréstimo
```java
biblioteca.realizarEmprestimo("123456789", 1);
```

### Realizar Devolução
```java
biblioteca.realizarDevolucao("123456789", 1);
```

### Exibir Livros Disponíveis
```java
biblioteca.exibirLivrosDisponiveis();
```

---

## Estrutura do Projeto
```plaintext
├──sistema-biblioteca/
  ├── Livro.java
  ├── Usuario.java
  ├── Biblioteca.java
├── Main.java
└── README.md
```

---

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou enviar **pull requests**.

---


