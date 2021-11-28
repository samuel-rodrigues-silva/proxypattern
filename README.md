O design pattern proxy é um padrão de projeto estrutural onde é oferecido um substituto para um outro objeto que contenha a lógica de serviço original.
O proxy controla o acesso ao objeto original, permitindo que sejam executadas tarefas antes ou depois do pedido chegar ao objeto.

O padrão Proxy sugere que você crie uma nova classe proxy com a mesma interface do objeto do serviço original.
Então você atualiza sua aplicação para que ela passe o objeto proxy para todos os clientes do objeto original.
Ao receber uma solicitação de um cliente, o proxy cria um objeto do serviço real e delega a ele todo o trabalho.
