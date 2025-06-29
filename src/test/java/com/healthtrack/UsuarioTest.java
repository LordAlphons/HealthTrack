package com.healthtrack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Luz", 55.0);
    }

    @Test
    @DisplayName("Debe actualizar correctamente el peso")
    void testActualizarPesoCorrecto() {
        usuario.actualizarPeso(58.5);
        assertEquals(58.5, usuario.getPeso(), 0.001);
    }

    @Test
    @DisplayName("Debe mantener el mismo valor si se actualiza con el mismo peso")
    void testActualizarConMismoPeso() {
        usuario.actualizarPeso(55.0);
        assertEquals(55.0, usuario.getPeso(), 0.001);
    }

    @Test
    @DisplayName("Debe aceptar peso negativo (según lógica actual)")
    void testActualizarConPesoNegativo() {
        usuario.actualizarPeso(-4.5);
        assertEquals(-4.5, usuario.getPeso(), 0.001);
    }

    @Test
    @DisplayName("Debe devolver correctamente el nombre del usuario")
    void testGetNombre() {
        assertEquals("Luz", usuario.getNombre());
    }

    @Test
    @DisplayName("Debe imprimir correctamente la información del usuario")
    void testMostrarInformacion() {
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        usuario.mostrarInformacion();
        String output = salida.toString().trim();

        assertTrue(output.contains("Usuario: Luz"));
        assertTrue(output.contains("55.0") || output.contains("55")); // por si imprime sin decimales
    }
}