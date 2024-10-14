package pe.edu.cibertec.patitas_frontend_b.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public record LoginResponseDTO(String codigo, String mensaje, String nombreUsuario, String correoUsuario) {
}
