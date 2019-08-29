package com.sfc.sistemaFinalizacaoContratual.service;

import com.sfc.sistemaFinalizacaoContratual.model.Service;

import java.util.List;

public interface ServiceService {
    List<Service> retrieveServices();

    Service getService(Long id);

    void saveService(Service service);

    void deleteService(Long id);

    void updateService(Service newService);
}
