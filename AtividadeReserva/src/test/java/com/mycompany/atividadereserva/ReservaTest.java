package com.mycompany.atividadereserva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    public ReservaTest() {
    }

    @Test
    public void testRealizarReservaCenarioBom() {
        Reserva reserva = new Reserva("Sapiraganga", "Brasi", "12/23/422", 150, 100, "Reservado");
        Assertions.assertEquals(true, reserva.disponibilidadeAssentos(0));
        Assertions.assertEquals(true, reserva.realizarCheckIn());
    }
    @Test
    public void testRealizarReservaCenarioRuim() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Reservado");
        Assertions.assertEquals(true, reserva.disponibilidadeAssentos(151));
        Assertions.assertEquals(true, reserva.cancelarReserva());
        Assertions.assertEquals(true, reserva.realizarCheckIn());
    }
    @Test
    public void testDisponibilidadeAssentoBom() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Reservado");
        Assertions.assertEquals(true, reserva.disponibilidadeAssentos(149));
    }
    @Test
    public void testDisponibilidadeAssentoRuim() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Reservado");
        Assertions.assertEquals(true, reserva.disponibilidadeAssentos(151));
    }
    @Test
    public void testCancelarReservaBom() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Reservado");
        Assertions.assertEquals(true, reserva.cancelarReserva());
    }
    @Test
    public void testCancelarReservaRuim() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Confirmado");
        Assertions.assertEquals(true, reserva.cancelarReserva());
    }
    @Test
    public void testCheckInBom() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Reservado");
        Assertions.assertEquals(true, reserva.realizarCheckIn());
    }
    @Test
    public void testCheckInRuim() {
        Reserva reserva = new Reserva("Sapiranga", "Brasi", "12/23/422", 150, 0, "Cancelado");
        Assertions.assertEquals(true, reserva.realizarCheckIn());
    }

}
