# Hero Adventure 🦾

Este é um projeto simples em Java que permite ao usuário criar heróis com características específicas e realizar ataques. Ele usa cores ANSI para destacar as mensagens no terminal, criando uma experiência de texto interativa e divertida.

# Funcionalidades 
* Criação de Heróis: O usuário pode definir o nome, idade e tipo do herói.

* Ataque Personalizado: Cada tipo de herói tem um ataque único:

* Mago: usa magia
* Guerreiro: usa espada
* Monge: usa artes marciais
* Ninja: usa shuriken

**Interatividade**: O programa pergunta ao usuário se deseja criar outro herói após cada ataque, permitindo a criação de múltiplos heróis em uma única execução.

**Cores no Terminal**: Cada tipo de ataque exibe uma cor específica (compatível com terminais que suportam ANSI).

# Estrutura do Projeto
O projeto consiste em duas classes:

* Heroi: Classe genérica que representa o herói, com propriedades como nome, idade e tipo. Inclui o método atacar() que exibe a mensagem de ataque de acordo com o tipo do herói e em uma cor correspondente.
* Main: Classe principal que lida com a entrada do usuário, criando instâncias da classe Heroi e chamando o método atacar() para cada herói.

# Requisitos
* Java JDK: Certifique-se de ter o Java Development Kit instalado para compilar e executar o código.
* Terminal com Suporte a Cores ANSI: Alguns terminais, como o CMD no Windows, Git Bash, e a maioria dos terminais Linux, suportam cores ANSI.