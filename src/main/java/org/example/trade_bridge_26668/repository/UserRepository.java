package org.example.trade_bridge_26668.repository;

import org.example.trade_bridge_26668.model.Location;
import org.example.trade_bridge_26668.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    
    // existBy() method - checks if user exists by email
    boolean existsByEmail(String email);
    
    // Retrieve users by province code
    @Query("SELECT u FROM User u WHERE u.location.structureCode = :provinceCode AND u.location.structureType = 'PROVINCE'")
    List<User> findUsersByProvinceCode(@Param("provinceCode") String provinceCode);
    
    // Retrieve users by province name
    @Query("SELECT u FROM User u WHERE u.location.structureName = :provinceName AND u.location.structureType = 'PROVINCE'")
    List<User> findUsersByProvinceName(@Param("provinceName") String provinceName);
    
    // Pagination and sorting support
    @NonNull
    Page<User> findAll(@NonNull Pageable pageable);
    
    // Find users by location
    List<User> findByLocation(Location location);
}
