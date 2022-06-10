package apolis.Day13_Part2;

public class ClassRoom {
	
	private Teacher instructor;
	private Student pupil;
	private int roomNumber;
	
	public ClassRoom(Teacher instructor) {
		this.instructor = instructor;
	}
	
	public ClassRoom(Student pupil) {
		this.pupil = pupil;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Student getPupil() {
		return pupil;
	}

	public void setPupil(Student pupil) {
		this.pupil = pupil;
	}

	@Override
	public String toString() {
		return "ClassRoom [instructor=" + instructor + ", pupil=" + pupil + ", roomNumber=" + roomNumber + "]";
	}
	
	

}
