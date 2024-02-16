package a;
import java.util.Scanner;
public class oop {

	public static void main(String[] args) {
	System.out.println("hello world");
	Scanner a =new Scanner(System.in);
	
	int[] b= new int[10];
	for(int i = 0;i<10;i++) {
		b[i]=a.nextInt();
	}
	for(int i = 0;i<10;i++) {
		System.out.println(b[i]);
	}
	Sinhvien jung =new Sinhvien("cajung","bamuoi","london");
	System.out.println(jung.hovaten);
	Sinhvien minh = new Sinhvien();
	
	System.out.println(minh.diachi);
}
}
class Sinhvien {
	String hovaten;
	String tuoi;
	String diachi;
	public Sinhvien(String hovaten,String tuoi, String diachi) {
		this.hovaten=hovaten;
		this.tuoi=tuoi;
		this.diachi= diachi;
	}
	public Sinhvien() {};
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}

