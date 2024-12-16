package pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.response;

import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.dto.CarDto;

import java.util.List;

public record GetAllCarsResponse(String code,
                                 String error,
                                 List<CarDto> cars) {
}