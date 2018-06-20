# default-system

Este projeto tem como objeto, simular o comportamento de um serviço de Streaming de Videos.
Esta aplicação deve possuir perfis de usuários de Administrador o qual pode gerenciar os 
cadastros das funcionalidades da aplicação e o perfil do usuário cliente que acessa aos 
serviços de videos apresentados no catalogo.


Configuações: 
- Acesso ao H2:

http://localhost:8080/h2-console
    -> JDBC URL: jdbc:h2:mem:testdb
    
<h2>Copia deste projeto em um novo repositório</h2>

<ul>Step 1 - Abrir o terminal de acesso ao GIT.</ul>
<ul>Step 2 - Criar um "bare" clone a partir do repositório.</ul>
git clone --bare https://github.com/nt-noobs/netflix-example.git
<ul>Step 3 - Acesse o repositório clonado.</ul>
default-system.git
<ul>Step 4 - Agora no GITHUB, crie um novo resitório clicando no botão "New" em "https://github.com/nt-noobs". 
Coloque um nome que faça sentido para o seu projeto. Exemplo: meu-projeto-example. </ul>
<ul>Step 5 - Crie o espelho enviando o projeto clonado para o github.</ul>
git push --mirror https://github.com/nt-noobs/meu-projeto-example.git
<ul>Step 6 - Limpar a sujeira.</ul>
cd ..
rm -rf default-system.git


<h2>Cada exercício deve ser enviado em um branch separado, como fazer</h2>

<ul>Step 1 - Criar um branch a partir da master (o nome tem que fazer sentido)</ul>
git checkout -b my-branch
<ul>Step 2 - Desenvolver o exercício e commitar</ul>
git commit -m '[exercício 1] Descrição do exercício'
<ul>Step 3 - Enviar</ul>
git push origin my-branch
<ul>Step 4 - Voltar para a master</ul>
git checkout master
<ul>Step 5 - Merge com o branch</ul>
git merge my-branch
<ul>Step 6 - Envia atualização da master para o repo</ul>
git commit -m '[exercício 1] Descrição do exercício'
<ul>Step 7 - Enviar</ul>
git push origin master
    
<h2>Funcionalidades Descritas - Perfil Administrador</h2>

<ul>Criar Catálogo de Filmes</ul>
<ul>Criar Catálogo de Séries</ul>
<ul>Criar Catálogo de Documentários</ul>
<ul>Criar Catálogo de Shows</ul>
<ul>Criar Catálogo de Desenhos</ul>
<ul>Criar Perfil de Artista</ul>
<ul>Criar Artista</ul>
<ul>Criar Filme</ul>
<ul>Criar Elenco</ul>
<ul>Criar Classificação por Idade</ul>
<ul>Criar Perfil de Usuário</ul>


<h2>Funcionalidades Descritas - Perfil Sistema</h2>
<ul>Recomendar Videos</ul>
<ul>Recomendar Videos Por Associação a um Produto Assistido</ul>
<ul>Remover Filmes Por Período</ul>
<ul>Remover Filmes Por Nível de Audiência</ul>


<h2>Funcionalidades Descritas - Perfil Cliente</h2>
<ul>Assistir Videos</ul>
<ul>Buscar por [Contéudo] mais novo adicionado ao Catálogo</ul>
<ul>Exibir Busca por [Contéudo] mais assistidos na semana</ul>
<ul>Adicionar Preferência para Assistir mais Tarde</ul>
<ul>Voltar a Assistir Filme do Periodo parado</ul>
<ul>Exibir maratona Filmes</ul>
<ul>Exibir maratona de Séries</ul>
