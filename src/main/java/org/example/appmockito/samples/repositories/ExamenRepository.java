package org.example.appmockito.samples.repositories;

import org.example.appmockito.samples.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}
