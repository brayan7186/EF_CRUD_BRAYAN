package pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.service;

import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.dto.CarCreateDto;
import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.dto.CarDetailDto;
import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarDetail(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCar(int id) throws Exception;

    boolean createCar(CarCreateDto carCreateDto) throws Exception;

}
