package com.sfc.sistemaFinalizacaoContratual.controller;

import com.sfc.sistemaFinalizacaoContratual.model.Service;
import com.sfc.sistemaFinalizacaoContratual.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("services")
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @GetMapping("/all")
    public List<Service> getAllService() {
        List<Service> services = serviceService.retrieveServices();
        return services;
    }

    @GetMapping("/{id}")
    public Service getService(@PathVariable(name = "id") Long id) {
        return serviceService.getService(id);
    }

    @PostMapping("/add")
    public void addNewService(Service service) {
        serviceService.saveService(service);
    }

    @PutMapping("{id}")
    public void updateService(@RequestBody Service newService, @PathVariable(name = "id") Long id) {
        newService.setId(id);

        if (newService != null) {
            serviceService.updateService(newService);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteService(@PathVariable(name = "id") Long id) {
        serviceService.deleteService(id);
    }
}
