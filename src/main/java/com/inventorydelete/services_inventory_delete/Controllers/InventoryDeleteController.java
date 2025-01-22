package com.inventorydelete.services_inventory_delete.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventorydelete.services_inventory_delete.Models.ApiResponse;
import com.inventorydelete.services_inventory_delete.Models.Inventory;
import com.inventorydelete.services_inventory_delete.Services.InventoryDeleteServices;

@RestController
@RequestMapping("/inventory")
public class InventoryDeleteController {
    @Autowired
    private InventoryDeleteServices _service;

    @DeleteMapping("/delete/{codigoInventario}")
    public ApiResponse<Inventory> deleteInventory(@PathVariable String codigoInventario) {
        ApiResponse<Inventory> response = _service.deleteInventory(codigoInventario);
        return response;
    }
}
