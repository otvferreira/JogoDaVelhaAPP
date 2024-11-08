# Jogo da Velha - Android com Cores do Cruzeiro

Este projeto é uma aplicação Android que implementa o jogo da velha (tic-tac-toe) em uma interface personalizada com as cores do Cruzeiro Esporte Clube. O jogo permite que dois jogadores joguem alternadamente e exibe o status do jogo (vitória, empate ou próximo jogador). Desenvolvido em **Kotlin** com layout em **XML**.

## Funcionalidades

- **Alternância de Jogadores**: O primeiro jogador utiliza o símbolo "X" e o segundo jogador utiliza "O". Os jogadores se alternam a cada jogada.
- **Verificação de Vitória ou Empate**: O jogo verifica se há três símbolos iguais em uma linha, coluna ou diagonal, determinando o vencedor. Caso todas as posições estejam preenchidas sem um vencedor, o jogo declara um empate.
- **Reinício do Jogo**: O botão "Reiniciar Jogo" limpa o tabuleiro e permite iniciar uma nova partida.
- **Prevenção de Jogadas Inválidas**: Uma célula já preenchida não pode ser selecionada novamente.
- **Interface Personalizada**: Cores, divisórias e layout estilizados com a identidade visual do Cruzeiro.

## Interface do Usuário

- **TextView**: Exibe o status do jogo, indicando o próximo jogador ou o vencedor.
- **GridLayout**: Utilizado para dispor a grade 3x3, representando o tabuleiro do jogo da velha.
- **Botão Reiniciar**: Limpa o tabuleiro e redefine o status do jogo.

## Personalização Visual

- **Cores do Cruzeiro**: A cor azul (`#003DA5`) é utilizada como fundo principal da interface, enquanto o branco (`#FFFFFF`) é utilizado para os botões e divisórias.
- **Divisórias Brancas**: Linhas divisórias entre os botões foram adicionadas usando margens e bordas brancas para um visual organizado e fiel às cores do clube.

## Estrutura do Projeto

- **Linguagem**: Kotlin
- **Layout**: XML
- **Compatibilidade**: `compileSdk` 35

## Pré-requisitos

- **Android Studio** com SDK configurado para Android 35.
- **Kotlin** configurado no ambiente Android Studio.

## Imagens

![vazio](https://github.com/user-attachments/assets/b5e672e7-138f-4548-b1e7-fc578b8816b2)
![vence](https://github.com/user-attachments/assets/523bf7ee-f158-41de-a626-57287ce3b09b)
