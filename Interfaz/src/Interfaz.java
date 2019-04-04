import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interfaz extends JFrame implements ActionListener {
    public JTextField salarioBase,plus1,plus2,plus3;
    public JTextField costeplus1,costeplus2,costeplus3;
    public JLabel Salario,complementos,complementosNoSalariales,totalDevengado;
    public JButton calcular;

    public Interfaz(){
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Salario = new JLabel("Salario Base");
        Salario.setBounds(15,10,100,30);
        add(Salario);

        salarioBase = new JTextField();
        salarioBase.setBounds(115,16,100,20);
        add(salarioBase);

        complementos = new JLabel("Complementos salariales");
        complementos.setBounds(15,40,200,30);
        add(complementos);

        plus1 = new JTextField();
        plus1.setBounds(40,70,100,20);
        add(plus1);

        plus2 = new JTextField();
        plus2.setBounds(40,100,100,20);
        add(plus2);

        plus3 = new JTextField();
        plus3.setBounds(40,130,100,20);
        add(plus3);

        costeplus1 = new JTextField();
        costeplus1.setBounds(145,70,100,20);
        add(costeplus1);

        costeplus2 = new JTextField();
        costeplus2.setBounds(145,100,100,20);
        add(costeplus2);

        costeplus3 = new JTextField();
        costeplus3.setBounds(145,130,100,20);
        add(costeplus3);



        calcular = new JButton("Calcular");
        calcular.setBounds(250,630,100,20);
        add(calcular);
        calcular.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcular){
            ResultadoFinal resultadoFinal=new ResultadoFinal();
            JLabel datos=new JLabel("Salario Base:");
            resultadoFinal.add(datos);

            JTextField salario = new JTextField(qwer)
            resultadoFinal.add(datos);
        }

    }







    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setBounds(0,0,600,700);
        interfaz.setVisible(true);
        interfaz.setResizable(false);

    }
}
