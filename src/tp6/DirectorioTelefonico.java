/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author OzKuro
 */
public class DirectorioTelefonico {

    private final HashMap<Long, Cliente> directorio = new HashMap<>();

    public boolean agregarCliente(long telefono, Cliente c) {
        if (!directorio.containsKey(telefono)) {
            directorio.put(telefono, c);
            return true;
        } else {
            return false;
        }

    }

    public Cliente buscarCliente(long telefono) {
        return directorio.get(telefono);
    }

    public ArrayList<Long> buscarTelefono(String apellido) {
        ArrayList<Long> lista = new ArrayList<>();

        for (long key : directorio.keySet()) {
            if (directorio.get(key).getApellido().equals(apellido)) {
                lista.add(key);
            }
        }

        return lista;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> lista = new ArrayList<>();

        for (Cliente client : directorio.values()) {
            if (client.getCiudad().equals(ciudad)) {
                lista.add(client);
            }
        }

        return lista;
    }

    public Cliente borrarCliente(long telefono) {
        return directorio.remove(telefono);
    }
}
