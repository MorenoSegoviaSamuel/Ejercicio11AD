package org.api.miprimeraapirest.service;

import org.api.miprimeraapirest.model.Constructor;

import java.util.List;
import java.util.Optional;

public interface ConstructorService {
    List<Constructor> getAllConstructors();

    Optional<Constructor> getConstructorByConstructorRef(String constructorRef);

    void saveConstructor(Constructor constructor);

    void deleteConstructorByConstructorRef(String constructorRef);
}
