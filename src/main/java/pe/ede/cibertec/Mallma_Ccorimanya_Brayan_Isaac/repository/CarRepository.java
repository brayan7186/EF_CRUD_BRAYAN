package pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    // Puedes agregar métodos personalizados si es necesario.
}