# api-pagamento

A api de pagamento foi feita usando as tecnologias com JAVA,SPRING BOOT,JPA E MYSQL.
Para usar é necessario apenas trocar no application.properties o username e o password do banco, E rodar o projeto.
Os enpoints que foram criados são:

/payment - Para realizar o pagamento conforme solicitado
/changeStatus/{id} - Para Alterar o status do pagamento
/status/{id} - Para Buscar o status do pagamento


Foi criado uma tela html chamada checkout.html jutamente com o projeto a mesma foi inclusa apenas com intenção de testes.
Nela é possivel validar o cartão de credito e sua bandeira, Para isso foi usada uma lib do WIRECARD (MOIP).

As arquiteturas utilizadas foram o padrão MVC e Restfull.

Foi criado no Postman uma mini documentação apenas para mostrar a chamada e seus respectivos body:
https://documenter.getpostman.com/view/3437663/SWT8feWF?version=latest

Problemas enfrentados:
1- Eu estava usando o lombok para gerar os getters e setters porém o mesmo aprensetou instabilidade agora proxima a entrega.
Solução: Foi criar os métodos.
2- Minha tela HTML não foi terminada pois obtive o erros de CORS.
Solução: Fiz adaptações tanto no front-end como no back-end para tentar solucionar esse problema mas sem exito.(Já tive esse erro antes porém nada do que eu fiz solucionou).


Muito Obrigado Pela Oportunidade! 




