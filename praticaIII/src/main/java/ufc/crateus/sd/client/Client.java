package ufc.crateus.sd.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Car;
import proto.CarServiceGrpc;
import proto.CarServiceGrpc.CarServiceBlockingStub;
import proto.CreateCarRequest;
import proto.CreateCarResponse;
import proto.DeleteCarRequest;
import proto.DeleteCarResponse;
import proto.GetAllRequest;
import proto.GetAllResponse;
import proto.GetCarRequest;
import proto.GetCarResponse;
import proto.UpdateCarRequest;
import proto.UpdateCarResponse;


public class Client {
	
	private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
    private CarServiceBlockingStub client = CarServiceGrpc.newBlockingStub(channel);
    private CarServiceGrpc.CarServiceBlockingStub CarClient = CarServiceGrpc.newBlockingStub(channel);
	
	private JFrame frame;
	
	public static void main(String[] args) {
	    Client main = new Client();
	    
	    main.initialize();
	}
	 
	private void createCar(String nome, String marca, int anoFabricacao, int anoModelo, double preco) {
	
	    CreateCarResponse createCarResponse = client
	            .createCar(CreateCarRequest.newBuilder()
	      		.setNome(nome)
	       		.setMarca(marca)
	       		.setAnoFabricacao(anoFabricacao)
          		.setAnoModelo(anoModelo)
          		.setPreco(preco).build());
	     
	    System.out.println(createCarResponse.toString());
	        
	}
	
	private void updateCar(int id, String nome, String marca, int anoFabricacao, int anoModelo, double preco) {
	
		List<Car> cars = getAllCar();
		Car carTemp = cars.get(id);
	
		proto.Car car = Car.newBuilder().setNome(nome.isEmpty()? carTemp.getNome() : nome)
				.setMarca(marca.isEmpty()? carTemp.getMarca() : marca)
	       		.setAnoFabricacao(anoFabricacao == -1 ? carTemp.getAnoFabricacao() : anoFabricacao)
          		.setAnoModelo(anoModelo == -1 ? carTemp.getAnoModelo() : anoModelo)
          		.setPreco(preco == -1? carTemp.getPreco() : preco).build();
  	
		
		UpdateCarResponse updateCarResponse = client
				.updateCar(UpdateCarRequest.newBuilder().setCar(car).build());
	     
	    System.out.println(updateCarResponse.toString());
	}
	
	private List<Car> getAllCar() {
		GetAllResponse getAllResponse = client.getAll(GetAllRequest.newBuilder().build());
		//ListUserResponse listUserResponse = userClient.listUser(ListUserRequest.newBuilder().build());

		System.out.println(getAllResponse.getCarsList());
		JOptionPane.showMessageDialog(null,"Carros Cadastrados:\n" +getAllResponse.getCarsList());
		return getAllResponse.getCarsList();
	}
	
	private void getCar(int id) {
		
		GetCarResponse getCarResponse = CarClient.getCar(GetCarRequest.newBuilder()
				.setCarId(id).build());
		System.out.println(getCarResponse.getCar().toString());
		JOptionPane.showMessageDialog(null,"Carro: \n" +getCarResponse.getCar().toString());

	}
	
	private void deleteCar(int id) {
		DeleteCarResponse deleteCarResponse = client.deleteCar(DeleteCarRequest.newBuilder().setCarId(id).build());
		GetAllResponse getAllResponse = client.getAll(GetAllRequest.newBuilder().build());
		JOptionPane.showMessageDialog(null,"Carros Cadastrados:\n" +getAllResponse.getCarsList());

	}
	
	
	private void initialize() {
	    
		frame=new JFrame("Grpc");
		JPanel main =new JPanel();
	    JPanel top =new JPanel();
	    JPanel cn =new JPanel();
	    cn.setBounds(1, 1, 0, 0);
	    JPanel bottom =new JPanel();
	    JTextField id = new JTextField();
	    JTextField nome = new JTextField();
	    JTextField marca = new JTextField();
	    JTextField anoFabricacao = new JTextField();
	    JTextField anoModelo = new JTextField();
	    JTextField preco = new JTextField();
	    top.add(new JLabel("id: "));top.add(id); 
	    top.add(new JLabel("nome: "));top.add(nome); 
	    top.add(new JLabel("marca: "));top.add(marca); 
	    top.add(new JLabel("anoFabricacao: "));top.add(anoFabricacao); 
	    top.add(new JLabel("anoModelo"));top.add(anoModelo); 
	    top.add(new JLabel("preco: "));top.add(preco); 
	    main.setLayout(new BorderLayout(5,5));         
	    top.setLayout(new GridLayout(6,6,6,6));   
	    //cn.setLayout(new GridLayout(7,7,7,7));
	    bottom.setLayout(new BorderLayout(5,5));
	   
	    JButton bt1=new JButton("Criar");
	    JButton bt2=new JButton("Atualizar");
	    JButton bt3=new JButton("Listar");
	    JButton bt4=new JButton("get");
	    JButton bt5=new JButton("Deletar");
	    cn.add(bt1);
	    cn.add(bt2);
	    cn.add(bt3);
	    cn.add(bt4);
	    cn.add(bt5);
	    
	    main.add(top, BorderLayout.NORTH);
	    main.add(cn, BorderLayout.CENTER);
	    main.add(bottom, BorderLayout.SOUTH);
	    
	    frame.setContentPane(main);
	    frame.setSize(350,250);
	    frame.setVisible(true);  
	
	    
	    ////////////////////////////////////
	    
	   
	
	    bt1.addActionListener(new ActionListener(){
	    		@Override
				public void actionPerformed(ActionEvent e) {
					createCar(marca.getText(),
							marca.getText(), 
							Integer.parseInt(anoFabricacao.getText()),
							Integer.parseInt(anoModelo.getText()),
							Double.parseDouble(preco.getText()));			
				}				
	    });
	    
	    bt2.addActionListener(new ActionListener(){
	    	
	    
	 		
	    	@Override
			public void actionPerformed(ActionEvent e) {
	    		String tempAnoFabricacaoCar = "-1";
	    		String tempAnoModeloCar = "-1";
	    		String tempPrecoCar = "-1" ;
	    		
	    		
	    			try {
	    				tempAnoFabricacaoCar = 	anoFabricacao.getText();
	    			}
	    			catch (Exception NuilPointerException){
	    				tempAnoFabricacaoCar = "-1";
	    			}
	    		
	    			
	    			
	    		 
	    			try {
	    				tempAnoModeloCar = 	 anoModelo.getText();
	    			}
	    			catch (Exception NuilPointerException){
	    				tempAnoModeloCar = "-1";
	    			}
	    		
	    			
	    		
	    		if(preco.getText().isEmpty())
	    			tempPrecoCar = preco.getText();
	    		
	    		updateCar(Integer.parseInt(id.getText()), nome.getText(),
						marca.getText(), 
						Integer.parseInt(anoFabricacao.getText().isEmpty() ? "-1" : anoModelo.getText()),
						Integer.parseInt(anoModelo.getText().isEmpty() ? "-1" : anoModelo.getText()),
						Double.parseDouble(preco.getText().isEmpty() ? "-1" : preco.getText()));
	    	}
	    });
	
	    bt3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getAllCar();
				
			}
	    	
	    });
	    
	    bt4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getCar(Integer.parseInt(id.getText()));
				
			}
	    	
	    });
	    
	    bt5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				deleteCar(Integer.parseInt(id.getText()));
				
			}
	    	
	    });
	}

	
	
	    
}
