package pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.response;

import pe.ede.cibertec.Mallma_Ccorimanya_Brayan_Isaac.dto.CarDetailDto;

public record GetCarDetailResponse(String code,
                                   String error,
                                   CarDetailDto carDetailDto) {
}