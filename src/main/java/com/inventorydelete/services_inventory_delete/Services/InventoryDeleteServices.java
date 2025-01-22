package com.inventorydelete.services_inventory_delete.Services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventorydelete.services_inventory_delete.Models.ApiResponse;
import com.inventorydelete.services_inventory_delete.Models.Inventory;
import com.inventorydelete.services_inventory_delete.Repository.InventoryDeleteRepository;

@Service
public class InventoryDeleteServices {

    private final InventoryDeleteRepository _repository;

    @Autowired
    public InventoryDeleteServices(InventoryDeleteRepository repository) {
        this._repository = repository;
    }

    public ApiResponse<Inventory> deleteInventory(String codice) {
        Inventory existingInventory = _repository.findByCodigoInventario(codice);
        if (existingInventory == null) {
            return new ApiResponse<Inventory>("error", null, "El inventario con el código proporcionado no existe.");
        }
    
        existingInventory.setEstado(false);
        existingInventory.setFechaActualizacion(LocalDateTime.now()); 
    
        _repository.save(existingInventory);
        return new ApiResponse<Inventory>("success", existingInventory, "Inventario eliminado correctamente (eliminación lógica).");
    }  
    
}
