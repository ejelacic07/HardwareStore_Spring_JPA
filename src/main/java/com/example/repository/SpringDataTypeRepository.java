package com.example.HardwareStore.repository;
import com.example.HardwareStore.domain.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpringDataTypeRepository extends JpaRepository<ItemType, Integer> {
       public ItemType findByName(String name);
}