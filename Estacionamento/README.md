# 🅿️ Sistema de Estacionamento em Java

Este é um sistema simples de estacionamento desenvolvido em Java. Ele permite registrar a **entrada** e **saída de veículos**, mantendo o controle sobre:

- Veículos atualmente estacionados
- Veículos que já saíram
- Veículos **assinantes**, que não geram cobrança por estadia

---

## 🚗 Funcionalidades

- Registro de entrada de veículos
- Registro de saída com cálculo de valor (exceto para assinantes)
- Listagem de veículos:
  - Estacionados no momento
  - Que já deixaram o estacionamento
- Cadastro de veículos assinantes (com mensalidade)
- Cálculo automático de cobrança para veículos não-assinantes

---

## 💻 Tecnologias Usadas

- Java 8+
- Programação orientada a objetos
- Console (modo texto)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Murilo-hub/sistema-estacionamento.git
cd sistema-estacionamento/Estacionamento
```

2. Compile os arquivos

```bash
javac -d bin src/main/java/com/parklite/app/*.java

```

3.Execute a compilação
```bash
java -cp bin com.parklite.app.Main
```

---

# 👥 Cadastro de Assinantes

Os veículos assinantes são identificados pela placa. Eles não são cobrados por entradas/saídas, pois pagam uma mensalidade fixa.

Para definir um assinante, basta colocar as informações do veiculo e informar se o veiculo é de um assinante.

---

# 📌 Melhorias Futuras
- Interface gráfica (JavaFX ou Swing)

- Persistência de dados (arquivo ou banco de dados)

- Interface web com Spring Boot

- Cadastro de assinantes por nome e CPF

---

# 📜 Licença
Este projeto é livre para fins de aprendizado e uso pessoal.
