package com.inventorydelete.services_inventory_delete.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventorydelete.services_inventory_delete.Models.ApiResponse;
import com.inventorydelete.services_inventory_delete.Models.Inventory;
import com.inventorydelete.services_inventory_delete.Services.InventoryDeleteServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/inventory")
@Tag(name = "Inventory Delete", description = "Inventory Delete API")
public class InventoryDeleteController {
    @Autowired
    private InventoryDeleteServices _service;

    @DeleteMapping("/delete/{codigoInventario}")
    @Operation(summary = "Delete inventory", description = "Delete an inventory by its code.")
    public ApiResponse<Inventory> deleteInventory(@PathVariable String codigoInventario) {
        ApiResponse<Inventory> response = _service.deleteInventory(codigoInventario);
        return response;
    }
}
