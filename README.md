# projeto_fisica
# 🧮 Calculadora de Peso Máximo — Problema 25

> Aplicação desktop em Java (Swing) que calcula o **peso máximo do bloco A** para que um sistema de blocos e cordas permaneça em equilíbrio estático.

---

## 📸 Interface

<p align="center">
  <img src="data:image/svg+xml;base64,PHN2ZyB2aWV3Qm94PSIwIDAgNTIwIDQyMCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICA8cmVjdCB4PSIyOCIgeT0iMjgiIHdpZHRoPSI0NjQiIGhlaWdodD0iMzY0IiByeD0iMTAiIGZpbGw9IiMwMDAwMDAxOCIvPgogIDxyZWN0IHg9IjIwIiB5PSIyMCIgd2lkdGg9IjQ2NCIgaGVpZ2h0PSIzNjQiIHJ4PSI4IiBmaWxsPSIjZjhmOGZjIiBzdHJva2U9IiM5NmFmZGMiIHN0cm9rZS13aWR0aD0iMiIvPgogIDxyZWN0IHg9IjIwIiB5PSIyMCIgd2lkdGg9IjQ2NCIgaGVpZ2h0PSIzOCIgcng9IjgiIGZpbGw9IiNlZWYyZmIiLz4KICA8cmVjdCB4PSIyMCIgeT0iNDQiIHdpZHRoPSI0NjQiIGhlaWdodD0iMTQiIGZpbGw9IiNlZWYyZmIiLz4KICA8Y2lyY2xlIGN4PSI0MiIgY3k9IjM5IiByPSI2IiBmaWxsPSIjZmY1ZjU3Ii8+CiAgPGNpcmNsZSBjeD0iNjAiIGN5PSIzOSIgcj0iNiIgZmlsbD0iI2ZlYmMyZSIvPgogIDxjaXJjbGUgY3g9Ijc4IiBjeT0iMzkiIHI9IjYiIGZpbGw9IiMyOGM4NDAiLz4KICA8dGV4dCB4PSIyNTIiIHk9IjQ0IiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTMiIGZpbGw9IiM1NTUiIGZvbnQtd2VpZ2h0PSI1MDAiPkNhbGN1bGFkb3JhIOKAkyBQcm9ibGVtYSAyNTwvdGV4dD4KICA8dGV4dCB4PSIyNTIiIHk9Ijg4IiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTUiIGZpbGw9IiMxOTNjODIiIGZvbnQtd2VpZ2h0PSJib2xkIj5DYWxjdWxhZG9yYSDigJMgUHJvYmxlbWEgMjU8L3RleHQ+CiAgPHRleHQgeD0iNDQiIHk9IjEyMiIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEyLjUiIGZpbGw9IiMyMjIiPlBlc28gZG8gYmxvY28gQiAoTik6PC90ZXh0PgogIDxyZWN0IHg9IjMwMCIgeT0iMTA4IiB3aWR0aD0iMTYwIiBoZWlnaHQ9IjI4IiByeD0iNCIgZmlsbD0iI2ZmZiIgc3Ryb2tlPSIjYjRiNGJlIiBzdHJva2Utd2lkdGg9IjEiLz4KICA8dGV4dCB4PSIzMTYiIHk9IjEyNyIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEzIiBmaWxsPSIjNDQ0Ij43MTE8L3RleHQ+CiAgPHRleHQgeD0iNDQiIHk9IjE2MiIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEyLjUiIGZpbGw9IiMyMjIiPkNvZWZpY2llbnRlIGRlIGF0cml0byBlc3TDoXRpY28gKM68cyk6PC90ZXh0PgogIDxyZWN0IHg9IjMwMCIgeT0iMTQ4IiB3aWR0aD0iMTYwIiBoZWlnaHQ9IjI4IiByeD0iNCIgZmlsbD0iI2ZmZiIgc3Ryb2tlPSIjYjRiNGJlIiBzdHJva2Utd2lkdGg9IjEiLz4KICA8dGV4dCB4PSIzMTYiIHk9IjE2NyIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEzIiBmaWxsPSIjNDQ0Ij4wLDI1PC90ZXh0PgogIDx0ZXh0IHg9IjQ0IiB5PSIyMDIiIGZvbnQtZmFtaWx5PSJBcmlhbCIgZm9udC1zaXplPSIxMi41IiBmaWxsPSIjMjIyIj7Dgm5ndWxvIM64IChncmF1cyk6PC90ZXh0PgogIDxyZWN0IHg9IjMwMCIgeT0iMTg4IiB3aWR0aD0iMTYwIiBoZWlnaHQ9IjI4IiByeD0iNCIgZmlsbD0iI2ZmZiIgc3Ryb2tlPSIjYjRiNGJlIiBzdHJva2Utd2lkdGg9IjEiLz4KICA8dGV4dCB4PSIzMTYiIHk9IjIwNyIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEzIiBmaWxsPSIjNDQ0Ij4zMDwvdGV4dD4KICA8bGluZSB4MT0iNDQiIHkxPSIyMjgiIHgyPSI0NzYiIHkyPSIyMjgiIHN0cm9rZT0iI2JlYmVjOCIgc3Ryb2tlLXdpZHRoPSIwLjgiLz4KICA8dGV4dCB4PSI0NCIgeT0iMjU4IiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTIuNSIgZmlsbD0iIzE5M2M4MiIgZm9udC13ZWlnaHQ9ImJvbGQiPlBlc28gbcOheGltbyBkbyBibG9jbyBBIChOKTo8L3RleHQ+CiAgPHJlY3QgeD0iMzAwIiB5PSIyNDQiIHdpZHRoPSIxNjAiIGhlaWdodD0iMjgiIHJ4PSI0IiBmaWxsPSIjZGFlOGZmIiBzdHJva2U9IiM2NDhjY2QiIHN0cm9rZS13aWR0aD0iMSIvPgogIDx0ZXh0IHg9IjMxNiIgeT0iMjYzIiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTMuNSIgZmlsbD0iIzBmMGY2ZSIgZm9udC13ZWlnaHQ9ImJvbGQiPjEwMiw2NjwvdGV4dD4KICA8cmVjdCB4PSI5NiIgeT0iMjk0IiB3aWR0aD0iMTM2IiBoZWlnaHQ9IjM2IiByeD0iNSIgZmlsbD0iIzE5NWZjOCIgc3Ryb2tlPSIjMTI0OGEwIiBzdHJva2Utd2lkdGg9IjEiLz4KICA8dGV4dCB4PSIxNjQiIHk9IjMxNyIgdGV4dC1hbmNob3I9Im1pZGRsZSIgZm9udC1mYW1pbHk9IkFyaWFsIiBmb250LXNpemU9IjEzIiBmaWxsPSIjZmZmIiBmb250LXdlaWdodD0iYm9sZCI+Q0FMQ1VMQVI8L3RleHQ+CiAgPHJlY3QgeD0iMjU2IiB5PSIyOTQiIHdpZHRoPSIxMjAiIGhlaWdodD0iMzYiIHJ4PSI1IiBmaWxsPSIjYzhjOGNkIiBzdHJva2U9IiNhMGEwYWEiIHN0cm9rZS13aWR0aD0iMSIvPgogIDx0ZXh0IHg9IjMxNiIgeT0iMzE3IiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTMiIGZpbGw9IiMzMjMyNDAiIGZvbnQtd2VpZ2h0PSJib2xkIj7ihrogIFJFU0VUPC90ZXh0PgogIDx0ZXh0IHg9IjQ0IiB5PSIzNTIiIGZvbnQtZmFtaWx5PSJBcmlhbCIgZm9udC1zaXplPSIxMC41IiBmaWxsPSIjNjQ2NDcwIiBmb250LXN0eWxlPSJpdGFsaWMiPuKAoiBCb3TDo28gQ0FMQ1VMQVI6IHJlYWxpemEgbyBjw6FsY3VsbyBlIGV4aWJlIG8gcmVzdWx0YWRvLjwvdGV4dD4KICA8dGV4dCB4PSI0NCIgeT0iMzY4IiBmb250LWZhbWlseT0iQXJpYWwiIGZvbnQtc2l6ZT0iMTAuNSIgZmlsbD0iIzY0NjQ3MCIgZm9udC1zdHlsZT0iaXRhbGljIj7igKIgQm90w6NvIFJFU0VUOiBsaW1wYSB0b2RvcyBvcyBjYW1wb3MgZSBvIHJlc3VsdGFkby48L3RleHQ+Cjwvc3ZnPgo=" alt="Interface da Calculadora – Problema 25" width="480"/>
</p>

---

## 📋 Descrição do Problema

O bloco B (Fig. 6-31) pesa **711 N**. O coeficiente de atrito estático entre o bloco e a mesa é **0,25**; o ângulo θ é **30°**; o trecho da corda entre o bloco B e o nó é horizontal. Determinar o **peso máximo do bloco A** para que o sistema permaneça em repouso.

---

## ⚙️ Fundamentação Física

A resolução segue 4 passos:

**Passo 1 — Força de atrito estático máxima no bloco B**

```
fs,máx = μs × N = μs × PB
```

**Passo 2 — Equilíbrio no nó**

No nó atuam três forças: T₁ (horizontal), T₂ (inclinada) e T₃ (vertical = peso do bloco A).

```
ΣFx = 0  →  T₂ cos θ = T₁
ΣFy = 0  →  T₂ sin θ = T₃
```

**Passo 3 — Determinar as tensões**

No limite do movimento: `T₁ = fs,máx = 177,75 N`

```
T₂ = T₁ / cos θ = 177,75 / cos 30° ≈ 205,31 N
```

**Passo 4 — Peso máximo do bloco A**

```
PA = T₃ = T₂ × sin θ = 205,31 × sin 30° ≈ 102,66 N
```

**Fórmula final implementada no código:**

```
PA = (μs × PB) × tan(θ)
```

---

## 🏗️ Estrutura do Projeto

```
CalculadoraProblema25.java   ← arquivo único com todas as classes
```

O arquivo contém duas classes internas:

| Classe | Responsabilidade |
|---|---|
| `CalculadoraAtrito` | Lógica de cálculo e validação (regras de negócio) |
| `CalculadoraProblema25` | Interface gráfica Swing + ponto de entrada (`main`) |

---

## 📥 Entradas

| Campo | Descrição | Restrição |
|---|---|---|
| Peso do bloco B (N) | Peso do bloco sobre a mesa | > 0 |
| Coeficiente de atrito estático (μs) | Entre o bloco B e a mesa | 0 < μs ≤ 1 |
| Ângulo θ (graus) | Ângulo da corda inclinada | 0° < θ < 90° |

## 📤 Saída

| Campo | Descrição |
|---|---|
| Peso máximo do bloco A (N) | Valor calculado em Newtons (2 casas decimais) |

---

## 🖥️ Requisitos

- **Java 8** ou superior (JDK)
- Nenhuma dependência externa — usa apenas `javax.swing` e `java.awt` da biblioteca padrão

---

## 🚀 Como Rodar

### No VS Code

1. Instale a extensão **Extension Pack for Java** (Microsoft)
2. Abra o arquivo `CalculadoraProblema25.java`
3. Clique em **▶ Run** acima do método `main` ou pressione `F5`

### Via terminal

```bash
# Compilar
javac CalculadoraProblema25.java

# Executar
java CalculadoraProblema25
```

---

## 🧪 Exemplo de Uso

Com os valores do enunciado original:

| Entrada | Valor |
|---|---|
| Peso do bloco B | 711 N |
| Coeficiente μs | 0,25 |
| Ângulo θ | 30° |
| **Resultado PA** | **102,66 N** |

> Resultado esperado conforme gabarito: **≈ 102,7 N** ✅

---

## 🛡️ Validações

O sistema valida todas as entradas antes de calcular e exibe mensagens de erro específicas:

- Campo vazio → `"Preencha todos os campos antes de calcular."`
- Valor não numérico → `"Valores inválidos. Use números decimais."`
- Peso ≤ 0 → `"Peso do bloco B deve ser maior que 0 N."`
- μs fora de (0, 1] → `"Coeficiente de atrito (μs) deve estar no intervalo (0, 1]."`
- θ fora de (0°, 90°) → `"Ângulo θ deve estar entre 0° e 90° (exclusive)."`

---

## 📐 Diagrama de Classes (simplificado)

```
CalculadoraAtrito
├── resultado : double
├── calcularPesoMaximo(pesoB, muS, anguloGraus) : double
├── validarEntradas(pesoB, muS, anguloGraus) : boolean
├── getResultado() : double
└── reset() : void

CalculadoraProblema25 (extends JFrame)
├── txtPesoB, txtMuS, txtAngulo, txtResultado : JTextField
├── btnCalcular, btnReset : JButton
├── calc : CalculadoraAtrito
├── calcular() : void
├── resetar() : void
└── main(args) : void
```

---

## 👨‍💻 Tecnologias Utilizadas

- **Java SE** — linguagem principal
- **Swing (javax.swing)** — interface gráfica desktop
- **AWT (java.awt)** — layout e eventos

---

## 📄 Licença

Projeto acadêmico — trabalho de Física. Livre para uso educacional.
