package com.wgeneric.microservices.models.comunicacion;

import java.util.Map;

import com.wgeneric.microservices.models.entidades.Entidad;
import com.wgeneric.microservices.models.entidades.Interfaces;

import lombok.Data;
@Data
public class RequestEntidad {
    private Entidad entidad;
    private Interfaces interfaz;
    private byte[]  solicitudEntidad;
    private String solicitudEntidadArmada;
    private Map<String,String> headers;
}
