package com.example.HardwareStore.repository;

import com.example.HardwareStore.domain.Hardware;
import com.example.HardwareStore.domain.ItemType;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface SpringDataHardwareRepository
        extends JpaRepository<Hardware, Integer>,
        JpaSpecificationExecutor<Hardware> {

    public ItemType findByName(String name);
    public List<Hardware> getHardwareByCode(String code);


}
