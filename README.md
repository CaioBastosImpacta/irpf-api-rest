# IRPF API (fake)

## Maneira 1 de rodar o projeto

* Faça o clone do projeto
```bash
https://github.com/CaioBastosImpacta/irpf-api-rest.git
```

* Execute as ações do maven para build na raíz do projeto
```bash
mvn clean
mvn install
```

* Execute a ação de execução do projeto web (spring-boot) dentro da pasta irpf-rest
```bash
mvn spring-boot:run
```

### Buscar a tabela de IRPF FAKE
* Abrir o Postman
```bash
Metodo: GET
URL: localhost:8080/irpf
```

* 2. LINHDA DE COMANDO
```bash
curl --request GET \
  --url http://127.0.0.1:8080/irpf \
  --header 'Content-Type: application/json' \
```

### Executar o calculo de IRPF FAKE
* Abrir o Postman
```bash
Metodo: POST
URL: localhost:8080/irpf/calculate
BODY REQUEST:
{
    "totalSalary": 3669.00,
    "dependentsNumber": 10
}
```

* 2. LINHDA DE COMANDO
```bash
curl --request POST \
  --url http://127.0.0.1:8080/irpf/calculate \
  --header 'Content-Type: application/json' \
  --data '{
    "totalSalary": 3500.00,
    "dependentsNumber": 2
  }'
```

## Maneira 2 de rodar o projeto

* Acessar o link e fazer o pull da imagem
```bash
https://hub.docker.com/repository/docker/caiobastos12/irpf-api
```

* Execute as ações do maven para build na raíz do projeto
```bash
docker run <nome_imagem>
```
### Buscar a tabela de IRPF FAKE
* Abrir o Postman
```bash
Metodo: GET
URL: localhost:8080/irpf
```

* 2. LINHDA DE COMANDO
```bash
curl --request GET \
  --url http://127.0.0.1:8080/irpf \
  --header 'Content-Type: application/json' \
```

### Executar o calculo de IRPF FAKE
* 1. Abrir o Postman
```bash
Metodo: POST
URL: localhost:8080/irpf/calculate
BODY REQUEST:
{
    "totalSalary": 3669.00,
    "dependentsNumber": 10
}
```

* 2. LINHDA DE COMANDO
```bash
curl --request POST \
  --url http://127.0.0.1:8080/irpf/calculate \
  --header 'Content-Type: application/json' \
  --data '{
    "totalSalary": 3500.00,
    "dependentsNumber": 2
  }'
```
