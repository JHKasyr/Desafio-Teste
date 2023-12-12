package com.mycompany.atividadereserva;

import javax.swing.JOptionPane;

public class Reserva {

    private String origem;
    private String destino;
    private String data;
    private int maxNumPassageiro = 150;
    private int passageirosAtuais = 0;
    private String statusDaReserva;

    public Reserva() {
    }

    public Reserva(String origem, String destino, String data, int maxNumPassageiro, int passageirosAtuais, String statusDaReserva) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.maxNumPassageiro = maxNumPassageiro;
        this.passageirosAtuais = passageirosAtuais;
        this.statusDaReserva = statusDaReserva;
    }

//    
//
//    public boolean realizarReserva() {
//        try {
//        this.origem = JOptionPane.showInputDialog("insira o seu local de origem");
//        this.destino = JOptionPane.showInputDialog("Insira o seu local de destino");
//        this.data = JOptionPane.showInputDialog("insira a data da reserva");
//        this.statusDaReserva = "reservado";
//        return true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ocorreu um erro ao criar seu cadastro \n"+e.getMessage());
//            return false;
//        }
//        
    public boolean disponibilidadeAssentos(int novosPassageiros) {
        this.passageirosAtuais = this.passageirosAtuais + novosPassageiros;
        if (maxNumPassageiro > passageirosAtuais) {
            JOptionPane.showMessageDialog(null, "reservada de " + novosPassageiros + " passageiros realida com sucesso");
            JOptionPane.showMessageDialog(null, "ainda há " + (maxNumPassageiro - passageirosAtuais) + " assentos disponiveis");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "incapaz de realizar reserva");
            JOptionPane.showMessageDialog(null, "assentos disponiveis: " + (maxNumPassageiro - passageirosAtuais));
            return false;
        }
    }

    public boolean cancelarReserva() {
        if (this.statusDaReserva.equals("Reservado")) {
            this.origem = null;
            this.destino = null;
            this.maxNumPassageiro = 150;
            this.statusDaReserva = "cancelado";
            JOptionPane.showConfirmDialog(null, "sucesso");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Reserva inexistente");
            return false;
        }

    }

    public boolean realizarCheckIn(){
        if(statusDaReserva.equals("Reservado")){
            JOptionPane.showMessageDialog(null, "Check in realizado com sucesso");
            statusDaReserva = "Confirmado";
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "esta reserva ja foi cancelada");
            return false;
        }
}
}
