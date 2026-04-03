# User Registration APP

Este é um aplicativo Android desenvolvido para a disciplina de Desenvolvimento Mobile (5º Semestre - ADS). O objetivo principal do projeto é o cadastro e gerenciamento de usuários utilizando persistência de dados local com a biblioteca **Room**.

## 🚀 Funcionalidades Atuais

- **Modelo de Dados (User):** Definição da entidade de usuário com campos para Nome, CPF, E-mail e Telefone.
- **Persistência com Room:**
    - **Entity:** Mapeamento da classe `User` como uma tabela no banco de dados SQLite.
    - **DAO (UserDao):** Interface que define as operações de banco de dados, como inserção (`insert`) e consulta de todos os registros (`getAllUsers`).
- **Interface do Usuário:**
    - **MainActivity:** Tela principal preparada para entrada de dados.
    - **ReportActivity:** Tela destinada à exibição de relatórios ou listagem de usuários cadastrados.
- **Permissões:** Configuração de permissão para escrita em armazenamento externo no `AndroidManifest.xml`.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Banco de Dados:** SQLite (via biblioteca Room)
- **Ferramenta de Build:** Gradle
- **IDE:** Android Studio

---

## 📝 Dicas de Comandos Git (Para a Prova)

Abaixo estão os comandos essenciais que podem te ajudar durante o desenvolvimento e a entrega:

### Fluxo Básico
- `git status`: Verifica o estado dos arquivos (quais foram modificados ou ainda não foram adicionados).
- `git add .`: Adiciona todas as alterações para a área de "staging" (preparação para o commit).
- `git commit -m "mensagem descritiva"`: Salva as alterações localmente com uma mensagem.
- `git push origin main`: Envia seus commits locais para o repositório remoto (ex: GitHub).
- `git pull origin main`: Atualiza seu repositório local com as alterações do remoto.

### Ramificações (Branches)
- `git branch`: Lista as branches existentes.
- `git checkout -b nome-da-branch`: Cria uma nova branch e muda para ela.
- `git checkout nome-da-branch`: Muda para uma branch já existente.
- `git merge nome-da-branch`: Mescla as alterações de outra branch na branch atual.

### Histórico e Desfazendo Coisas
- `git log --oneline`: Mostra o histórico de commits de forma simplificada.
- `git diff`: Mostra as alterações exatas feitas nos arquivos que ainda não foram adicionadas.
- `git restore nome-do-arquivo`: Descarta as mudanças feitas em um arquivo (cuidado!).

---
*Dica: Lembre-se sempre de fazer commits pequenos e frequentes com mensagens que expliquem o que foi feito.*
