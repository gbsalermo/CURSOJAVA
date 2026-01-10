package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if( !checkOut.after(checkIn)) {
			throw new DomainException("Error inreservation: Check-out date must be after check-in date ");	
		}//Posso tratar as exceções no começo dos metodos
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//uso long que é o inteiro mais longo
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		//Agora uso o TimeUnit para converter o tempo em dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		 
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
	
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now)) {
			//Vou usar throw Exception illegalArgurmentException que ja existe no java
			throw new DomainException("Error inreservation: Check-out date must be after check-in date ");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	//toSString é sobreposição
	@Override
	public String toString() {
		return "Room "
				+  roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}

}
