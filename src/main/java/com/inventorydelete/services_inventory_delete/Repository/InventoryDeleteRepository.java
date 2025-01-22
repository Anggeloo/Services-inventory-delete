package com.inventorydelete.services_inventory_delete.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventorydelete.services_inventory_delete.Models.Inventory;

public interface InventoryDeleteRepository extends JpaRepository<Inventory, Integer>{
    Inventory findByCodigoInventario(String codigoInventario);
}
