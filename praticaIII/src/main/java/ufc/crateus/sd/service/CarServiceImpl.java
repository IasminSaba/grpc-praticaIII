package ufc.crateus.sd.service;

import java.util.List;

import io.grpc.stub.StreamObserver;
import ufc.crateus.sd.model.*;
import ufc.crateus.sd.repository.CarsRepository;
import proto.CarServiceGrpc;
import proto.CreateCarRequest;
import proto.CreateCarResponse;
import proto.DeleteCarRequest;
import proto.DeleteCarResponse;
import proto.GetAllRequest;
import proto.GetAllResponse;

import proto.GetAllResponse.Builder;
import proto.GetCarRequest;
import proto.GetCarResponse;
import proto.UpdateCarRequest;
import proto.UpdateCarResponse;

public class CarServiceImpl extends CarServiceGrpc.CarServiceImplBase{
	
	CarsRepository cars = new CarsRepository(); 
	
	@Override
    public void createCar(CreateCarRequest request, StreamObserver<CreateCarResponse> responseObserver) {
        System.out.println("Creating c");
       
        Car car = new Car(request.getNome(),request.getMarca(), request.getAnoFabricacao(), 
        		request.getAnoModelo(), request.getPreco());
        car = cars.add(car);
        proto.Car carTemp = proto.Car.newBuilder().setId(car.getId())
        		.setNome(car.getNome())
        		.setMarca(car.getMarca())
        		.setAnoFabricacao(car.getAnoFabricacao())
        		.setAnoModelo(car.getAnoModelo())
        		.setPreco(car.getPreco()).build();
        
        //Car car = request.getCaList<Car> tempCars = cars.getAll();r();
        CreateCarResponse response = CreateCarResponse.newBuilder().setCar(carTemp).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
	
	
	public void updateCar(UpdateCarRequest request, StreamObserver<UpdateCarResponse> responseObserver) {
		
		proto.Car car = request.getCar();
		car = car.toBuilder().setId(car.getId()).setNome(car.getNome())
					.setMarca(car.getMarca())
					.setAnoFabricacao(car.getAnoFabricacao())
					.setAnoModelo(car.getAnoModelo())
					.setPreco(car.getPreco()).build();
		
		UpdateCarResponse response = UpdateCarResponse.newBuilder().setCar(car).build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
	
	public void getCar(GetCarRequest request, StreamObserver<GetCarResponse> responseObserver) {
	
		Car car = cars.getById(request.getCarId());
		proto.Car carTemp = proto.Car.newBuilder().setId(car.getId())
        		.setNome(car.getNome())
        		.setMarca(car.getMarca())
        		.setAnoFabricacao(car.getAnoFabricacao())
        		.setAnoModelo(car.getAnoModelo())
        		.setPreco(car.getPreco()).build();
		GetCarResponse response = GetCarResponse.newBuilder().setCar(carTemp).build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
	
	public void getAll(GetAllRequest request, StreamObserver<GetAllResponse> responseObserver) {
			
		responseObserver.onNext(temp().build());
        responseObserver.onCompleted();
	}
	
	public void deleteCar(DeleteCarRequest request, StreamObserver<DeleteCarResponse> responseObserver) {
		Car car = cars.getById(request.getCarId());
		proto.Car carTemp = proto.Car.newBuilder().setId(car.getId())
        		.setNome(car.getNome())
        		.setMarca(car.getMarca())
        		.setAnoFabricacao(car.getAnoFabricacao())
        		.setAnoModelo(car.getAnoModelo())
        		.setPreco(car.getPreco()).build();
		
		DeleteCarResponse response = DeleteCarResponse.newBuilder().setCarId(carTemp.getId()).build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
		
	}
	
	public Builder temp() {
		List<Car> tempCars = cars.getAll();
		GetAllResponse.Builder responseBuilder = GetAllResponse.newBuilder();

		for(Car car : tempCars) {
			proto.Car carTemp = proto.Car.newBuilder().setId(car.getId())
	        		.setNome(car.getNome())
	        		.setMarca(car.getMarca())
	        		.setAnoFabricacao(car.getAnoFabricacao())
	        		.setAnoModelo(car.getAnoModelo())
	        		.setPreco(car.getPreco()).build();
			responseBuilder.addCars(carTemp);
			
		}
		return responseBuilder;
	}
	
}











