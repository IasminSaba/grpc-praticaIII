package ufc.crateus.sd.repository;

import java.util.ArrayList;
import java.util.List;

import ufc.crateus.sd.model.Car;

public class CarsRepository {

	private List<Car> cars;
	private int cont;
	
	public CarsRepository() {
		cars = new ArrayList<>();
		cont = 0;
	}

	public Car add(Car car) {
		car.setId(cont++);
		cars.add(car);
		return car;
	}
	
	
	public Car update(Car car) {
		int id = car.getId();
		int index = cars.indexOf(car);
		cars.set(index, car);
		System.out.println("index = "+ index + "id= "+ id);
		return car;
		
	}
	
	public void delete(Car car) {
		int index = cars.indexOf(car);
		cars.remove(index);
		
	}
	
	public Car getById(int id) {
		for(Car c : cars) {
			if(c.getId() == id)
				return c;
		}
		return null;
	}
	
	public List<Car> getAll(){
		return cars;
	}
	
}
