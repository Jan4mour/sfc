package com.sfc.sistemaFinalizacaoContratual.service.impl;

import com.sfc.sistemaFinalizacaoContratual.model.Service;
import com.sfc.sistemaFinalizacaoContratual.repository.ServiceRepository;
import com.sfc.sistemaFinalizacaoContratual.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<Service> retrieveServices() {
        return serviceRepository.findAll();
    }

    @Override
    public Service getService(Long id) {
        return serviceRepository.findById(id).get();
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void updateService(Service newService) {
        serviceRepository.save(newService);
    }
}
