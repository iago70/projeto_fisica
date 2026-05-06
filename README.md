# projeto_fisica
# 🧮 Calculadora de Peso Máximo — Problema 25

> Aplicação desktop em Java (Swing) que calcula o **peso máximo do bloco A** para que um sistema de blocos e cordas permaneça em equilíbrio estático.

---

## 📸 Interface

<p align="center">
  <img <img width="514" height="437" alt="Captura de tela 2026-05-06 081122" src="https://github.com/user-attachments/assets/313cce1e-1da9-426a-ba12-cb690e92c47b" />

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
