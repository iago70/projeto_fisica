import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ============================================================
//  CLASSE DE LÓGICA
// ============================================================
class CalculadoraAtrito {

    private double resultado;

    /**
     * Calcula o peso máximo do bloco A para que o sistema fique em equilíbrio.
     * Fórmula: P_A = (μs × P_B) × tan(θ)
     */
    public double calcularPesoMaximo(double pesoB, double muS, double anguloGraus) {
        double anguloRad = Math.toRadians(anguloGraus);
        resultado = (muS * pesoB) * Math.tan(anguloRad);
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public boolean validarEntradas(double pesoB, double muS, double anguloGraus) {
        return pesoB > 0
            && muS > 0 && muS <= 1
            && anguloGraus > 0 && anguloGraus < 90;
    }

    public void reset() {
        resultado = 0;
    }
}

// ============================================================
//  CLASSE DE INTERFACE  (contém o main)
// ============================================================
public class CalculadoraProblema25 extends JFrame {

    private JTextField txtPesoB;
    private JTextField txtMuS;
    private JTextField txtAngulo;
    private JTextField txtResultado;
    private JButton    btnCalcular;
    private JButton    btnReset;

    private final CalculadoraAtrito calc = new CalculadoraAtrito();

    public CalculadoraProblema25() {
        inicializarComponentes();
    }

    // ── Construção da UI ─────────────────────────────────────
    private void inicializarComponentes() {
        setTitle("Calculadora – Problema 25");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Color bgColor    = new Color(248, 248, 252);
        Color azulTitulo = new Color(25, 60, 130);
        Font  labelFont  = new Font("Arial", Font.PLAIN, 13);
        Font  fieldFont  = new Font("Arial", Font.PLAIN, 13);
        Font  boldLabel  = new Font("Arial", Font.BOLD,  13);

        // Painel raiz
        JPanel root = new JPanel(new BorderLayout(0, 0));
        root.setBackground(bgColor);
        root.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(150, 175, 220), 2),
            BorderFactory.createEmptyBorder(14, 20, 12, 20)
        ));

        // Título
        JLabel titulo = new JLabel("Calculadora – Problema 25", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setForeground(azulTitulo);
        titulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 12, 0));
        root.add(titulo, BorderLayout.NORTH);

        // Painel de campos
        JPanel campos = new JPanel(new GridBagLayout());
        campos.setBackground(bgColor);
        GridBagConstraints g = new GridBagConstraints();
        g.fill   = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 4, 5, 4);

        // Peso do bloco B
        g.gridx = 0; g.gridy = 0; g.weightx = 0.65;
        campos.add(mkLabel("Peso do bloco B (N):", labelFont), g);
        g.gridx = 1; g.weightx = 0.35;
        txtPesoB = mkField(fieldFont);
        campos.add(txtPesoB, g);

        // Coeficiente de atrito
        g.gridx = 0; g.gridy = 1; g.weightx = 0.65;
        campos.add(mkHtmlLabel("Coeficiente de atrito estático (μ<sub>s</sub>):", labelFont), g);
        g.gridx = 1; g.weightx = 0.35;
        txtMuS = mkField(fieldFont);
        campos.add(txtMuS, g);

        // Ângulo θ
        g.gridx = 0; g.gridy = 2; g.weightx = 0.65;
        campos.add(mkLabel("Ângulo θ (graus):", labelFont), g);
        g.gridx = 1; g.weightx = 0.35;
        txtAngulo = mkField(fieldFont);
        campos.add(txtAngulo, g);

        // Separador
        g.gridx = 0; g.gridy = 3; g.gridwidth = 2;
        g.insets = new Insets(8, 4, 8, 4);
        JSeparator sep = new JSeparator();
        sep.setForeground(new Color(190, 190, 200));
        campos.add(sep, g);
        g.gridwidth = 1;
        g.insets    = new Insets(5, 4, 5, 4);

        // Resultado (read-only)
        g.gridx = 0; g.gridy = 4; g.weightx = 0.65;
        JLabel lblRes = mkLabel("Peso máximo do bloco A (N):", boldLabel);
        lblRes.setForeground(azulTitulo);
        campos.add(lblRes, g);

        g.gridx = 1; g.weightx = 0.35;
        txtResultado = new JTextField();
        txtResultado.setFont(new Font("Arial", Font.BOLD, 14));
        txtResultado.setEditable(false);
        txtResultado.setBackground(new Color(218, 232, 255));
        txtResultado.setForeground(new Color(15, 15, 110));
        txtResultado.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(100, 140, 205), 1),
            BorderFactory.createEmptyBorder(4, 8, 4, 8)
        ));
        txtResultado.setPreferredSize(new Dimension(110, 30));
        campos.add(txtResultado, g);

        root.add(campos, BorderLayout.CENTER);

        // Painel Sul – botões + legenda
        JPanel sul = new JPanel(new BorderLayout(0, 4));
        sul.setBackground(bgColor);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        painelBotoes.setBackground(bgColor);

        btnCalcular = new JButton("CALCULAR");
        estilizarBotao(btnCalcular, new Color(25, 95, 200), Color.WHITE);
        btnCalcular.addActionListener(e -> calcular());

        btnReset = new JButton("RESET");
        estilizarBotao(btnReset, new Color(200, 200, 205), new Color(50, 50, 60));
        btnReset.addActionListener(e -> resetar());

        painelBotoes.add(btnCalcular);
        painelBotoes.add(btnReset);
        sul.add(painelBotoes, BorderLayout.NORTH);

        JPanel legenda = new JPanel();
        legenda.setLayout(new BoxLayout(legenda, BoxLayout.Y_AXIS));
        legenda.setBackground(bgColor);
        Font  legFont  = new Font("Arial", Font.ITALIC, 11);
        Color legColor = new Color(100, 100, 110);
        JLabel l1 = new JLabel("• Botão CALCULAR: realiza o cálculo e exibe o resultado.");
        JLabel l2 = new JLabel("• Botão RESET: limpa todos os campos e o resultado.");
        l1.setFont(legFont); l1.setForeground(legColor);
        l2.setFont(legFont); l2.setForeground(legColor);
        legenda.add(l1);
        legenda.add(l2);
        sul.add(legenda, BorderLayout.SOUTH);

        root.add(sul, BorderLayout.SOUTH);

        add(root);
        pack();
        setMinimumSize(new Dimension(430, 280));
        setLocationRelativeTo(null);
    }

    // ── Helpers de criação de componentes ────────────────────
    private JLabel mkLabel(String txt, Font f) {
        JLabel l = new JLabel(txt);
        l.setFont(f);
        return l;
    }

    private JLabel mkHtmlLabel(String html, Font f) {
        JLabel l = new JLabel("<html>" + html + "</html>");
        l.setFont(f);
        return l;
    }

    private JTextField mkField(Font f) {
        JTextField t = new JTextField();
        t.setFont(f);
        t.setPreferredSize(new Dimension(110, 30));
        t.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 190), 1),
            BorderFactory.createEmptyBorder(4, 8, 4, 8)
        ));
        return t;
    }

    private void estilizarBotao(JButton b, Color bg, Color fg) {
        b.setBackground(bg);
        b.setForeground(fg);
        b.setFont(new Font("Arial", Font.BOLD, 13));
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(bg.darker(), 1),
            BorderFactory.createEmptyBorder(8, 24, 8, 24)
        ));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setOpaque(true);
    }

    // ── Lógica dos botões ─────────────────────────────────────
    private void calcular() {
        String sPesoB = txtPesoB.getText().trim().replace(",", ".");
        String sMuS   = txtMuS.getText().trim().replace(",", ".");
        String sAng   = txtAngulo.getText().trim().replace(",", ".");

        if (sPesoB.isEmpty() || sMuS.isEmpty() || sAng.isEmpty()) {
            erro("Preencha todos os campos antes de calcular.");
            return;
        }

        double pesoB, muS, anguloGraus;
        try {
            pesoB       = Double.parseDouble(sPesoB);
            muS         = Double.parseDouble(sMuS);
            anguloGraus = Double.parseDouble(sAng);
        } catch (NumberFormatException ex) {
            erro("Valores inválidos. Use números decimais (ex: 711, 0.25, 30).");
            return;
        }

        // Restrições do sistema 
        if (pesoB <= 0) {
            erro("Peso do bloco B deve ser maior que 0 N.");
            return;
        }
        if (muS <= 0 || muS > 1) {
            erro("Coeficiente de atrito (μs) deve estar no intervalo (0, 1].");
            return;
        }
        if (anguloGraus <= 0 || anguloGraus >= 90) {
            erro("Ângulo θ deve estar entre 0° e 90° (exclusive).");
            return;
        }

        double resultado = calc.calcularPesoMaximo(pesoB, muS, anguloGraus);
        txtResultado.setText(String.format("%.2f", resultado));
    }

    private void resetar() {
        txtPesoB.setText("");
        txtMuS.setText("");
        txtAngulo.setText("");
        txtResultado.setText("");
        calc.reset();
    }

    private void erro(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
    }

    // ── Ponto de entrada ─────────────────────────────────────
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
            new CalculadoraProblema25().setVisible(true);
        });
    }
}
