/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author Espaco de Inovacao
 */
public class TelaMenuSecretario extends JFrame implements ActionListener {

    JButton btnDocentes = new JButton("Docentes");
    JButton btnCadeiras = new JButton("Actividades");
    JButton btnCronogramas = new JButton("Cronogramas");
    JButton btnCriarCronogramas = new JButton("Criar Cronogramas");
    JButton btnTurmas = new JButton("Turmas");
    JButton btnRelatorios = new JButton("Relatórios");
    JButton btnSair = new JButton("Sair");

    public TelaMenuSecretario() {

        setTitle("Menu Principal");
        setSize(590, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        Container container = this.getContentPane();
        container.setLayout(null);

        btnDocentes.setBounds(50, 50, 120, 50);
        btnCadeiras.setBounds(200, 50, 120, 50);
        btnCronogramas.setBounds(350, 50, 120, 50);
        btnCriarCronogramas.setBounds(50, 200, 120, 50);
        btnTurmas.setBounds(200, 200, 120, 50);
        btnRelatorios.setBounds(350, 200, 120, 50);
        btnSair.setBounds(470, 330, 103, 30);

        //Adicionando ActionListenners aos botões
        btnDocentes.addActionListener(this);
        btnCadeiras.addActionListener(this);
        btnCronogramas.addActionListener(this);
        btnCriarCronogramas.addActionListener(this);
        btnTurmas.addActionListener(this);
        btnRelatorios.addActionListener(this);
        btnSair.addActionListener(this);

        container.add(btnDocentes);
        container.add(btnCadeiras);
        container.add(btnCronogramas);
        container.add(btnCriarCronogramas);
        container.add(btnTurmas);
        container.add(btnRelatorios);
        container.add(btnSair);


    }


    public static void main(String[] args) {

        TelaMenuSecretario tela = new TelaMenuSecretario();

    }


    @Override
    public void actionPerformed(ActionEvent accao) {
            //Abre tela para gestão de docentes.
        if (accao.getSource() == btnDocentes) {

            TelaGerirDocente telaGerirDocente = new TelaGerirDocente();

            //Tela para Gestão de Cadeiras e Instituição.
        } else if (accao.getSource() == btnCadeiras) {
            TelaRegistarInstituicao telaGerirActividades = new TelaRegistarInstituicao();


             //Abre tela de relatórios.
        } else if (accao.getSource() == btnRelatorios) {
            TelaRelatorios telaRelatorios = new TelaRelatorios();
            this.dispose();

            //Sai para a tela de login
        } else if (accao.getSource() == btnSair) {
            this.dispose();
            TelaEntrada telaEntrada = new TelaEntrada();


            //Abre a tela pra criação de cronogramas
        } else if (accao.getSource() == btnCriarCronogramas) {
            TelaHorario telaHorario = new TelaHorario();
             this.dispose();

            //Abre tela para Gestão de Cronogramas.
        } else if (accao.getSource() == btnCronogramas) {
            TelaGerirCronograma telaGerirCronograma = new TelaGerirCronograma();
            this.dispose();

            //Abre tela para gestão de turmas.
        } else if (accao.getSource() == btnTurmas) {
            TelaGerirTurma telaGerirTurma = new TelaGerirTurma();
            this.dispose();
        }

    }
}
